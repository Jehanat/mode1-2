package com.hcl.hib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Feedback")
public class FbResult {
private int count;
private String fbvalue;

@Id
@Column(name="count")
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}
@Column(name="fbvalue")

public String getFbvalue() {
	return fbvalue;
}
public void setFbvalue(String fbvalue) {
	this.fbvalue = fbvalue;
}
}
