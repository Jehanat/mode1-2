package com.hcl.hib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Department")
public class Department {
	
	private int deptno;
	private String dname;
	private String loc;
	private String head;
	@Id
	@Column(name="deptno")
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	@Column(name="dname")
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	@Column(name="loc")
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Column(name="head")
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}

	}


