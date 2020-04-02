package ncu.cs.agile;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculateTotalGrade {
	int[] aGrade = {81, 98, 84, 90, 93};
	@Test
	public void testCalculateTotalGrade1() {
		Grades grades = new Grades();
		double[] w = {0.1, 0.1, 0.1, 0.3, 0.4};
		int g = grades.calculateTotalGrade(w);
		assertEquals(g, 91);
	}
	
	@Test
	public void testCalculateTotalGrade2() {
		Grades grade = new Grades();
		double[] w = {0.2, 0.2, 0.2, 0.2, 0.2};
		int g = grade.calculateTotalGrade(w);
		assertEquals(g, 89);
	}
	
	@Test
	public void testCalculateTotalGrade3() {
		Grades grade = new Grades();
		double[] w = {0.1, 0.1, 0.0, 0.4, 0.4};
		int g = grade.calculateTotalGrade(w);
		assertEquals(g, 91);
	}
}
