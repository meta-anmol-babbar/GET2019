package com.metacube.EADsession11.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.metacube.EADsession11.entity.Student;

/**
 * DAO class for student
 * 
 */
@Transactional
@Component
public class StudentDao {

	// HIbernateTemplate object
	@Autowired
	HibernateTemplate template;

	/**
	 * save student details in database
	 * @param student
	 */
	public void saveStudent(Student student) {
		template.save(student);
	}

	/**
	 * Update student details
	 * @param student
	 */
	public void updateStudent(Student student) {
		template.update(student);
	}

	/**
	 * Delete student entry from database
	 * @param student
	 */
	public void deleteStudent(Student student) {
		template.delete(student);
	}

	/**
	 * get student details using Id
	 * @param id the Student Id
	 * @return
	 */
	public Student getById(int id) {
		Student student = (Student) template.get(Student.class, id);
		return student;
	}
	
	/**
	 * get student details using email Id
	 * @param id the Student email Id
	 * @return
	 */
	public List<Student> StudentExists(String email) {
		Student student = new Student();
	    student.setEmail(email);

	    return (List<Student>) template.findByExample(student);
	}

	/**
	 * Get all students From database
	 * 
	 * @return
	 */
	public List<Student> getStudents() {
		List<Student> list = new ArrayList<Student>();
		list = template.loadAll(Student.class);
		System.out.println(list.size());
		return list;
	}

}
