package com.hcl.ems;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EMSLogin {
public static boolean authenticate(int emp_Id,String secretCode) {
	Connection con=DaoConnection.getConnection();
	String cmd="Select * from EmployLogin where emp_Id=? AND secretCode=?";
	boolean flag=false;
	try {
		PreparedStatement pst=con.prepareStatement(cmd);
		pst.setInt(1, emp_Id);
		pst.setString(2, secretCode);
		ResultSet rs=pst.executeQuery();
		if(rs.next()) {
			flag=true;
		}else
			flag=false;
			
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return flag;
	
}
}
