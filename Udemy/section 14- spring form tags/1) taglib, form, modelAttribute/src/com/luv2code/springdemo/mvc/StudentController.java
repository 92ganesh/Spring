package com.luv2code.springdemo.mvc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/*
modelAttribute in jsp states which obj will be used to set/get form attributes
when form is loaded it used getters of attributes to get values. If its null then the field is set empty
eg it calls getFirstName(), setFirstName() of student obj got frm controller
*/
@Controller
@RequestMapping("/student")
public class StudentController {
	@RequestMapping("/showForm")
	public String showForm(Model model) {		
		Student theStudent = new Student();
		model.addAttribute("student",theStudent); // provide student obj to jsp

		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {		

		System.out.println("theSudent "+theStudent.getFirstName()+ " "+ theStudent.getLastName());
		return "student-confirmation";
	}
}
