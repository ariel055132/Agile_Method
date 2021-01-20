package ncu.cs.agile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/* *******************************
 * class GradeSystems  
 * aGradeSystem�x�sa tree of anEntry objects with key ID and value aGrade
 * 
 * containID (ID)  returns boolean // ��aGradeSystem���_�t��ID (���`3�G�L�oID)
 * getName(ID) returns String
 * GradeSystems () �غc aGradeSystem �]Constructor)
 * showGrade (ID)  ��ܤ���
 * showRank (ID)   ��ܱƦW
 * updateWeights ()  ��s�����v��
 * *******************************/

/*
public GradeSystems ()  //�غc aGradeSystem

1. �}�� input file ��gradeInput.txt��
2. ��Java TreeMap�غca tree of anEntry(key, value) objects�s aTree
3. read line
4. while not endOfFile
1. call Grades() �غcaGrade
2. call Entry()  �غc anEntry
3. ��Java Scanner scan line,ID�skey ��l�saGrade(value) (key,value)�YanEntry
4. aGrade call calculateTotalGrade(weights) return aTotalGrade�⥦�s�JaGrade
5. �� anEntry �s�J aTree
     end while  
*/

public class GradeSystems {
	// Constructor
	Grades aGrade = new Grades();
	TreeMap<String, Grades> aTree = new TreeMap<String, Grades>();
	double weights[] = {0.1, 0.1, 0.1, 0.3, 0.4};
	
	public GradeSystems() throws IOException {	
		InputStreamReader isr = new InputStreamReader(new FileInputStream(".\\src\\ncu\\cs\\agile\\gradeInput.txt"), "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		while(br.ready()) {
			String result = br.readLine();
			String[] data = result.split("\\s+");
			Grades aGrade = new Grades();
			Entry<String,Grades> anEntry;
			aGrade.name = data[1];
			aGrade.lab1 = Integer.parseInt(data[2]);
			aGrade.lab2 = Integer.parseInt(data[3]);
			aGrade.lab3 = Integer.parseInt(data[4]);
			aGrade.midtermExam = Integer.parseInt(data[5]);
			aGrade.finalExam = Integer.parseInt(data[6]);
			aGrade.totalGrade = aGrade.calculateTotalGrade(weights);
			anEntry = Map.entry(data[0], aGrade);
			aTree.put(anEntry.getKey(), anEntry.getValue());
		}isr.close();
	}
	
	/*-------------------------------------------------------------------------------------------------------------
	 * containID(ID)  ��aGradeSystem�O�_�t��ID
	 * 
	 * parameter:ID   aUser ID  ex: 123456789
	 * exception: IDExceptions3   print ���L�oID ���F!��
	 * return: boolean
     * time:  O(log n)  n is aGradeSystem �����Z�H��
	 * 
	 * 1.for anEntry in aTree 
     *	   if ID���� ID of anEntry then return true 
     *     end if 
  	 *   end for 
	 * 2.throw an IDExceptions3 object
	 -----------------------------------------------------------------------------------------------------------------*/
	public boolean containID(String ID) throws IDExceptions3{
		if (aTree.containsKey(ID)) {
			return true;
		}else {
			throw new IDExceptions3();
		}
	}
	
	/*----------------------------------------------------------------------------------------------------------------------------
	showGrade(ID)  show �� ID �� lab1, lab2, lab3, midtermExam, finalExam score 
	parameter:ID   aUser ID  ex: 123456789
	
	for anEntry in aTree
	  if ID���� ID of anEntry then return  lab1, lab2, lab3, midtermExam, finalExam score 
	  end if 
	end for
	----------------------------------------------------------------------------------------------------------------------------*/
	public int showGrade(String ID) {
		Grades aGrade = aTree.get(ID);
		System.out.println(aGrade.name + "���Z:");
		System.out.println("lab1         : " + aGrade.lab1);
		System.out.println("lab2         : " + aGrade.lab2);
		System.out.println("lab3         : " + aGrade.lab3);
		System.out.println("midterm exam : " + aGrade.midtermExam);
		System.out.println("final exam   : " + aGrade.finalExam);
		System.out.println("total grade  : " + aGrade.totalGrade);
		int testCaseTotalGrade = aGrade.lab1 + aGrade.lab2 + aGrade.lab3 + aGrade.midtermExam + aGrade.finalExam;
		return testCaseTotalGrade;
		/*
		Set set = aTree.entrySet();
		Iterator i = set.iterator();
		String name = null;
		int totalGrade = 0;
		while(i.hasNext()) {
			Entry me = (Entry)i.next();
			//System.out.println(me.getKey());
			if(me.getKey().equals(ID)) {
			    Grades g = (Grades)(me.getValue());
			    System.out.println(g.name + "���Z:");
			    System.out.println("lab1:          " + g.lab1);
			    System.out.println("lab2:          " + g.lab2);
			    System.out.println("lab3:          " + g.lab3);
			    System.out.println("midterm exam:  " + g.midtermExam);
			    System.out.println("final exam:    " + g.finalExam);
			    System.out.println("total grade:   " + g.totalGrade);
			    totalGrade = g.lab1 + g.lab2 + g.lab3 + g.midtermExam + g.finalExam;
			    //System.out.println(totalGrade);
			}	
		}
		return totalGrade;
		*/
	}
	
