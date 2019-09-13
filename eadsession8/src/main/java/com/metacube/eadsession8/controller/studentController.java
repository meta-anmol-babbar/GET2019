package com.metacube.eadsession8.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import com.metacube.eadsession8.model.Students;

@Controller
public class studentController {

	// Validation code start
	boolean error = false;

	@Autowired
	Students student;

	@Value("${home.notice}")
	private String schoolNotice;

	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("schoolNotice", schoolNotice);
		return "index";
	}

	@GetMapping("/studentDetails")
	public String setupForm(Model model) {
		// Students student = new Students();
		model.addAttribute(new Students());
		return "studentDetails";
	}

	@PostMapping("/studentDetails")
	public String submitForm(@Validated Students student, BindingResult result) {

		if (result.hasErrors()) {
			return "studentDetails";
		} else {
			
			return "redirect:/success";
		}
	}

	@GetMapping("/success")
	public String detailsSuccess(Model model) {
		return "addSuccess";
	}

	@GetMapping("/showStudents")
	public String showStudent(ModelMap model) {

		List<Students> studentsList = getStudentsList();
		model.addAttribute("studentsList", studentsList);
		return "showStudents";
	}

	private List<Students> getStudentsList() {
		List<Students> listOfStudents = new ArrayList<>();
		listOfStudents.add(new Students("Aman", "Gautam", "Mr Kumar",
				"aman@gmail.com", 12, 18));
		listOfStudents.add(new Students("Anmol", "Babbar", "Mr Babbar",
				"babbarShera@gmail.com", 10, 15));
		listOfStudents.add(new Students("Jugal", "Kukreja", "Mr Kukreja",
				"jugal123@gmail.com", 7, 12));
		listOfStudents.add(new Students("Mahendar", "Saran", "Mr Saran",
				"mahindar123@gmail.com", 8, 13));
		listOfStudents.add(new Students("Ajay", "Shringi", "Mr Shringi",
				"ajay1234@gmail.com", 11, 16));
		return listOfStudents;
	}

}
