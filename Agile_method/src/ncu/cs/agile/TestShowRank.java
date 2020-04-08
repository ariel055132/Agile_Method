package ncu.cs.agile;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestShowRank {

	@Test
	public void TestShowRank1() {
		GradeSystems aGS = new GradeSystems();
		assertEquals(4,aGS.showRank("962001044"));
	}
	
	@Test
	public void TestShowRank2() {
		GradeSystems aGS = new GradeSystems();
		assertEquals(5,aGS.showRank("962001051"));
	}

}
