package ncu.cs.agile;

import java.io.IOException;
import java.util.Scanner;

/* ********************************************
 * class UI (user interface) aUI�B�z�ϥάɭ�
 * 
 * checkID(ID) �ˬdID�O�_���T
 * promptCommand() �߰ݫ��O
 * promptID() �߰�ID
 * showFinishMsg()
 * showWelcomeMsg(ID)
 * UI()  �غc aUI  (constructor)
 * �[�J aGradeSystem Object
 * ********************************************/

public class UI {
	// constructor
	public UI() {

	}
	
	/*----------------------------------------------------------------------------------------------------------
	checkID(ID) throws IDExceptions1, IDExceptions2

	exception: IDExceptions1  print ���oID�t�r�� ���F!��
	           IDExceptions2  print ���oID���פ��� ���F!��
	return: boolean
	
	1.	if a char in ID isLetter then throw an IDExceptions1 object end if
	2.	if length of ID not equal 9 then throw an IDExceptions2 object end if
	3.	return true
	-------------------------------------------------------------------------------------------------------------- */
	public boolean checkID(String ID) throws IDExceptions1, IDExceptions2{
		int len = ID.length();
		for(int i = 0;i < len; i++) {
			if((Character.isLetter(ID.charAt(i)) == true)) {
				throw new IDExceptions1();
			}else if(len != 9) {
				throw new IDExceptions2();
			}
		}
		return true; 
	}
	
	/*-------------------------------------------------------------------------------------------------------------
	promptCommand () �߰ݫ��O
	return: command  G (Grade), R (Rank), W (Weights), or E (Exit)
	
	1.loop 
		prompt user for a command
	  until command is G (Grade),R (Rank), W (Weights), or E (Exit),
	2.return command
	-----------------------------------------------------------------------------------------------------------------*/
	public String promptCommand() {
		while(true) {
			System.out.println("��J���O:\n" +
		                       "1) G ��ܦ��Z (Grade)   \n" + 
					           "2) R ��ܱƦW (Rank)    \n" + 
		                       "3) W ��s�t�� (Weights)  \n" +
					           "4) E ���}��� (Exit)" );
			
			Scanner sc = new Scanner(System.in);
			String comm = sc.next();
			if(comm.equals("E")) {
				return comm;
			}else if(comm.equals("G")) {
				return comm;
			}else if(comm.equals("R")) {
				return comm;
			}else if(comm.equals("W")) {
				return comm;
			}else {
				promptCommand();
			}
			/* Use the following will cause java.util.NoSuchElementException error
			if(comm.equals("E") || comm.equals("G") || comm.equals("R") || comm.equals("W")) {
				return comm;
			}else {
				promptCommand();
			}
			*/
		}
	}
	
	/*-----------------------------------------------------------------------------------------------------------
	promptID()  �߰�ID
	return: ID  
	
	1.	print ����JID�� Q (�����ϥ�)�H��
	2.	read line, save it as ID return ID
	----------------------------------------------------------------------------------------------------------------*/
	public String promptID() {
		String id = null;
		System.out.println("��JID�� Q (�����ϥ�)�H");
		Scanner sc = new Scanner(System.in);
		id = sc.next();
		return id;
	}
	
	// written by myself
	/*-----------------------------------------------------------------------------------------------------------
	 * showFinishMsg() �O�_����ܥX�����T��
	 * return boolean
	 * 
	 * 1.print ����JID�� Q (�����ϥ�)�H��
	 * 2.user ��J Q(�����ϥ�)
	 * 3.��ܥX�����T�� 
	 -----------------------------------------------------------------------------------------------------------*/
	public boolean showFinishMsg() {
		System.out.println("�����F");
		return true;
	}
	
	// written by myself
	/*-----------------------------------------------------------------------------------------------------------
	 * showWelcomeMsg(String ID) 
	 * call GradeSystems aGS
	 * aGS.getName(ID)
	 * return boolean
	 * ��ܥXID�������W�r�M�w��H��
	-----------------------------------------------------------------------------------------------------------*/
	public boolean showWelcomeMsg(String ID) throws IOException{
		GradeSystems aGS = new GradeSystems();	
		System.out.println("Welcome " + aGS.getName(ID));
		return true;
	}
}
