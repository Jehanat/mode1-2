package com.hcl.ems;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDAO {
 public Employee myDetails(int emp_Id){
	 Connection con= DaoConnection.getConnection();
	 String cmd="select * from employee where emp_Id=?";
	 Employee employee=null;
	 try {
		PreparedStatement pst=con.prepareStatement(cmd);
		pst.setInt(1, emp_Id);
		ResultSet rs=pst.executeQuery();
		if(rs.next()) {
			employee=new Employee();
			employee.setEmp_id(emp_Id);
			employee.setEmp_name(rs.getString("EMP_NAME"));
			employee.setEmp_dept_name(rs.getString("EMP_DPT_NAME"));
			employee.setEmp_email(rs.getString("EMP_EMAIL"));
			employee.setEmp_date_joined(rs.getDate("EMP_DATE_JOINED"));
			employee.setEmp_mgr_id(rs.getInt("EMP_MGR_ID"));
			employee.setEmp_mob_no(rs.getInt("EMP_MOB_NO"));
			employee.setEmp_leave_balance(rs.getInt("EMP_LEAVE_BALANCE"));
			
			
			
		}
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 return employee;
 }
}
