package Agile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class testModifyScore {
    @Test
    @DisplayName("Success")
    public void testModifyScore1() throws IOException, IDExceptions2, IDExceptions1, IDExceptions3 {
        ByteArrayInputStream inContent = new ByteArrayInputStream("962001051\nyes\n90\nno\nno\nno\nno\nyes".getBytes());
        System.setIn(inContent);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut (new PrintStream (outContent));
        GradeSystems gradeSystems = new GradeSystems();
        Boolean added = gradeSystems.modifyScore();
        Assertions.assertEquals (true, added);
    }

    @Test
    @DisplayName("Exceptions 1 這ID含字母 錯了!")
    public void testModifyScore2() throws IOException, IDExceptions2, IDExceptions1, IDExceptions3{
        ByteArrayInputStream inContent = new ByteArrayInputStream("96200a051\nyes\n90\nno\nno\nno\nno\nyes".getBytes());
        System.setIn(inContent);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut (new PrintStream (outContent));
        GradeSystems gradeSystems = new GradeSystems();
        Throwable exception = Assertions.assertThrows(IDExceptions1.class, () -> gradeSystems.modifyScore());
        Assertions.assertEquals("這ID含字母 錯了!", exception.getMessage());
    }

    @Test
    @DisplayName("Exceptions 2 這ID長度不對 錯了!")
    public void testModifyScore3() throws IOException {
        ByteArrayInputStream inContent = new ByteArrayInputStream("96200105\nyes\n90\nno\nno\nno\nno\nyes".getBytes());
        System.setIn(inContent);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut (new PrintStream (outContent));
        GradeSystems gradeSystems = new GradeSystems();
        Throwable exception = Assertions.assertThrows(IDExceptions2.class, () -> gradeSystems.modifyScore());
        Assertions.assertEquals("這ID長度不對 錯了!", exception.getMessage());
    }

    @Test
    @DisplayName("Exceptions 3 無這ID 錯了!")
    public void testModifyScore4() throws IOException {
        ByteArrayInputStream inContent = new ByteArrayInputStream("123456789\nyes\n90\nno\nno\nno\nno\nyes".getBytes());
        System.setIn(inContent);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut (new PrintStream (outContent));
        GradeSystems gradeSystems = new GradeSystems();
        Throwable exception = Assertions.assertThrows(IDExceptions3.class, () -> gradeSystems.modifyScore());
        Assertions.assertEquals("無這ID 錯了!", exception.getMessage());
    }
}
