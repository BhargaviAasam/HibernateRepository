package com.spi.mysore;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateMain {
	 public static void main(String[] args) {
		 Configuration config= new Configuration();
	    	config.configure("hibernate.cfg.xml");
	    	SessionFactory factory= config.buildSessionFactory();
	        Session session = factory.openSession();
	        Transaction txn=session.beginTransaction();
		 
	        Student student1 = new Student("Sam","Disilva");
	        Student student2 = new Student("Joshua", "Brill");
	         
	        Subject subject1 = new Subject("Economics");
	        Subject subject2 = new Subject("Politics");
	        Subject subject3 = new Subject("Foreign Affairs");
	 
	        //Student1 have 3 subjects
	        student1.getSubjects().add(subject1);
	        student1.getSubjects().add(subject2);
	        student1.getSubjects().add(subject3);
	         
	        //Student2 have 2 subjects
	        student2.getSubjects().add(subject1);
	        student2.getSubjects().add(subject2);
	 
	        session.persist(student1);
	        session.persist(student2);
	 
	        txn.commit();
	        session.close();  
	    }

}
