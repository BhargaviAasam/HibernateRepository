package com.spi.mysore;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PersonDAO {
	
	public void save( PersonDTO dto){
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
	    Session	session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(dto);
		tx.commit();
		session.close();
	} 

}
