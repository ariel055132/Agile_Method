package Agile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

public class testPromptCommand {
    @Test
    @DisplayName("Grade")
    public void testPromptCommand1() {
        /*用 setIn 設定console input 為inContent，使用者輸入的字串Q */
        ByteArrayInputStream inContent = new ByteArrayInputStream("G".getBytes());
        System.setIn(inContent);

        /* 執行promptID return使用者輸入的字串*/
        UserInterface userInterface = new UserInterface();
        String userInput = userInterface.promptCommand();

        Assertions.assertEquals("G", userInput);
    }

    @Test
    @DisplayName("Rank")
    public void testPromptCommand2() {
        /*用 setIn 設定console input 為inContent，使用者輸入的字串Q */
        ByteArrayInputStream inContent = new ByteArrayInputStream("R".getBytes());
        System.setIn(inContent);

        /* 執行promptID return使用者輸入的字串*/
        UserInterface userInterface = new UserInterface();
        String userInput = userInterface.promptCommand();

        Assertions.assertEquals("R", userInput);
    }

    @Test
    @DisplayName("Weight")
    public void testPromptCommand3() {
        /*用 setIn 設定console input 為inContent，使用者輸入的字串Q */
        ByteArrayInputStream inContent = new ByteArrayInputStream("W".getBytes());
        System.setIn(inContent);

        /* 執行promptID return使用者輸入的字串*/
        UserInterface userInterface = new UserInterface();
        String userInput = userInterface.promptCommand();

        Assertions.assertEquals("W", userInput);
    }

    @Test
    @DisplayName("Exit")
    public void testPromptCommand4() {
        /*用 setIn 設定console input 為inContent，使用者輸入的字串Q */
        ByteArrayInputStream inContent = new ByteArrayInputStream("E".getBytes());
        System.setIn(inContent);

        /* 執行promptID return使用者輸入的字串*/
        UserInterface userInterface = new UserInterface();
        String userInput = userInterface.promptCommand();

        Assertions.assertEquals("E", userInput);
    }

    @Test
    @DisplayName("Add")
    public void testPromptCommand5() {
        /*用 setIn 設定console input 為inContent，使用者輸入的字串Q */
        ByteArrayInputStream inContent = new ByteArrayInputStream("A".getBytes());
        System.setIn(inContent);

        /* 執行promptID return使用者輸入的字串*/
        UserInterface userInterface = new UserInterface();
        String userInput = userInterface.promptCommand();

        Assertions.assertEquals("A", userInput);
    }

    @Test
    @DisplayName("Delete")
    public void testPromptCommand6() {
        /*用 setIn 設定console input 為inContent，使用者輸入的字串Q */
        ByteArrayInputStream inContent = new ByteArrayInputStream("D".getBytes());
        System.setIn(inContent);

        /* 執行promptID return使用者輸入的字串*/
        UserInterface userInterface = new UserInterface();
        String userInput = userInterface.promptCommand();

        Assertions.assertEquals("D", userInput);
    }

    @Test
    @DisplayName("Modify")
    public void testPromptCommand7() {
        /*用 setIn 設定console input 為inContent，使用者輸入的字串Q */
        ByteArrayInputStream inContent = new ByteArrayInputStream("M".getBytes());
        System.setIn(inContent);

        /* 執行promptID return使用者輸入的字串*/
        UserInterface userInterface = new UserInterface();
        String userInput = userInterface.promptCommand();

        Assertions.assertEquals("M", userInput);
    }
}
