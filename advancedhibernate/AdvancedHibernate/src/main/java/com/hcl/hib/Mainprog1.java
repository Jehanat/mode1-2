package com.hcl.hib;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Mainprog1 {
	
		public static void main(String[] args) {
			Configuration cfg = new AnnotationConfiguration();
			cfg.configure("hibernate.cfg.xml");
			SessionFactory sf=cfg.buildSessionFactory();
			Session s=sf.openSession();
			Query q=s.createQuery("from Employ");
			q=s.getNamedQuery("@HQL_GET_ALL_EMPLOY");

			Employ emp=(Employ)q.uniqueResult();
			System.out.println(emp);
			
}}
