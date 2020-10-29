package com.example.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Users {
	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="salary")
	private Integer salary;
	
	@Column(name="last_name")
	private Integer lastName;
	
	public Users() {
		
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return firstName;
	}

	public void setLastName(String firstName) {
		this.firstName = firstName;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}
}
