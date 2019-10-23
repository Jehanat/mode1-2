package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeptInsert {

	public static void main(String[] args) {
		int deptno;
		String dname,loc;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter department no");
		deptno=Integer.parseInt(sc.nextLine());
		System.out.println("Name of Department:");
		dname=sc.nextLine();
		System.out.println("Location:");
		loc=sc.nextLine();
		
		String cmd="insert into Dept values(?,?,?)";
		Connection con=DaoConnection.getConnection();
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setInt(1, deptno);
			pst.setString(2, dname);
			pst.setString(3, loc);
			
			pst.executeUpdate();
			System.out.println("Record Inserted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}


