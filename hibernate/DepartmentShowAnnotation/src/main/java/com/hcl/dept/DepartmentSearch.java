package com.hcl.dept;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class DepartmentSearch {
	public static void main(String[] args) {
		int deptno=2;
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("from Department WHERE deptno="+deptno);
		List<Department> list=q.list();
		Department d=list.get(0);
		if(d!=null){
			
			
			System.out.println("Name of Department---- "+d.getDname());
			System.out.println("Department Location---- "+d.getLoc());
			System.out.println("Head---- "+d.getHead());
			
			
		}else{
			System.out.println("Record not found");
	}
}
}
