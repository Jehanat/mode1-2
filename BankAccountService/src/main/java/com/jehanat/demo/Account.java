package com.jehanat.demo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Account")
public class Account implements Serializable{
		private static final long serialVersionUID = 1L;

	@Id
	@Column
	
	private int accountnum ;
	@Column
	private double amount ;
	@Column
	private char accounttype; 
	@Column
	private int userid;
	public int getAccountnum() {
		return accountnum;
	}
	@Override
	public String toString() {
		return "Account [accountnum=" + accountnum + ", amount=" + amount + ", accounttype=" + accounttype + ", userid="
				+ userid + "]";
	}
	public void setAccountnum(int accountnum) {
		this.accountnum = accountnum;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public char getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(char accounttype) {
		this.accounttype = accounttype;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
}
