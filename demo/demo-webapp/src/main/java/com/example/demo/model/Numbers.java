package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Numbers {
	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;
	
	@Column(name="a")
	private Integer a;
	
	@Column(name="b")
	private Integer b;
	
	public Numbers(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getA() {
		return a;
	}

	public void setA(Integer a) {
		this.a = a;
	}

	public Integer getB() {
		return b;
	}

	public void setB(Integer b) {
		this.b = b;
	}
	
	
}
