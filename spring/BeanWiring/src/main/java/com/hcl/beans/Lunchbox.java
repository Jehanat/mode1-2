package com.hcl.beans;

public class Lunchbox {
private String snacks;

public String getSnacks() {
	return snacks;
}

public void setSnacks(String snacks) {
	this.snacks = snacks;
}
public void eat(){
	System.out.println("Eating: " +snacks);
}
}
