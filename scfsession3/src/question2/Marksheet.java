package question2;

import java.util.Scanner;

public class Marksheet {
	static Scanner sc = new Scanner(System.in);
	
	/**
	 * enterGrades takes user input for grades of students
	 * @param students is number of students
	 * @return grades is a array of grades of students
	 */
	
	protected int[] enterGrades(int students) {
		int grades[] = new int[students];
		for (int i = 0; i < students; i++) {
			System.out.println("Enter grade of Student " + (i + 1));
			grades[i] = sc.nextInt();
			if(grades[i]<0 || grades[i]>100){
				i--;
				System.out.println("invalid grade..!! Please Enter Correct Value");
			}
		}
		return grades;
	}
	
	/**
	 * maxGrades takes user input for grades of students
	 * @param gradesOfStudents is an array for grades of all students
	 * @param students is number of students
	 * @return maxGrade provides max grade among all the grades 
	 */
	protected int maxGrades(int[] gradesOfStudents, int students) {
		int maxGrade = 0;
		for (int i = 0; i < students; i++) {
			if (maxGrade < gradesOfStudents[i])
				maxGrade = gradesOfStudents[i];
		}
		return maxGrade;
	}
	
	/**
	 * maxGrades provides highest value of grade in all given grade values
	 * @param gradesOfStudents is an array for grades of all students
	 * @param students is number of students
	 * @return maxGrade provides maximum grade among all the grades 
	 */
	protected int minGrades(int[] gradesOfStudents, int students) {
		int minGrade = gradesOfStudents[0];
		for (int i = 0; i < students; i++) {
			if (minGrade > gradesOfStudents[i])
				minGrade = gradesOfStudents[i];
		}
		return minGrade;
	}
	
	/**
	 * minGrades provides lowest value of grade in all given grade values
	 * @param gradesOfStudents is an array for grades of all students
	 * @param students is number of students
	 * @return minGrade provides minimum grade among all the grades 
	 */
	
	protected double  percentageStudentPass(int[] gradesOfStudents,
			int students) {
		double pass=0;
		double passPercent=0;
		for(int i=0;i<students;i++){
			if(gradesOfStudents[i]>=40)
				pass++;
		}
		passPercent=((pass/students)*100);
		return passPercent;
	}
	
	/**
	 * avgGrades provides average value of grade in all given grade values
	 * @param gradesOfStudents is an array for grades of all students
	 * @param students is number of students
	 * @return avgGrade provides average grade among all the grades 
	 */

	protected int avgGrades(int[] gradesOfStudents, int students) {
		int avgGrade = 0;
		for (int i = 0; i < students; i++) {
			avgGrade = avgGrade + gradesOfStudents[i];
		}
		try{
			
			avgGrade = (avgGrade / students);
		}
		catch(Exception e){
			System.out.println(e);
		}
		return avgGrade;
	}
	
	/**
	 * print is overloaded method for double, integer and int[] types
	 * @param initials is message for printing 
	 * @param value is double or integer value that needs to be printed
	 * @param students is number of total students
	 * @param gradesOfStudents is grades of all the students
	 * @return avgGrade provides average grade among all the grades 
	 */

protected void print(double value, String initials) {
		
		System.out.println(initials+" "+value+"%");
		
	}
	
	protected void print(int value,String initials) {
		System.out.println(initials+" "+value);
	}

	protected void print(int[] gradesOfStudents,int students,String initals) {
		for (int i = 0; i < students; i++) {
			System.out.println("Grade Of Student "+(i+1)+"= "+gradesOfStudents[i]);
		}
		
	}
	
}
