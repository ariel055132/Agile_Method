package ncu.cs.agile;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class TestGradeSystems {
	
	
	@Test
	public void testGradeSystems1() throws IOException {
		GradeSystems aGradeSystem = new GradeSystems();
		assertEquals(87,aGradeSystem.aTree.get("962001044").lab1);
	}
	
	@Test
	public void testGradeSystrems2() throws IOException {
		GradeSystems aGradeSystem = new GradeSystems();
		assertEquals(81,aGradeSystem.aTree.get("962001051").lab1);
	}
	
	@Test 
	public void testGradeSystems3() throws IOException {
		GradeSystems aGradeSystem = new GradeSystems();
		assertEquals(86,aGradeSystem.aTree.get("965002044").lab2);
	}
	
	@Test 
	public void testGradeSystems4() throws IOException {
		GradeSystems aGradeSystem = new GradeSystems();
		assertEquals(85,aGradeSystem.aTree.get("966002031").lab3);
	}
}
