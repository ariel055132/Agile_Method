package Agile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class testGradeSystems {
    @Test
    @DisplayName("Constructor")
    public void testGradeSystem1() throws IOException {
        Assertions.assertNotNull(new GradeSystems());
    }

    @Test
    @DisplayName("Name 962001044")
    public void testGradeSystem2() throws IOException{
        GradeSystems gradeSystems = new GradeSystems();
        Assertions.assertEquals("凌宗廷", gradeSystems.aTree.get("962001044").name);
    }

    @Test
    @DisplayName("Lab1 962001044")
    public void testGradeSystem3() throws IOException{
        GradeSystems gradeSystems = new GradeSystems();
        Assertions.assertEquals(87, gradeSystems.aTree.get("962001044").lab1);
    }

    @Test
    @DisplayName("Lab2 962001044")
    public void testGradeSystem4() throws IOException{
        GradeSystems gradeSystems = new GradeSystems();
        Assertions.assertEquals(86, gradeSystems.aTree.get("962001044").lab2);
    }

    @Test
    @DisplayName("Lab3 962001044")
    public void testGradeSystem5() throws IOException{
        GradeSystems gradeSystems = new GradeSystems();
        Assertions.assertEquals(98, gradeSystems.aTree.get("962001044").lab3);
    }

    @Test
    @DisplayName("Midterm 962001044")
    public void testGradeSystem6() throws IOException{
        GradeSystems gradeSystems = new GradeSystems();
        Assertions.assertEquals(88, gradeSystems.aTree.get("962001044").midtermExam);
    }

    @Test
    @DisplayName("Final 962001044")
    public void testGradeSystem7() throws IOException {
        GradeSystems gradeSystems = new GradeSystems();
        Assertions.assertEquals(87, gradeSystems.aTree.get("962001044").finalExam);
    }

    @Test
    @DisplayName("Total 962001044")
    public void testGradeSystem8() throws IOException{
        GradeSystems gradeSystems = new GradeSystems();
        Assertions.assertEquals(88, gradeSystems.aTree.get("962001044").totalGrade);
    }

    @Test
    @DisplayName("Name 985002201")
    public void testGradeSystem9() throws IOException{
        GradeSystems gradeSystems = new GradeSystems();
        Assertions.assertEquals("蘇亮", gradeSystems.aTree.get("985002201").name);
    }

    @Test
    @DisplayName("Name 995002901")
    public void testGradeSystem10() throws IOException{
        GradeSystems gradeSystems = new GradeSystems();
        Assertions.assertEquals("舒晨馨", gradeSystems.aTree.get("995002901").name);
    }

    @Test
    @DisplayName("Lab1 995002901")
    public void testGradeSystem11() throws IOException{
        GradeSystems gradeSystems = new GradeSystems();
        Assertions.assertEquals(82, gradeSystems.aTree.get("995002901").lab1);
    }

    @Test
    @DisplayName("Lab2 995002901")
    public void testGradeSystem12() throws IOException{
        GradeSystems gradeSystems = new GradeSystems();
        Assertions.assertEquals(90, gradeSystems.aTree.get("995002901").lab2);
    }

    @Test
    @DisplayName("Lab3 995002901")
    public void testGradeSystem13() throws IOException{
        GradeSystems gradeSystems = new GradeSystems();
        Assertions.assertEquals(85, gradeSystems.aTree.get("995002901").lab3);
    }

    @Test
    @DisplayName("Mid term 995002901")
    public void testGradeSystem14() throws IOException{
        GradeSystems gradeSystems = new GradeSystems();
        Assertions.assertEquals(84, gradeSystems.aTree.get("995002901").midtermExam);
    }

    @Test
    @DisplayName("Final 995002901")
    public void testGradeSystem15() throws IOException{
        GradeSystems gradeSystems = new GradeSystems();
        Assertions.assertEquals(93, gradeSystems.aTree.get("995002901").finalExam);
    }
}
