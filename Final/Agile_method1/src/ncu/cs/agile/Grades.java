package ncu.cs.agile;

/** **********************************************************************
class Grades  aGrade¿x¶sname, lab1, lab2, lab3, midtermExam, finalExam, totalGrade

calculateTotalGrade (weights)
Grades () { } 
************************************************************************/

public class Grades {
	String name;
	int lab1, lab2, lab3, midtermExam, finalExam, totalGrade;
	public Grades() {

	}
	public int calculateTotalGrade(double[] w) {
		double grade = 0;
		grade = lab1*w[0] + lab2*w[1] + lab3*w[2] + midtermExam*w[3] + finalExam*w[4];
		//return (int) grade;
		grade = (int) Math.round(grade);
		totalGrade = 0;
		totalGrade = (int) (grade);
		return totalGrade;
	}
}
