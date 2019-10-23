package com.hcl.leave;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
	public static boolean authenticate(int EMP_ID, String secretcode) {
		Connection con=DaoConnection.getConnection();
		String cmd="select * from employlogin where EMP_ID=? AND secretcode=?";
		boolean flag=true;
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setInt(1, EMP_ID);
			pst.setString(2, secretcode);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				flag=true;
			} else {
				flag=false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

}
