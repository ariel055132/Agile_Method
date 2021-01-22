package Agile;

import java.io.IOException;
import java.util.Scanner;

public class UserInterface {
    // Constructor
    public UserInterface() {

    }

    // Functions: promptID
    public String promptID() {
        String id = null;
        System.out.println("輸入ID或 Q (結束使用)？");
        Scanner sc = new Scanner(System.in);
        id = sc.next();
        return id;
    }

    // Functions: showFinishMsg
    public Boolean showFinishMsg() {
        System.out.println("結束了");
        return true;
    }

    // Functions: promptCommand
    public String promptCommand() {
        while(true) {
            System.out.println("輸入指令:\n" +
                               "1) G 顯示成績 (Grade)   \n" +
                               "2) R 顯示排名 (Rank)    \n" +
                               "3) W 更新配分 (Weight)  \n" +
                               "4) A 新增學生 (Add)     \n" +
                               "5) D 刪減學生 (Delete)  \n" +
                               "6) M 更改分數 (Modify)  \n" +
                               "7) E 離開選單 (Exit)" );
            Scanner sc = new Scanner(System.in);
            String command = sc.next();
            if (command.equals("G")){
                return command;
            } else if (command.equals("R")){
                return command;
            } else if (command.equals("W")){
                return command;
            } else if (command.equals("E")){
                return command;
            } else if (command.equals("A")){
                return command;
            } else if (command.equals("D")){
                return command;
            } else if (command.equals("M")){
                return command;
            } else {
                promptCommand();
            }
        }
    }

    // Functions: checkID(ID) Exceptions1, Exceptions2
    public boolean checkID(String ID) throws IDExceptions1, IDExceptions2 {
        int len = ID.length();
        if (len != 9) {
            throw new IDExceptions2();
        } else {
            for (int i = 0; i < len; i++) {
                if ((Character.isLetter(ID.charAt(i)) == true)) {
                    throw new IDExceptions1();
                }
            }
        }
        return true;
    }

    // Functions: showWelcomeMsg
    public boolean showWelcomeMsg(String ID) throws IOException {
        GradeSystems gradeSystems = new GradeSystems();
        System.out.println("Welcome " + gradeSystems.getName(ID));
        return true;
    }
}
