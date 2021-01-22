package Ex;

import Ex.Example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExampleTest {
    @Test
    @DisplayName("Should demonstrate a simple assertion")
    void test1() {
        Example example = new Example();
        int output = example.square(5);
        Assertions.assertEquals(25,output);
    }

    @Test
    void test2() {
        Example example = new Example();
        int output = example.countA("aaa123");
        Assertions.assertEquals(3,output);
    }
}
