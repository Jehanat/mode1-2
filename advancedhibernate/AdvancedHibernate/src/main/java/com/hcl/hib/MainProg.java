package com.hcl.hib;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;



public class MainProg {
	public static void main(String[] args) {
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("from Employ");
//		q.setFirstResult(2);
//		q.setMaxResults(5);
//		List list2=q.list();
		Criteria c=s.createCriteria(Employ.class);
//		c.add(Restrictions.gt("basic", 42133));
//		List list=c.list();
//		
//		c.addOrder(Order.desc("empno"));
//		List list1=c.list();
		
		c.setProjection(Projections.property("name"));
		List p =c.list();
		
		
		
		for(Object ob:p){
			String e = (String)ob;
//			System.out.println("Employ no........."+e.getEmpno());
			System.out.println("Name of Employ...."+e);
//			System.out.println("Department........"+e.getDept());
//			System.out.println("Designation......."+e.getDesig());
//			System.out.println("Basic............."+e.getBasic());
//			System.out.println("**********************");
		}
	}
}


