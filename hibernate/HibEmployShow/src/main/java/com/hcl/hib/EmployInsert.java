package com.hcl.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class EmployInsert {
	public static void main(String[] args) {
		int empno,basic;
		String dept,name,desig;
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
	Employ e1=new Employ();

	try {
		e1.setEmpno(900);
		e1.setName("Jehanat");
		e1.setDept("Java");
		e1.setDesig("Engineer");
		e1.setBasic(98765);
		s.save(e1);
		tx.commit();
		System.out.println("Records Inserted");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
	}
	}
	


