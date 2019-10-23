package com.hcl.bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SearchAccount {
	private int accountNo;

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
public Accounts searchAccount(){
		
		
		return AccountBAL.searchAccountBal(accountNo);
	}
}
