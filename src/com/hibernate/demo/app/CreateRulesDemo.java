package com.hibernate.demo.app;

import java.sql.Connection;
import java.sql.DriverManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.demo.Rules;

public class CreateRulesDemo {

	public static void main(String[] args) {
		
		
		// Create SessionFactory
		  
		   SessionFactory factory = new Configuration()
				             .configure("hibernate.cfg.xml")
				             .addAnnotatedClass(Rules.class)
				             .buildSessionFactory();
		   System.out.println("Enter Session factory");
		
		// Create Session
		   Session session = factory.getCurrentSession();

		   try {
			  // create rules object
			  System.out.println("Create rules object");
			  Rules tempRules = new Rules ("Typef", "34345");
			   
			  // start a transaction
			     session.beginTransaction();
			  // save rules object
			   System.out.println("Saving the Rules Object");
			    session.save(tempRules);
			  //commit transaction 
			   session.getTransaction().commit();
			   System.out.println("Done,,,,,");
		   }
		   finally {
			   factory.close();
		   }
	}

}
