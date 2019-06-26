package com.luv2code.springdemo.mvc;
/*
modelAttribute in jsp states which obj will be used to set/get form attributes
when form is loaded it used getters of attributes to get values. If its null then the field is set empty
eg it calls getFirstName(), setFirstName() of student obj got frm controller
*/
public class Student {
	private String firstName;
	private String lastName;
	
	public Student() {
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	
}
