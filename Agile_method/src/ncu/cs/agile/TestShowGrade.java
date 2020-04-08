package ncu.cs.agile;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestShowGrade {

	@Test
	public void TestShowGrade1() {
		GradeSystems aGS = new GradeSystems();
		assertEquals(424, aGS.showGrade("962001044"));
	}
	
	@Test
	public void TestShowGrade2() {
		GradeSystems aGS = new GradeSystems();
		assertEquals(435, aGS.showGrade("962001051"));
	}

}
