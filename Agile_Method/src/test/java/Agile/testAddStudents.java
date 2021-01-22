package Agile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class testAddStudents {
    @Test
    @DisplayName("Add successfully")
    public void testAddStudents1() throws IOException {
        ByteArrayInputStream inContent = new ByteArrayInputStream("995002904\n張一二\n90\n70\n80\n60\n50\nyes".getBytes());
        System.setIn(inContent);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut (new PrintStream(outContent));
        GradeSystems gradeSystems = new GradeSystems();
        Boolean added = gradeSystems.addStudents();
        Assertions.assertEquals(true, added);
    }

    @Test
    @DisplayName("Not add")
    public void testAddStudents2() throws IOException {
        ByteArrayInputStream inContent = new ByteArrayInputStream("995002904\n張一二\n90\n70\n80\n60\n50\nno".getBytes());
        System.setIn(inContent);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut (new PrintStream(outContent));
        GradeSystems gradeSystems = new GradeSystems();
        Boolean added = gradeSystems.addStudents();
        Assertions.assertEquals(false, added);
    }
}
