package Agile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class testShowRank {
    @Test
    @DisplayName("凌宗廷")
    public void testShowRank1() throws IOException {
        /*用 setOut設定console output 為outContent */
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut (new PrintStream(outContent));

        /* 執行promptID return showRank傳送的信息*/
        GradeSystems gradeSystems = new GradeSystems();
        gradeSystems.showRank("962001044");

        /*預期promptID會顯示"凌宗廷排名第38" */
        Assertions.assertEquals("凌宗廷排名第38\n", outContent.toString());
        Assertions.assertEquals(38, gradeSystems.showRank("962001044"));
    }

    @Test
    @DisplayName("李威廷")
    public void testShowRank2() throws IOException{
        /*用 setOut設定console output 為outContent */
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut (new PrintStream(outContent));

        /* 執行promptID return showRank傳送的信息*/
        GradeSystems gradeSystems = new GradeSystems();
        gradeSystems.showRank("962001051");

        /*預期promptID會顯示"李威廷排名第22" */
        Assertions.assertEquals("李威廷排名第22\n", outContent.toString());
        Assertions.assertEquals(22, gradeSystems.showRank("962001051"));
    }

    @Test
    @DisplayName("許文馨")
    public void testShowRank3() throws IOException{
        /*用 setOut設定console output 為outContent */
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut (new PrintStream(outContent));

        /* 執行promptID return showRank傳送的信息*/
        GradeSystems gradeSystems = new GradeSystems();
        gradeSystems.showRank("955002056");

        /*預期promptID會顯示"許文馨排名第9" */
        Assertions.assertEquals("許文馨排名第9\n", outContent.toString());
        Assertions.assertEquals(9, gradeSystems.showRank("955002056"));
    }

    @Test
    @DisplayName("蘇亨玠")
    public void testShowRank4() throws IOException{
        /*用 setOut設定console output 為outContent */
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut (new PrintStream(outContent));

        /* 執行promptID return showRank傳送的信息*/
        GradeSystems gradeSystems = new GradeSystems();
        gradeSystems.showRank("965002038");

        /*預期promptID會顯示"蘇亨玠排名第60" */
        Assertions.assertEquals("蘇亨玠排名第60\n", outContent.toString());
        Assertions.assertEquals(60, gradeSystems.showRank("965002038"));
    }
}
