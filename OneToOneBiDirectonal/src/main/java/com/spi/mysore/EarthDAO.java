package com.spi.mysore;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EarthDAO {
	public void save( Earth e){
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
	    Session	session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(e);
		tx.commit();
		session.close();
	} 

}
