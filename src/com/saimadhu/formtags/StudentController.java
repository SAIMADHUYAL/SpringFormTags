package com.saimadhu.formtags;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		//Add the Student object to the model
		model.addAttribute("student",new Student());
		return "student-form";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		
		//log the input data
		
		System.out.println("The name of the Student is : " +student.getFirstName()+" "+student.getLastName());
		System.out.println("Country : "+student.getCountry());
		return "student-confirmation";
	}
}
