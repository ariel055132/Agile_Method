package ncu.cs.agile;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculateTotalGrade {
	Grades aGrade = new Grades();
	//int[] aGrade = {81, 98, 84, 90, 93};
	@Test
	public void testCalculateTotalGrade1() {
		Grades aGrade = new Grades();
		aGrade.lab1 = 81;
		aGrade.lab2 = 98;
		aGrade.lab3 = 84;
		aGrade.midtermExam = 90;
		aGrade.finalExam = 93;
		double[] w = {0.1, 0.1, 0.1, 0.3, 0.4};
		int g = aGrade.calculateTotalGrade(w);
		assertEquals(g, 91);
	}
	
	@Test
	public void testCalculateTotalGrade2() {
		Grades aGrade = new Grades();
		aGrade.lab1 = 81;
		aGrade.lab2 = 98;
		aGrade.lab3 = 84;
		aGrade.midtermExam = 90;
		aGrade.finalExam = 93;
		double[] w = {0.2, 0.2, 0.2, 0.2, 0.2};
		int g = aGrade.calculateTotalGrade(w);
		assertEquals(g, 89);
	}
	
	@Test
	public void testCalculateTotalGrade3() {
		Grades aGrade = new Grades();
		aGrade.lab1 = 81;
		aGrade.lab2 = 98;
		aGrade.lab3 = 84;
		aGrade.midtermExam = 90;
		aGrade.finalExam = 93;
		double[] w = {0.1, 0.1, 0.0, 0.4, 0.4};
		int g = aGrade.calculateTotalGrade(w);
		assertEquals(g, 91);
	}
}
