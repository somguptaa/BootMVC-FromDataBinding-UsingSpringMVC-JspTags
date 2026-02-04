package com.boot.mvc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.boot.mvc.model.Student;

@Controller
public class StudentController {

	@GetMapping // if we are not giving any request path here it will consider as "/"
	public String showHome() {
		System.out.println("home page called"); //console msg 
		
		// here we want a simple welcome msg so im returning a LVN(logical view name) jsp page
		// returning LVN 
		return "welcome";
	}

	@GetMapping("/register")
	public String registerStudentPage(@ModelAttribute("stud") Student st) {
		System.out.println("registration page called"); //console msg
		// returning student registration form page for filling details
		// returning LVN
		return "registration_form";
	}

	@PostMapping("/register")
	public String studentRegister(/* Map<String, Object> map, */          //no need of map as of now, we are not storing any value in shared memory
									@ModelAttribute("stud") Student st) {
										// for data binding to place form data into model class object
		System.out.println(st);//for console msg for our understanding
		// returning LVN
		return "result";
	}

}
