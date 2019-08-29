package com.metacube.eadsession3;

public class Student {
	private int student_id;
	private String firstName;
	private String lastName;
	private String fatherName;
	private int age;
	private int studentClass;
	
	public Student() {
	}
	public Student(String firstName,String lastName,String fatherName,int age,int studentClass) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.fatherName=fatherName;
		this.age=age;
		this.studentClass=studentClass;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(int studentClass) {
		this.studentClass = studentClass;
	}
	
	
}
