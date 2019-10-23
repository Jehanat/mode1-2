package com.hcl.boxing;

public class Cricket {
static int score;
public void incr(int x){
	score+=x;
}
public static void main(String[] args) {
	Cricket c1=new Cricket();
	Cricket c2=new Cricket();
	Cricket c3=new Cricket();
	c1.incr(87);
	c2.incr(34);
	c3.incr(56);
	System.out.println(Cricket.score);
}
}

