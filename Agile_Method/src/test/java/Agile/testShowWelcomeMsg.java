package Agile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class testShowWelcomeMsg {
    @Test
    @DisplayName("Welcome 凌宗廷\n")
    public void testShowWelcomeMsg1() throws IOException {
        /*用 setOut設定console output 為outContent */
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut (new PrintStream(outContent));

        /* 執行promptID return showWelcomeMsg傳送的信息*/
        UserInterface userInterface = new UserInterface();
        userInterface.showWelcomeMsg("962001044");

        /*預期promptID會顯示"Welcome 凌宗廷" */
        Assertions.assertEquals("Welcome 凌宗廷\n", outContent.toString());
    }

    @Test
    @DisplayName("Welcome 李威廷\n")
    public void testWelcomeMsg2() throws IOException{
        /*用 setOut設定console output 為outContent */
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut (new PrintStream(outContent));

        /* 執行promptID return showWelcomeMsg傳送的信息*/
        UserInterface userInterface = new UserInterface();
        userInterface.showWelcomeMsg("962001051");

        /*預期promptID會顯示"Welcome 李威廷" */
        Assertions.assertEquals("Welcome 李威廷\n", outContent.toString());
    }

    @Test
    @DisplayName("Welcome 王淳\n")
    public void testWelcomeMsg() throws IOException{
        /*用 setOut設定console output 為outContent */
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut (new PrintStream(outContent));

        /* 執行promptID return showWelcomeMsg傳送的信息*/
        UserInterface userInterface = new UserInterface();
        userInterface.showWelcomeMsg("985002016");

        /*預期promptID會顯示"Welcome 王淳" */
        Assertions.assertEquals("Welcome 王淳\n", outContent.toString());
    }
}
