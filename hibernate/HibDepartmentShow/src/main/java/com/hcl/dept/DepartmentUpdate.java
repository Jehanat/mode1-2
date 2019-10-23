package com.hcl.dept;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;


public class DepartmentUpdate {
	public static void main(String[] args) {
		int deptno;
		String loc,dname,head;
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Department d2=new Department();
		d2.setDeptno(786);
		d2.setLoc("Sydney");
		Transaction tx=s.beginTransaction();
		s.update(d2);
		tx.commit();
		System.out.println("Department details updated successfully");
		
	}

}


