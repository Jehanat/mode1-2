package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmpSearch {

	public static void main(String[] args) {
		int empno;
		System.out.println("Enter Emp no.:");
		Scanner sc= new Scanner(System.in);
		empno=sc.nextInt();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpractice","root","root");
			String cmd="select+from Emp where empno=?";
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setInt(1, empno);
			ResultSet rs=pst.executeQuery();
			if(rs.next()){
				System.out.println("Employ No:"+rs.getInt("empno"));
				System.out.println("Employ Name:"+rs.getString("ename"));
				System.out.println("Job:"+rs.getString("job"));
				System.out.println("Mgr:"+rs.getInt("mgr"));
				System.out.println("Hiredate:"+rs.getString("hiredate"));
				System.out.println("Comm:"+rs.getString("comm"));
				System.out.println("deptno:"+rs.getInt("deptno"));
			}else {System.out.println("Record not found!");	}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}


