package com.batch2;

public class Customer {
	
     private int cust_id;
     private String name;
     private int type;
     private double credit_score;
     private int add_id;
     private int login_id;
     
     
	public int getLogin_id() {
		return login_id;
	}
	public void setLogin_id(int login_id) {
		this.login_id = login_id;
	}
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public double getCredit_score() {
		return credit_score;
	}
	public void setCredit_score(double credit_score) {
		this.credit_score = credit_score;
	}
	public int getAdd_id() {
		return add_id;
	}
	public void setAdd_id(int add_id) {
		this.add_id = add_id;
	}
	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", name=" + name + ", type=" + type + ", credit_score=" + credit_score
				+ ", add_id=" + add_id + ", login_id=" + login_id + "]";
	}
	
     
} 