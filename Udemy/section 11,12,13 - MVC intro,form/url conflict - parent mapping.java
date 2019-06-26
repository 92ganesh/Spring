/*
	To  resolve conflict coz some other controller has same url paths we can make a parent mapping
	see line no:- 12
*/
package com.luv2code.springdemo.mvc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("hello")	// parent mapping so the url will look like hello/something
public class HelloWorldController {
	@RequestMapping("/showForm")	// its url now is hello/showForm
	public String showForm() { //method name can be anything irrespective to mapped url
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVer2")
	public String letsShoutDude(@RequestParam("studentName") String name, Model model) {
		String result = "Yo "+name.toUpperCase();
		model.addAttribute("message",result);
		return "helloworld";
	}
	
}
