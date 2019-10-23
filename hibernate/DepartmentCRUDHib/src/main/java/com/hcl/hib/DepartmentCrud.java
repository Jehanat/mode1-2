package com.hcl.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DepartmentCrud {
	public List<Department> showDepartment(){
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Query q=s.createQuery("from Department");
		List <Department> lstDepartment=q.list();
		return lstDepartment;
	}
public Department searchDepartment(int deptno){
		
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Query q=s.createQuery("from Department WHERE Deptno="+deptno);
		List<Department> lstDepartment=q.list();
	Department department =null;
	if(lstDepartment.size()!=0){
		department=lstDepartment.get(0);
	}
	return department;
	}
public String insertDepartment(Department department){
	
	SessionFactory sf=HibernateUtil.getConnection();
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	s.save(department);
	t.commit();
	return "Record Inserted Successfully";}


public String updateDepartment(Department department){
	Department res=searchDepartment(department.getDeptno());
	res.setDname(department.getDname());
	res.setLoc(department.getLoc());
	res.setHead(department.getHead());
	SessionFactory sf=HibernateUtil.getConnection();
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	s.update(res);
	t.commit();
	return "Record Updated";
}


public String deleteDepartment(int deptno){
	Department res=searchDepartment(deptno);
	SessionFactory sf=HibernateUtil.getConnection();
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	s.delete(res);
	t.commit();
	return "Record deleted Successfully";}
}	


