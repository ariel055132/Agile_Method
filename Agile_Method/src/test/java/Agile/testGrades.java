package Agile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testGrades {
    // Test the constructor is existed or not.
    @Test
    public void testGrade() {
        Assertions.assertNotNull(new Grades());
    }
}
