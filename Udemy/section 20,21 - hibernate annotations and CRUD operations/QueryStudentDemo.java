package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class QueryStudentDemo {

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
			System.out.println("quering student");
			
			// start a transaction
			session.beginTransaction();
			
		//	List<Student> allStudents = session.createQuery("from Student").list();
			List<Student> allStudents = session.createQuery("from Student s where s.firstName='kratos'").list();
			for(Student e:allStudents) {
				System.out.println(e);
			}
			
			// commit transaction
			session.getTransaction().commit();
			System.out.println("done transaction");
		}finally {
			factory.close();
		}
		
		
		
	}

}
