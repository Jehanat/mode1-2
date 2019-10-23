package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeptShow {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpractice","root","root");
			//System.out.println("Connected");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from Dept");
			while(rs.next()){
			    System.out.println("Department no: " +rs.getInt("deptno"));
			    System.out.println("Department Name : " +rs.getString("dname"));
			    System.out.println("Department location:" +rs.getString("loc"));
			  
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}



