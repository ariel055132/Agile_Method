package Agile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class testShowGrade {
    @Test
    @DisplayName("凌宗廷")
    public void testShowGrade1() throws IOException {
        /*用 setOut設定console output 為outContent */
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut (new PrintStream(outContent));

        /* 執行promptID return showGrade傳送的信息*/
        GradeSystems gradeSystems = new GradeSystems();
        gradeSystems.showGrade("962001044");

        /*預期promptID會顯示"凌宗廷的分數，和他5個成績的sum" */
        /*預期5個成績的sum是446 = 87+86+98+88+87 */
        Assertions.assertEquals("凌宗廷成績:\n" + "lab1         : 87\n" + "lab2         : 86\n" + "lab3         : 98\n" + "midterm exam : 88\n" + "final exam   : 87\n" + "total grade  : 88\n", outContent.toString());
        Assertions.assertEquals(446, gradeSystems.showGrade("962001044"));
    }

    @Test
    @DisplayName("蘇亮")
    public void testShowGrade2() throws IOException {
        /*用 setOut設定console output 為outContent */
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut (new PrintStream(outContent));

        /* 執行promptID return showGrade傳送的信息*/
        GradeSystems gradeSystems = new GradeSystems();
        gradeSystems.showGrade("985002201");

        /*預期promptID會顯示"蘇亮的分數，和他5個成績的sum" */
        /*預期5個成績的sum是446 = 87+86+98+88+87 */
        Assertions.assertEquals("蘇亮成績:\n" + "lab1         : 81\n" + "lab2         : 91\n" + "lab3         : 85\n" + "midterm exam : 84\n" + "final exam   : 90\n" + "total grade  : 87\n", outContent.toString());
        Assertions.assertEquals(446, gradeSystems.showGrade("962001044"));
    }
}
