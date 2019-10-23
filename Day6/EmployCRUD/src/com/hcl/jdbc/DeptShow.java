package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeptShow {

public static void main(String[] args) {
	Connection con=DaoConnection.getConnection();
	String cmd="select * from Dept";
	try {
		PreparedStatement pst=con.prepareStatement(cmd);
		ResultSet rs=pst.executeQuery();
		while(rs.next()){
			System.out.println("deptno:" +rs.getInt("deptno"));
			System.out.println("dname:" + rs.getString("dname"));
			System.out.println("loc:" + rs.getString("loc"));
			
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}


