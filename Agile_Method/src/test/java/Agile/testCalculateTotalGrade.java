package Agile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testCalculateTotalGrade {
    Grades grades = new Grades();


    @Test
    public void testCalculateTotalGrade1() {
        grades.lab1 = 81;
        grades.lab2 = 98;
        grades.lab3 = 84;
        grades.midtermExam = 90;
        grades.finalExam = 93;
        double[] w = {0.1, 0.1, 0.1, 0.3, 0.4};
        int g = grades.calculateTotalGrade(w);
        Assertions.assertEquals(g, 91);
    }

    @Test
    public void testCalculateTotalGrade2() {
        grades.lab1 = 81;
        grades.lab2 = 98;
        grades.lab3 = 84;
        grades.midtermExam = 90;
        grades.finalExam = 93;
        double[] w = {0.2, 0.2, 0.2, 0.2, 0.2};
        int g = grades.calculateTotalGrade(w);
        Assertions.assertEquals(g, 89);
    }

    @Test
    public void testCalculateTotalGrade3() {
        grades.lab1 = 81;
        grades.lab2 = 98;
        grades.lab3 = 84;
        grades.midtermExam = 90;
        grades.finalExam = 93;
        double[] w = {0.1, 0.1, 0.0, 0.4, 0.4};
        int g = grades.calculateTotalGrade(w);
        Assertions.assertEquals(g, 91);
    }
}
