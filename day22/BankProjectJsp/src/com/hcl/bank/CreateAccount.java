package com.hcl.bank;

public class CreateAccount {
	private int accountNo;
	private String firstName;
	private String lastName;
	private String city;
	private String state;
	private int amount;
	private String cheqfacil;
	private String accountType;
	private String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getCheqfacil() {
		return cheqfacil;
	}
	public void setCheqfacil(String cheqfacil) {
		this.cheqfacil = cheqfacil;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String createAccount(){
		Accounts objAccounts=new Accounts();
		int accno=AccountBAL.generateAccountBal();
		objAccounts.setAccountNo(accno);
		objAccounts.setFirstName(firstName);
		objAccounts.setLastName(lastName);
		objAccounts.setCity(city);
		objAccounts.setState(state);
		objAccounts.setAmount(amount);
		objAccounts.setCheqfacil(cheqfacil);
		objAccounts.setAccountType(accountType);
		return AccountBAL.createAccountBal(objAccounts);
	}
}
