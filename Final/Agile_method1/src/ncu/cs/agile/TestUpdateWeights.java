package ncu.cs.agile;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class TestUpdateWeights {

	@Test
	public void TestUpdateWeights1() throws IOException {
		GradeSystems aGS = new GradeSystems();
		assertEquals(true, aGS.updateWeights());
	}

}
