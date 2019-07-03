package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class DeleteStudentDemo {

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
			System.out.println("deleting student");
			
			// start a transaction
			session.beginTransaction();
			
			// Method 1
//			Student student = session.get(Student.class,3);
//			session.delete(student);
			
			
			// Method 2
			session.createQuery("delete Student where id=2 ").executeUpdate();
			
			// Note:- no save while updating unlike insert
			
			// commit transaction
			session.getTransaction().commit();
			System.out.println("done transaction");
		}finally {
			factory.close();
		}
		
		
		
	}

}
