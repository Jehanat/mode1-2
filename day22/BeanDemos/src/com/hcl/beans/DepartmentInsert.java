package com.hcl.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DepartmentInsert {
	private int deptno;
	private String dname;
	private String loc;
	private String head;
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public String insertDepartment(){
		Connection con=DaoConnection.getConnection();
		String cmd="insert into Department values(?,?,?,?)";
		String result="";
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setInt(1, deptno);
			pst.setString(2, dname);
			pst.setString(3, loc);
			pst.setString(4, head);
			pst.executeUpdate();
			result="Record Inserted...";
		} catch (SQLException e) {
			e.printStackTrace();
			result=e.getMessage();
		}
		return result;
	}
}
