package com.hcl.leave;

import java.sql.Date;

public class Employee {
	private int EMP_ID;
	private String EMP_NAME;
	private String EMP_EMAIL;
	private double EMP_MOB_NO;
	private String EMP_DPT_NAME;
	private Date EMP_DATE_JOINED;
	private String EMP_MGR_ID;
	private int EMP_LEAVE_BALANCE;
	public int getEMP_ID() {
		return EMP_ID;
	}
	public void setEMP_ID(int eMP_ID) {
		EMP_ID = eMP_ID;
	}
	public String getEMP_NAME() {
		return EMP_NAME;
	}
	public void setEMP_NAME(String eMP_NAME) {
		EMP_NAME = eMP_NAME;
	}
	public String getEMP_EMAIL() {
		return EMP_EMAIL;
	}
	public void setEMP_EMAIL(String eMP_EMAIL) {
		EMP_EMAIL = eMP_EMAIL;
	}
	public double getEMP_MOB_NO() {
		return EMP_MOB_NO;
	}
	public void setEMP_MOB_NO(double eMP_MOB_NO) {
		EMP_MOB_NO = eMP_MOB_NO;
	}
	public String getEMP_DPT_NAME() {
		return EMP_DPT_NAME;
	}
	public void setEMP_DPT_NAME(String eMP_DPT_NAME) {
		EMP_DPT_NAME = eMP_DPT_NAME;
	}
	public Date getEMP_DATE_JOINED() {
		return EMP_DATE_JOINED;
	}
	public void setEMP_DATE_JOINED(Date eMP_DATE_JOINED) {
		EMP_DATE_JOINED = eMP_DATE_JOINED;
	}
	public String getEMP_MGR_ID() {
		return EMP_MGR_ID;
	}
	public void setEMP_MGR_ID(String eMP_MGR_ID) {
		EMP_MGR_ID = eMP_MGR_ID;
	}
	public int getEMP_LEAVE_BALANCE() {
		return EMP_LEAVE_BALANCE;
	}
	public void setEMP_LEAVE_BALANCE(int eMP_LEAVE_BALANCE) {
		EMP_LEAVE_BALANCE = eMP_LEAVE_BALANCE;
	}

}
