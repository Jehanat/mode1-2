package com.hcl.beans;

public class Student {
	private int sno;
	private String name;
	private Lunchbox Lunchbox;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Lunchbox getLunchbox() {
		return Lunchbox;
	}
	public void setLunchbox(Lunchbox lunchbox) {
		Lunchbox = lunchbox;
	}
public void display(){
	
	
	System.out.println("Sno "+sno+"Name"+name);
	Lunchbox.eat();
}

	
}

