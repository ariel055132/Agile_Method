package Agile;

//import jdk.internal.util.xml.impl.Input;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class GradeSystems {

    // Constructor
    Grades aGrade = new Grades();
    TreeMap<String, Grades> aTree = new TreeMap<String, Grades>();
    double weights[] = {0.1, 0.1, 0.1, 0.3, 0.4};

    public GradeSystems() throws IOException {
        //InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("/home/adrian/IdeaProjects/Agile_Method/src/main/java/Agile/gradeInput.txt"));
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("/home/adrian/IdeaProjects/Agile_Method/src/main/java/Agile/gradeInputMin.txt"));
        BufferedReader br = new BufferedReader(inputStreamReader);
        while(br.ready()) {
            String result = br.readLine();
            String[] data = result.split("\\s+");
            Grades grades = new Grades();
            Entry<String, Grades> anEntry;
            grades.name = data[1];
            // search string to int java
            grades.lab1 = Integer.parseInt(data[2]);
            grades.lab2 = Integer.parseInt(data[3]);
            grades.lab3 = Integer.parseInt(data[4]);
            grades.midtermExam = Integer.parseInt(data[5]);
            grades.finalExam = Integer.parseInt(data[6]);
            grades.totalGrade = grades.calculateTotalGrade(weights);
            anEntry = Map.entry(data[0], grades);
            aTree.put(anEntry.getKey(), anEntry.getValue());
        }inputStreamReader.close();
    }

    // Functions: getName
    public String getName(String ID) {
        return aTree.get(ID).name;
    }

    // Functions: containID (Exceptions3)
    public boolean containID(String ID) throws IDExceptions3 {
        if (aTree.containsKey(ID)) {
            return true;
        } else {
            throw new IDExceptions3();
        }
    }

    // Functions: showGrade(ID)
    public int showGrade(String ID) {
        Grades grades = aTree.get(ID);
        System.out.println(grades.name + "成績:");
        System.out.println("lab1         : " + grades.lab1);
        System.out.println("lab2         : " + grades.lab2);
        System.out.println("lab3         : " + grades.lab3);
        System.out.println("midterm exam : " + grades.midtermExam);
        System.out.println("final exam   : " + grades.finalExam);
        System.out.println("total grade  : " + grades.totalGrade);
        int sumGrade;
        sumGrade = grades.lab1 + grades.lab2 + grades.lab3 + grades.midtermExam + grades.finalExam;
        return sumGrade;
    }

    // Functions: showRank(ID)
    public int showRank(String ID) {
        int theTotalGrade = (int) aTree.get(ID).totalGrade;
        String name = aTree.get(ID).name;
        int rank = 1;
        Set set = aTree.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Entry me = (Entry) iterator.next();
            Grades grades = (Grades) me.getValue();
            int tmpTotalGrade = grades.totalGrade;
            if (tmpTotalGrade > theTotalGrade) {
                rank++;
            }
        }
        System.out.println(name + "排名第" + rank);
        return rank;
    }

    // New Functions: addStudents
    public boolean addStudents() {
        String id, name, command;
        int lab1, lab2, lab3, midExam, finalExam;
        Scanner scanner = new Scanner(System.in);
        System.out.print("輸入新增學生的ID ");
        id = scanner.next();
        System.out.println("輸入ID " + id + " 的姓名及成績");
        System.out.print("姓名         ");
        name = scanner.next();
        System.out.print("Lab1        ");
        lab1 = scanner.nextInt();
        System.out.print("Lab2        ");
        lab2 = scanner.nextInt();
        System.out.print("Lab3        ");
        lab3 = scanner.nextInt();
        System.out.print("Mid-term    ");
        midExam = scanner.nextInt();
        System.out.print("Final exam  ");
        finalExam = scanner.nextInt();
        System.out.println("確認新增學生 " + id + " 的姓名及成績");
        System.out.println("姓名         " + name);
        System.out.println("Lab1        " + lab1);
        System.out.println("Lab2        " + lab2);
        System.out.println("Lab3        " + lab3);
        System.out.println("Mid-term    " + midExam);
        System.out.println("Final exam  " + finalExam + " (yes/no)");
        command = scanner.next();
        if (command.equals("yes")) {
            Grades grades = new Grades();
            Set<Map.Entry<String, Grades>> anEntry = aTree.entrySet();
            grades.name = name;
            grades.lab1 = lab1;
            grades.lab2 = lab2;
            grades.lab3 = lab3;
            grades.midtermExam = midExam;
            grades.finalExam = finalExam;
            grades.totalGrade = grades.calculateTotalGrade(weights);
            aTree.put(id, grades);
            System.out.println("新增學生 " + id + " " + name + " 完成了");
        } else if (command.equals("no")){
            return false;
        }
        return true;
    }

    // New Functions: deleteStudents
    public boolean deleteStudents() throws IDExceptions3 {
        Scanner scanner = new Scanner(System.in);
        String id, command;
        System.out.print("刪減學生的ID ");
        id = scanner.next();
        if (containID(id) == true) {
            String name = getName(id);
            System.out.print("確認刪減學生 " + id + " " + name + " (yes/no) ");
            command = scanner.next();
            if (command.equals("yes")) {
                aTree.remove(id);
                System.out.println("刪減學生 " + id + " " + name + " 完成了");
            } else if (command.equals("no")) {
                return false;
            }
        }
        return true;
    }

    // New Functions: modifyScore()
    public boolean modifyScore() throws IDExceptions2, IDExceptions1, IOException, IDExceptions3 {
        String id = null;
        UserInterface userInterface = new UserInterface();
        GradeSystems gradeSystems = new GradeSystems();
        Scanner scanner = new Scanner(System.in);
        System.out.println("輸入更改分數學生的ID");
        id = scanner.next();
        if (userInterface.checkID(id) && gradeSystems.containID(id)) {
            String name = gradeSystems.getName(id);
            Grades grades = aTree.get(id);
            showGrade(id);
            String command = null;
            int newScore = 0;
            for (int i = 1; i <= 5; i++) {
                if (i <= 3) {
                    System.out.println("更改" + name + "lab" + i + "分數? (yes/no)");
                    command = scanner.next();
                    if (command.equals("yes")) {
                        System.out.println("輸入" + name + "Lab" + i + "新分數");
                        newScore = scanner.nextInt();
                        if (i == 1) {
                            grades.lab1 = newScore;
                        } else if (i == 2) {
                            grades.lab2 = newScore;
                        } else if (i == 3) {
                            grades.lab3 = newScore;
                        }
                        System.out.println(name + "新分數" + "Lab" + i + " " + newScore + "改好了");
                    }
                } else if (i == 4){
                    System.out.println("更改" + name + "Mid Term Exam " + "分數? (yes/no)");
                    command = scanner.next();
                    if (command.equals("yes")) {
                        System.out.println("輸入" + name + "Mid Term Exam 新分數");
                        newScore = scanner.nextInt();
                        grades.midtermExam = newScore;
                        System.out.println(name + "新分數" + "Mid Term Exam " + newScore + "改好了");
                    }
                } else if (i == 5) {
                    System.out.println("更改" + name + "Final Exam " + "分數? (yes/no)");
                    command = scanner.next();
                    if (command.equals("yes")) {
                        System.out.println("輸入" + name + "Final Exam 新分數");
                        newScore = scanner.nextInt();
                        grades.finalExam = newScore;
                        System.out.println(name + "新分數" + "Final Exam " + newScore + "改好了");
                    }
                }
                grades.totalGrade = grades.calculateTotalGrade(weights);
                System.out.println("更改分數 " + id + " " + name + " 完成了");
            }
        }
        return true;
    }

    // New Functions: writeFile
    public void writeFile() throws IOException {
        Set<Map.Entry<String, Grades>> anEntry = aTree.entrySet();
        FileWriter fileWriter = new FileWriter("/home/adrian/IdeaProjects/Agile_Method/src/main/java/Agile/gradeInputMin.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Map.Entry<String, Grades> it : anEntry) {
            String data = it.getKey() + " " + it.getValue().name + " " + it.getValue().lab1 + " " + it.getValue().lab2 + " " + it.getValue().lab3 + " " + it.getValue().midtermExam + " " + it.getValue().finalExam + "\n";
            bufferedWriter.write(data);
            bufferedWriter.flush();
        }
        bufferedWriter.close();
    }

    // Functions: updateWeights
    public boolean updateWeights() {
        showOldWeights();
        double[] newWeight = new double[5];
        newWeight = getNewWeights();
        setWeights(newWeight);
        Set<Entry<String,Grades>> set = aTree.entrySet();
        Iterator<Entry<String,Grades>> iterator = set.iterator();
        while(iterator.hasNext()) {
            Entry<String, Grades> anEntry = iterator.next();
            anEntry.getValue().totalGrade = anEntry.getValue().calculateTotalGrade(weights);
        }
        return true;
    }

    // Private Functions: showOldWeights
    private void showOldWeights() {
        System.out.println("舊配分");
        System.out.println("lab1          " + weights[0] * 100 + "%");
        System.out.println("lab2          " + weights[1] * 100 + "%");
        System.out.println("lab3          " + weights[2] * 100 + "%");
        System.out.println("midterm exam  " + weights[3] * 100 + "%");
        System.out.println("final exam    " + weights[4] * 100 + "%");
    }

    // Private Functions: getNewWeights
    private double[] getNewWeights() {
        Scanner scanner = new Scanner(System.in);
        double[] weight = new double[5];
        System.out.println("輸入新配分");
        System.out.print("lab1          ");
        weight[0] = scanner.nextInt();
        System.out.print("lab2          ");
        weight[1] = scanner.nextInt();
        System.out.print("lab3          ");
        weight[2] = scanner.nextInt();
        System.out.print("midterm exam  ");
        weight[3] = scanner.nextInt();
        System.out.print("final exam    ");
        weight[4] = scanner.nextInt();
        if (weight[0] + weight[1] + weight[2] + weight[3] + weight[4] != 100) {
            return getNewWeights();
        } else {
            System.out.println("請確認新配分");
            System.out.println("lab1          " + (int)weight[0] + "%");
            System.out.println("lab2          " + (int)weight[1] + "%");
            System.out.println("lab3          " + (int)weight[2] + "%");
            System.out.println("midterm exam  " + (int)weight[3] + "%");
            System.out.println("final exam    " + (int)weight[4] + "%");
            while(true) {
                System.out.println("以上正確嗎? Y (Yes) 或 N (No)");
                String command = scanner.next();
                if (command.equals("Y")) {
                    break;
                } else {
                    System.out.println("Please input again");
                    return getNewWeights();
                }
            }
        }
        return weight;
    }

    // Private Functions: setWeights
    private void setWeights(double[] newWeight) {
        for (int i = 0; i < 5; i++) {
            weights[i] = ((double)newWeight[i]) / 100;
        }
    }
}
