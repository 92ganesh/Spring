package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Numbers;
import com.example.demo.service.AddService;

@Controller
public class HomeController {
	
//	@RequestMapping("home")
//	public String home() {
//		System.out.println("Hi hello");
//		return "home.jsp";
//	}
	
	@Autowired
	private AddService adder;
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	@ResponseBody
	public String add(@RequestParam("a") String firstNumber, @RequestParam("b") String secondNumber) {
		Numbers numbers = new Numbers(firstNumber,secondNumber);
		String result = "Result of addition is "+adder.add(numbers);
		return result;
	}
}
