package Agile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class testUpdateWeights {
    @Test
    public void testUpdateWeights1() throws IOException {
        GradeSystems gradeSystems = new GradeSystems();
        Assertions.assertEquals(true, gradeSystems.updateWeights());
    }
}
