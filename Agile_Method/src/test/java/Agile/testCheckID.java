package Agile;

import Ex.Exceptions1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class testCheckID {
    UserInterface userInterface = new UserInterface();

    @Test
    @DisplayName("Exceptions 1")
    public void testCheckID1() throws IDExceptions1, IDExceptions2{
        Throwable exception = Assertions.assertThrows(IDExceptions1.class, () -> userInterface.checkID("96z001044"));
        Assertions.assertEquals("這ID含字母 錯了!", exception.getMessage());
    }

    @Test
    @DisplayName("Exceptions 2")
    public void testCheckID2() throws IDExceptions1, IDExceptions2{
        Throwable exception = Assertions.assertThrows(IDExceptions2.class, () -> userInterface.checkID("96200104"));
        Assertions.assertEquals("這ID長度不對 錯了!", exception.getMessage());
    }

    @Test
    @DisplayName("Correct case")
    public void testCheckID3() throws IDExceptions1, IDExceptions2{
        boolean b = userInterface.checkID("962001044");
        Assertions.assertEquals(b, true);
    }
}
