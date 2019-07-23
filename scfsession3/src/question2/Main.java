package question2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int students = 0, avgGradesOfStudents = 0;
		int maxGradesOfStudents = 0,minGradesOfStudents = 0;
		double percentageStuPass=0;
		int gradesOfStudents[];
		System.out.println("Enter number of students");
		students = sc.nextInt();
		if (students < 0) {
			System.out.println("Input Invalid...!!");
			System.exit(0);
		} else
			gradesOfStudents = new int[students];
		Marksheet marksheet=new Marksheet();

		gradesOfStudents = marksheet.enterGrades(students);
		avgGradesOfStudents = marksheet.avgGrades(gradesOfStudents, students);
		maxGradesOfStudents=marksheet.maxGrades(gradesOfStudents, students);
		minGradesOfStudents=marksheet.minGrades(gradesOfStudents, students);
		percentageStuPass=marksheet.percentageStudentPass(gradesOfStudents,students);
		marksheet.print(gradesOfStudents,students,"Grades Of All Students");
		marksheet.print(avgGradesOfStudents,"Average Grade Of Students");
		marksheet.print(maxGradesOfStudents,"Maximum Grade Of Students");
		marksheet.print(minGradesOfStudents,"Minumum Grade Of Students");
		marksheet.print(percentageStuPass,"Percentage Of Students Passed");
		
		sc.close();
	}
	
}
