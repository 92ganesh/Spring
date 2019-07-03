package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

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
			System.out.println("updating student");
			
			// start a transaction
			session.beginTransaction();
			
			// Method 1
//			Student student = session.get(Student.class,2);
//			student.setEmail("sparta@greek.com");
			
			
			// Method 2
			session.createQuery("update Student set email='foo@gmail.com' ").executeUpdate();
			
			// Note:- no save while updating unlike insert
			
			// commit transaction
			session.getTransaction().commit();
			System.out.println("done transaction");
		}finally {
			factory.close();
		}
		
		
		
	}

}
