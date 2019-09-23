package com.metacube.EADsession11.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.metacube.EADsession11.DAO.StudentDao;
import com.metacube.EADsession11.entity.Student;

/**
 * controller class
 *
 *
 */
@Controller
public class StudentController {

	StudentDao dao;

	public StudentDao getDao() {
		return dao;
	}

	@Autowired
	public void setDao(StudentDao dao) {
		this.dao = dao;
	}

	List<Student> students;

	@Value("${message}")
	String msg;

	/**
	 * redirects to home page
	 * 
	 * @param model
	 * @return home page address
	 */
	@GetMapping("/index")
	public String homeRedirect(Model model) {
		model.addAttribute("msg", msg);
		return "index";
	}

	/**
	 * redirects to student form
	 * 
	 * @param model
	 * @return student form page address
	 */
	@GetMapping("/StudentDetails")
	public String studentForm(Model model) {
		model.addAttribute("studentObj", new Student());
		return "StudentDetails";
	}

	/**
	 * method to submit the form data
	 * 
	 * @param student
	 * @param result
	 * @return ModelAndView
	 */
	@PostMapping("/StudentDetails")
	public ModelAndView submitStudentForm(
			@Validated @ModelAttribute("studentObj") Student student,
			BindingResult result) {

		ModelAndView model = new ModelAndView("StudentDetails");
		if (result.hasErrors()) {
			return model;
		}
		

		System.out.println(student);

		Student student1 = new Student(student);

		//checking if already exists
		if(dao.StudentExists(student1.getEmail()).size()!=0){
			model.addObject("result", "Email Id already exists please choose another");
			return model;
		}
		
		dao.saveStudent(student1);

		student.setFirstName(null);
		student.setLastName(null);
		student.setFatherName(null);
		student.setEmail(null);
		student.setAge(null);
		student.setStudentClass(null);
		model.addObject("result", "student registered successfully");
		return model;
	}

	/**
	 * redirects to show student jsp page
	 * 
	 * @param model
	 * @return show student page address
	 */
	@GetMapping("/ShowStudents")
	public String showStudents(Model model) {

		students = dao.getStudents();
		model.addAttribute("students", students);
		return "ShowStudents";
	}
}