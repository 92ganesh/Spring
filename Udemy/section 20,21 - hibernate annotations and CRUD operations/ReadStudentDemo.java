package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();

		// create session
		Session  session = factory.getCurrentSession();
		
		try {
			// use the session obj to save java obj
			System.out.println("creating new student");
			
			// create a student obj
			Student student = new Student("Kratos","Spartan","Kratos@gmail.com");
			
			// start a transaction
			session.beginTransaction();
			
			// save the student obj
			System.out.println("Saving the student");
			session.save(student);
			
			// commit transaction
			session.getTransaction().commit();
			
			// retrieve
			int id = student.getId();
			session = factory.getCurrentSession();
			session.beginTransaction();
			Student newStudent = session.get(Student.class, 2);
			System.out.println(newStudent);
			
			
			System.out.println("done transaction "+id);
		}finally {
			factory.close();
		}
		
		
		
	}

}
