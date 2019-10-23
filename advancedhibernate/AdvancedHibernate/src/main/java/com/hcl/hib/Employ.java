package com.hcl.hib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedNativeQueries;
import org.hibernate.annotations.NamedNativeQuery;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

@Entity
@Table(name = "Employ")
@NamedQueries({@NamedQuery(name ="@HQL_GET_ALL_EMPLOY", query="from Employ")})
@NamedNativeQueries({@NamedNativeQuery(name="@SQL_GET_ALL_EMPLOY",query="select empno,name,dept,desig,basic from Employ")})

public class Employ {
	@Id
	@Column(name = "empno")
	private int empno;

	@Column(name = "name")
	private String name;

	@Column(name = "dept")
	private String dept;

	@Column(name = "desig")
	private String desig;

	@Column(name = "basic")
	private int basic;

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public int getBasic() {
		return basic;
	}

	public void setBasic(int basic) {
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", dept=" + dept + ", desig=" + desig + ", basic=" + basic
				+ "]";
	}
}
