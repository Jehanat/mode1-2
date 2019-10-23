package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserAuth {
	public static void main(String[] args) {
		String user,pwd;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter UserName and Password");
		user=sc.nextLine();
		pwd=sc.nextLine();
		String cmd="select *from users where username=? and password=?";
	
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpractice","root","root");
				PreparedStatement pst=con.prepareStatement(cmd);
				pst.setString(1, user);
				pst.setString(2,pwd);
				ResultSet rs=pst.executeQuery();
				if(rs.next()){
					System.out.println("Credentials are correct");
				}else{
					System.out.println("Credentials are wrong");
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
	}

}
