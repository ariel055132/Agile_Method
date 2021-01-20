package ncu.cs.agile;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class TestShowGrade {

	@Test
	public void TestShowGrade1() throws IOException {
		GradeSystems aGS = new GradeSystems();
		assertEquals(446, aGS.showGrade("962001044"));
	}
	
	@Test
	public void TestShowGrade2() throws IOException {
		GradeSystems aGS = new GradeSystems();
		assertEquals(446, aGS.showGrade("962001051"));
	}
	
	@Test
	public void TestShowGrade3() throws IOException {
		GradeSystems aGS = new GradeSystems();
		assertEquals(441, aGS.showGrade("965002038"));
	}
	
	@Test
	public void TestShowGrade4() throws IOException {
		GradeSystems aGS = new GradeSystems();
		assertEquals(420, aGS.showGrade("965002044"));
	}
}
