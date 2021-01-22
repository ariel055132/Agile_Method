package Agile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class testContainID {
    @Test
    @DisplayName("Exceptions 3")
    public void testContainID1() throws IDExceptions3, IOException {
        GradeSystems gradeSystems = new GradeSystems();
        Throwable exception = Assertions.assertThrows(IDExceptions3.class, () -> gradeSystems.containID("123456789"));
        Assertions.assertEquals("無這ID 錯了!", exception.getMessage());
    }

    @Test
    @DisplayName("True")
    public void testContainID2() throws IDExceptions3, IOException {
        GradeSystems gradeSystems = new GradeSystems();
        boolean b = gradeSystems.containID("962001044");
        Assertions.assertEquals(b, true);
    }
}
