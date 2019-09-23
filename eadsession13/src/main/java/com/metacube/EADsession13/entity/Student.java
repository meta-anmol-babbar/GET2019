package com.metacube.EADsession13.entity;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

/**
 * Entity class for student
 *
 */
@Entity
@Table(name = "student")
public class Student implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "S_id")
	Integer studentId;

	@Pattern(regexp = "^[a-zA-Z ]{0,15}", message = "first name should be alphabetical")
	@Size(min = 2, max = 15, message = "{fName}")
	@Column(name = "First_name")
	String firstName;

	@Pattern(regexp = "^[a-zA-Z ]{0,15}", message = "last name should be alphabetical")
	@Size(min = 2, max = 15, message = "{lName}")
	@Column(name = "last_name")
	String lastName;

	@Pattern(regexp = "^[a-zA-Z ]{0,50}", message = "father name should be alphabetical")
	@Size(min = 2, max = 50, message = "{fName}")
	@Column(name = "Father_name")
	String fatherName;

	@NotBlank
	@Email
	@Column(name = "S_email")
	String email;

	@NotNull(message = "class can not be empty")
	@Range(min = 1, max = 12)
	@Column(name = "S_class")
	Integer studentClass;

	@NotNull(message = "age can not be empty")
	@Range(min = 1, max = 100)
	@Column(name = "S_age")
	Integer age;

	public Student() {

	}

	public Student(Student student) {

		this.firstName = student.firstName;
		this.lastName = student.lastName;
		this.fatherName = student.fatherName;
		this.email = student.email;
		this.age = student.age;
		this.studentClass = student.studentClass;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(Integer studentClass) {
		this.studentClass = studentClass;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName
				+ ", fatherName=" + fatherName + ", email=" + email
				+ ", studentClass=" + studentClass + ", age=" + age + "]";
	}

}
