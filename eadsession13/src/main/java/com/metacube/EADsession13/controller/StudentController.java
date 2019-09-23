package com.metacube.EADsession13.controller;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.metacube.EADsession13.entity.Student;
import com.metacube.EADsession13.repository.StudentRepository;

/**
 * controller class
 *
 */
@Controller
public class StudentController {

	@Autowired
	StudentRepository repository;
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
	public String homeRedirect(Model model,
			@RequestParam(value = "denied", required = false) String warn) {
		model.addAttribute("msg", msg);
		if (warn != null) {
			model.addAttribute("denied",
					"you are not authorized to access this page");
		}
		return "Index";
	}

	@GetMapping("/login")
	public String loginRedirect(Model model) {
		return "login";
	}

	/**
	 * redirects to student form
	 * 
	 * @param model
	 * @return student form page address
	 */
	@GetMapping("/studentForm")
	public String studentForm(Model model) {
		model.addAttribute("studentObj", new Student());
		return "Student_Form";
	}

	/**
	 * method to submit the form data
	 * 
	 * @param student
	 * @param result
	 * @return ModelAndView
	 */
	@PostMapping("/studentForm")
	public ModelAndView submitStudentForm(
			@Validated @ModelAttribute("studentObj") Student student,
			BindingResult result) {

		ModelAndView model = new ModelAndView("Student_Form");
		if (result.hasErrors()) {
			return model;
		}

		System.out.println(student);

		Student student1 = new Student(student);
		// checking if email Id already exists
		if (repository.findByEmailContainingIgnoreCase(student1.getEmail())
				.size() != 0) {
			model.addObject("result",
					"Email Id already exists please choose another");
			return model;
		}

		repository.save(student1);

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
	@GetMapping("/showStudents")
	public String showStudents(Model model) {

		students = repository.findAll();
		model.addAttribute("students", students);
		return "Show_Students";
	}
}