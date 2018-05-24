package com.jdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.demo.Rules;

public class TestJdbc {

	public static void main(String[] args) {
		
		String jdbcUrl = "jdbc:mysql://127.0.0.1:3306/nk_rules_tracker?useSSL=false";
		String user = "nkrules";
		String pass = "nkrules";
		try {
			System.out.println("Connect to DB" + jdbcUrl);
			Connection mycon = 
					DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println("Connection Successful !!");
		}
		catch (Exception ec) {
			ec.printStackTrace();
		}

		
	}

}
