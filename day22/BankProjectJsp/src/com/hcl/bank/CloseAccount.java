package com.hcl.bank;

public class CloseAccount {
	private int accountNo;

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
public String closeAccount(){
		
		
		return AccountBAL.closeAccountBAL(accountNo);}

}
