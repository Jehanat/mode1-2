package com.hcl.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
public class EmployShow {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpractice","root","root");
			//System.out.println("Connected");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from Employ");
			while(rs.next()){
			    System.out.println("Employ no: " +rs.getInt("empno"));
			    System.out.println("Employ Name : " +rs.getString("Name"));
			    System.out.println("Employ Department :" +rs.getString("Dept"));
			    System.out.println("Employ Designation :" +rs.getString("Desig"));
			    System.out.println("Employ Salary : " +rs.getInt("Basic"
			    		+ ""));
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
