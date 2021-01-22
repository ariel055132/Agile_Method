package Agile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testUserInterface {
    // Test the constructor is existed or not.
    @Test
    public void testUIConstructor() {
        Assertions.assertNotNull(new UserInterface());
    }
}
