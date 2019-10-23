package com.hcl.employ;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;


public class EmployUpdate {
	public static void main(String[] args) {
		int empno,basic;
		String dept,name,desig;
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Employ e2=new Employ();
		e2.setEmpno(786);
		e2.setName("Shresth");
		Transaction tx=s.beginTransaction();
		s.update(e2);
		tx.commit();
		System.out.println("Employ details updated successfully");
		s.close();
		sf.close();
		
		
	}

}


