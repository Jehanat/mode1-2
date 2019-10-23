package com.hcl.employ;



import java.util.Iterator;

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
		
		 empno=0;
			Query q=s.createQuery("Select max(empno)from Employ");
			for(Iterator it=q.iterate();it.hasNext();){
				empno=(Integer)it.next();
				
			}
			empno++;
			System.out.println(empno);
			Transaction tx=s.beginTransaction();
			Employ e1=new Employ();
		try {
			e1.setEmpno(empno);;
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
		
		
		
				





