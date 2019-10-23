package com.hcl.bank;

public class DepositAccount {
	
	private int accountNo;
	private int depAmount;
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getDepAmount() {
		return depAmount;
	}
	public void setDepAmount(int depAmount) {
		this.depAmount = depAmount;
	}
	public String depositAccount(){
		
		
		return AccountBAL.depositAccountBal(accountNo, depAmount);}

}
