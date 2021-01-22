package Agile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class testGetName {
    @Test
    @DisplayName("凌宗廷")
    public void testGetName1() throws IOException {
        GradeSystems gradeSystems = new GradeSystems();
        Assertions.assertEquals("凌宗廷", gradeSystems.aTree.get("962001044").name);
    }

    @Test
    @DisplayName("李威廷")
    public void testGetName2() throws IOException {
        GradeSystems gradeSystems = new GradeSystems();
        Assertions.assertEquals("李威廷", gradeSystems.aTree.get("962001051").name);
    }

    @Test
    @DisplayName("王淳")
    public void testGetName() throws IOException {
        GradeSystems gradeSystems = new GradeSystems();
        Assertions.assertEquals("王淳", gradeSystems.aTree.get("985002016").name);
    }
}
