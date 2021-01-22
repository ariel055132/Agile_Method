package Agile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class testDeleteStudents {
    @Test
    @DisplayName("Delete Success")
    public void testDeleteStudents1() throws IOException, IDExceptions3 {
        ByteArrayInputStream inContent = new ByteArrayInputStream("962001044\nyes".getBytes());
        System.setIn(inContent);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut (new PrintStream(outContent));
        GradeSystems gradeSystems = new GradeSystems();
        Boolean id = gradeSystems.deleteStudents();
        Assertions.assertEquals (true, id);
    }

    @Test
    @DisplayName("Does not delete")
    public void testDeleteStudents2() throws IOException, IDExceptions3 {
        ByteArrayInputStream inContent = new ByteArrayInputStream("962001044\nno".getBytes());
        System.setIn(inContent);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut (new PrintStream(outContent));
        GradeSystems gradeSystems = new GradeSystems();
        Boolean id = gradeSystems.deleteStudents();
        Assertions.assertEquals (true, id);
    }

    @Test
    @DisplayName("Exceptions 3 無這ID 錯了!")
    public void testDeleteStudents3() throws IOException, IDExceptions3 {
        ByteArrayInputStream inContent = new ByteArrayInputStream("123456789\nno".getBytes());
        System.setIn(inContent);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut (new PrintStream(outContent));
        GradeSystems gradeSystems = new GradeSystems();
        Throwable exception = Assertions.assertThrows(IDExceptions3.class, () -> gradeSystems.deleteStudents());
        Assertions.assertEquals("無這ID 錯了!", exception.getMessage());
    }
}
