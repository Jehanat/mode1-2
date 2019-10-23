package com.hcl.bank;

public class WithdrawAccount {
	private int accountNo;
	private int withdrawAmount;
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getWithdrawAmount() {
		return withdrawAmount;
	}
	public void setWithdrawAmount(int withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}
public String withdrawAccount(){
		
		
		return AccountBAL.withdrawAccountBal(accountNo, withdrawAmount);}

}
