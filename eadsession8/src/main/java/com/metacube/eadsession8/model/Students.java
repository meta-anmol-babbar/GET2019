package com.metacube.eadsession8.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;



@Component
public class Students {

	
	@Size(min=2 , message="{error.firstNameSize}")
	@NotBlank(message="{error.firstName}")
	private String firstName;
	
	@NotBlank(message="{error.lastName}")
	private String lastName;
	
	@NotBlank(message="{error.fatherName}")
	private String fatherName;
	
	@NotBlank(message="{error.email}")
	@Email(message="{error.emailValid}")
	private String email;
	
	
	@NotNull(message="{error.StudentClass}")
	@Min(value=1, message="{error.StudentClassMin}")
	@Max(value=12, message="{error.StudentClassMax}")
	private Integer studentClass;
	
	@NotNull(message="{error.age}")
	@Min(value=0, message="{error.ageMin}")
	@Max(value=35, message="{error.ageMax}")
	private Integer age;
	
	
	public Students() {
	}

	public Students(String firstName, String lastName, String fathertName,
			String email, Integer studentClass, Integer age) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.fatherName = fathertName;
		this.email = email;
		this.studentClass = studentClass;
		this.age = age;
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
		return "Students [firstName=" + firstName + ", lastName=" + lastName
				+ ", fathertName=" + fatherName + ", email=" + email
				+ ", studentClass=" + studentClass + ", age=" + age + "]";
	}

}
