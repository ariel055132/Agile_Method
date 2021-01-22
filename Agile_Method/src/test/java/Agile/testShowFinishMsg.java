package Agile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class testShowFinishMsg {
    @Test
    public void testShowFinishMessage() {
        /*用 setOut設定console output 為outContent */
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut (new PrintStream(outContent));

        /* 執行promptID return showFinishMsg傳送的信息*/
        UserInterface userInterface = new UserInterface();
        userInterface.showFinishMsg();

        /*預期promptID會顯示"結束了" */
        Assertions.assertEquals("結束了\n", outContent.toString());
    }
}
