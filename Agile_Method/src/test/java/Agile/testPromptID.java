package Agile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

// testPromptID1 --> test with input Q
// testPromptID2 --> test with 凌宗廷's ID (962001044)

public class testPromptID {
    @Test
    public void testPromptID1() {
        /*用 setIn 設定console input 為inContent，使用者輸入的字串Q */
        ByteArrayInputStream inContent = new ByteArrayInputStream("Q".getBytes());
        System.setIn(inContent);

        /*用 setOut設定console output 為outContent */
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut (new PrintStream(outContent));

        /* 執行promptID return使用者輸入的字串*/
        UserInterface userInterface = new UserInterface();
        String userInput = userInterface.promptID();

        /*預期promptID會顯示"輸入ID或 Q (結束使用)？" */
        /*預期user input是Q */
        Assertions.assertEquals("輸入ID或 Q (結束使用)？\n", outContent.toString());
        Assertions.assertEquals("Q", userInput);
    }

    @Test
    public void testPromptID2() {
        /*用 setIn 設定console input 為inContent，使用者輸入的字串962001044 */
        ByteArrayInputStream inContent = new ByteArrayInputStream("962001044".getBytes());
        System.setIn(inContent);

        /*用 setOut設定console output 為outContent */
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut (new PrintStream(outContent));

        /* 執行promptID return使用者輸入的字串*/
        UserInterface userInterface = new UserInterface();
        String userInput = userInterface.promptID();

        /*預期promptID會顯示"輸入ID或 Q (結束使用)？" */
        /*預期user input是962001044  */
        Assertions.assertEquals("輸入ID或 Q (結束使用)？\n", outContent.toString());
        Assertions.assertEquals("962001044", userInput);
    }
}
