package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmploySearch {
	public static void main(String[] args) {
		int empno;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employ No: ");
		empno=sc.nextInt();
		Connection con=DaoConnection.getConnection();
		String cmd="select * from Employ where empno=?";
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setInt(1, empno);
			ResultSet rs=pst.executeQuery();
			if(rs.next()){
				System.out.println("NAme" + rs.getString("name"));
				System.out.println("Dept" + rs.getString("dept"));
				System.out.println("Desig"+rs.getString("desig"));
				System.out.println("Basic " +rs.getInt("basic"));
			}else{
				System.out.println("Record not found!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
