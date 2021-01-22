package Agile;

import java.io.IOException;
import java.util.Objects;

public class Main extends Object {
    public static void main(String[] args) throws IOException {
        UserInterface userInterface = new UserInterface();
        GradeSystems gradeSystems = new GradeSystems();
        while (true) {
            String id = userInterface.promptID();
            if (id.equals("Q")) {
                userInterface.showFinishMsg();
                break;
            } else {
                try {
                    userInterface.checkID(id);
                    gradeSystems.containID(id);
                    userInterface.showWelcomeMsg(id);
                    while (true) {
                        String command = userInterface.promptCommand();
                        if (command.equals("E")) {
                            gradeSystems.writeFile();
                            break;
                        } else if (command.equals("G")) {
                            gradeSystems.showGrade(id);
                        } else if (command.equals("W")) {
                            gradeSystems.updateWeights();
                        } else if (command.equals("R")) {
                            gradeSystems.showRank(id);
                        } else if (command.equals("A")) {
                            gradeSystems.addStudents();
                        } else if (command.equals("D")) {
                            gradeSystems.deleteStudents();
                        } else if (command.equals("M")) {
                            gradeSystems.modifyScore();
                        }
                    }
                } catch (IDExceptions1 exceptions1) {
                    System.out.println("這ID含字母 錯了!");
                } catch (IDExceptions2 exceptions2) {
                    System.out.println("這ID長度不對 錯了!");
                } catch (IDExceptions3 exceptions3) {
                    System.out.println("無這ID 錯了!");
                }
            }
        }

    }
}