	/*----------------------------------------------------------------------------------------------------------------------------
	showRank(ID)  show �� ID�� rank
	parameter:ID   aUser ID  ex: 123456789
	
	1. ���o�o ID �� theTotalGrade
	2. �Orank �� 1 
	3. for anEntry in aTree 
		 if aTotalGrade > theTotalGrade then rank�[1(�h1�W) end if 
	   end for
	4. return rank
	----------------------------------------------------------------------------------------------------------------------------*/
	public int showRank(String ID) {
		int theTotalGrade = (int) aTree.get(ID).totalGrade;
		String name = aTree.get(ID).name;
		int rank = 1;
		Set set = aTree.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext()) {
			Entry me = (Entry)i.next();
			Grades g = (Grades)me.getValue();
			int aTotalGrade = g.totalGrade;
			if(aTotalGrade > theTotalGrade) {
				rank++;
			}
		}
		System.out.println(name + "�ƦW��" + rank);
		return rank;
	}
	
	/*----------------------------------------------------------------------------------------------------------------------------
	updateWeights () ��sweights
	return boolean
	
	1. showOldWeights() //�`�N�G���T�Ӭ�private methods�A�G���ݰ� test code
	2. getNewWeights() 
	3. setWeights(weights)
	4. for anEntry in aGradeSystem calculateTotalGrade(weights) & save it end for
	5. return true
	end class GradeSystems
	----------------------------------------------------------------------------------------------------------------------------*/
	public boolean updateWeights() {
		showOldWeights();
		double[] weight_tmp = new double[5];
		weight_tmp = getNewWeights();
		setWeights(weight_tmp);
		Set<Entry<String,Grades>> set = aTree.entrySet();
		Iterator<Entry<String,Grades>> i = set.iterator();
		while(i.hasNext()) {
			Entry<String, Grades> anEntry = i.next();
			anEntry.getValue().totalGrade = anEntry.getValue().calculateTotalGrade(weights);
			//System.out.print(((Grades)(me.getValue())).totalGrade = ((Grades)(me.getValue())).calculateTotalGrade(weights););
		}
		return true;
	}
	
	private void showOldWeights() {
		System.out.println("�°t��");
		System.out.println("lab1          " + weights[0]*100 + "%");
		System.out.println("lab2          " + weights[1]*100 + "%");
		System.out.println("lab3          " + weights[2]*100 + "%");
		System.out.println("midterm exam  " + weights[3]*100 + "%");
		System.out.println("final exam    " + weights[4]*100 + "%");
		//getNewWeights();
	}
	
	private double[] getNewWeights() {
		Scanner sc = new Scanner(System.in);
		double[] weight = new double[5];
		System.out.println("��J�s�t��");
		System.out.print("lab1          ");
		weight[0] = sc.nextInt();
		System.out.print("lab2          ");
		weight[1] = sc.nextInt();
		System.out.print("lab3          ");
		weight[2] = sc.nextInt();
		System.out.print("midterm exam  ");
		weight[3] = sc.nextInt();
		System.out.print("final exam    ");
		weight[4] = sc.nextInt();
		if(weight[0] + weight[1] + weight[2] + weight[3] + weight[4] != 100) {
			return getNewWeights();
		}else {
			System.out.println("�нT�{�s�t��");
			System.out.println("lab1          " + (int)weight[0] + "%");
			System.out.println("lab2          " + (int)weight[1] + "%");
			System.out.println("lab3          " + (int)weight[2] + "%");
			System.out.println("midterm exam  " + (int)weight[3] + "%");
			System.out.println("final exam    " + (int)weight[4] + "%");
			while(true) {
				System.out.println("�H�W���T��? Y (Yes) �� N (No)");
				String comm = sc.next();
				if (comm.equals("Y")) {
					break;
				}else {
					System.out.println("Please input again");
					return getNewWeights();
				}
			}
		}
		return weight;
	}
	
	private void setWeights(double[] w) {
		for (int i = 0; i < 5;i++) {
			weights[i] = ((double)w[i])/100;
		}
	}
	/* --------------------------------------------
	 * getName(ID)
	 * According to the ID, return the corresponding name (String)
	 * --------------------------------------------
	 */
	public String getName(String ID) {
		return aTree.get(ID).name;
	}
}
