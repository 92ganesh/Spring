package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user = "root";
		String pass = "root";
		
		try {
			Connection conn = DriverManager.getConnection(jdbcUrl,user,pass);
			
			if(conn!=null) {
				System.out.println("suc");
			}else {
				System.out.println("faile");
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
