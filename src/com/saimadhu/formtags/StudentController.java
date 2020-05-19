package com.saimadhu.formtags;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

	@Value("#{countryList}")
	private Map<String, String> countryList;
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		//Add the Student object to the model
		model.addAttribute("student",new Student());
		model.addAttribute("countryList",countryList);
		return "student-form";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		
		//log the input data
		
		System.out.println("The name of the Student is : " +student.getFirstName()+" "+student.getLastName());
		System.out.println("Country : "+student.getCountry());
		System.out.println("Favorite Language is: "+student.getFav_language());
		System.out.println("Operating Systems: "+student.getOperatingSystems());
		return "student-confirmation";
	}
}
