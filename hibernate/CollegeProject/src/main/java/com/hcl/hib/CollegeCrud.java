package com.hcl.hib;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CollegeCrud {
	
	
	
	public List<FbResult> feedbackList(String instructor,String subject){

		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Query q=s.createQuery(" select fbvalue,count(*) from Feedback "
		+ " where instructor='" +instructor+ "' and subject='" +subject +"' "
		+ " group by fbvalue");

		List lst=q.list();
		List<FbResult> list=new ArrayList<FbResult>();
		FbResult res=null;
		for (Object ob : lst) {
		Object[] row=(Object[])ob;
		res=new FbResult();
		res.setFbvalue(row[0].toString());
		res.setCount(Integer.parseInt(row[1].toString()));
		System.out.println(row[0] + "  " +row[1]);
		list.add(res);
		}
		return list;
		}

public String insertSubject(Subject subject){
		
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.save(subject);
		t.commit();
		return "Record Inserted Successfully";}

public List<String> getInstructors(){
	SessionFactory sf=HibernateUtil.getConnection();
	Session s=sf.openSession();
	Query q=s.createQuery("select distinct instructor from Subject");
	List<String> lstinstr=q.list();
	return lstinstr;
}
public List<String> subjectList(String instructor){
	SessionFactory sf=HibernateUtil.getConnection();
	Session s=sf.openSession();
	Query q=s.createQuery("select distinct subject from Subject where instructor='" + instructor+"'");
	List<String> lstinstr=q.list();
	return lstinstr;
}
public static String feedbackId(){
	SessionFactory sf=HibernateUtil.getConnection();
	Session s=sf.openSession();
	Query q=s.createQuery("select max(fid) from Feedback");
	String fid="C001";
	List<String> lst=q.list();
    String feedback="";
	
	if(lst.get(0)==null){
		fid="C001";
	}else{
		fid=lst.get(0);
		int id=Integer.parseInt(fid.substring(1));
		id++;
		String formatted=String.format("%03d", id);
		fid="C"+formatted;
		
	}
	return fid;
}
public String insertFeedback(Feedback feedback){
	
	SessionFactory sf=HibernateUtil.getConnection();
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	s.save(feedback);
	t.commit();
	return "Record Inserted Successfully";}
	
}

