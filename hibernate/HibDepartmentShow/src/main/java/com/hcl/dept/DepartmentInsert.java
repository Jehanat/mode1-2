package com.hcl.dept;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;



public class DepartmentInsert {
	public static void main(String[] args) {
		
	
	int deptno;
	String loc,head,dname;
	
	
	Configuration cfg = new AnnotationConfiguration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session s=sf.openSession();
	Transaction tx=s.beginTransaction();
Department d1=new Department();

try {
	d1.setDeptno(900);
	d1.setDname("Java");
	d1.setLoc("Bangalore");
	d1.setHead("Kally");
	
	s.save(d1);
	tx.commit();
	System.out.println("Records Inserted");
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	
}
}

	