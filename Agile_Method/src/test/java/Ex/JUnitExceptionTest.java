package Ex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JUnitExceptionTest {
    @Test
    public void test0() throws Exceptions1, Exceptions2 {
        JUnitExceptionClass jUnitExceptionClass = new JUnitExceptionClass();
        boolean error_no = jUnitExceptionClass.m(0);
        Assertions.assertEquals(error_no, true);
    }

    @Test
    @DisplayName("Class Exceptions1 will be used")
    public void test1() throws Exceptions1, Exceptions2{
        JUnitExceptionClass jUnitExceptionClass = new JUnitExceptionClass();
        Throwable exception = Assertions.assertThrows(Exceptions1.class, () -> jUnitExceptionClass.m(1));
        Assertions.assertEquals("Error 1", exception.getMessage());
    }

    @Test
    @DisplayName("Class Exceptions2 will be used")
    public void test2() throws Exceptions1, Exceptions2{
        JUnitExceptionClass jUnitExceptionClass = new JUnitExceptionClass();
        Throwable exception = Assertions.assertThrows(Exceptions2.class, () -> jUnitExceptionClass.m(2));
        Assertions.assertEquals("Error 2", exception.getMessage());
    }

    @Test
    public void test3() throws Exceptions1, Exceptions2{
        JUnitExceptionClass jUnitExceptionClass = new JUnitExceptionClass();
        boolean error_no = jUnitExceptionClass.m(3);
        Assertions.assertEquals(error_no, false);
    }
}
