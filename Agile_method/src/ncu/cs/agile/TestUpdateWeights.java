package ncu.cs.agile;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestUpdateWeights {

	@Test
	public void TestUpdateWeights1() {
		GradeSystems aGS = new GradeSystems();
		assertEquals(true, aGS.updateWeights());
	}

}
