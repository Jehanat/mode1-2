package com.hcl.demo;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class InternationalizationDemo1 {
	public static void main(String[] args) {
		
	//NumberFormat
	
	double x=1234.786;
	NumberFormat  nf=NumberFormat.getInstance(Locale.ITALY);
	NumberFormat  mf=NumberFormat.getInstance(Locale.US);
	NumberFormat  of=NumberFormat.getInstance(Locale.CHINA);
	
	System.out.println("Italy representation of "+x+ ":"+nf.format(x));
	System.out.println("US representation of "+x+ ":"+mf.format(x));
	System.out.println("China representation of "+x+ ":"+of.format(x));
	
	//DateFormat
	DateFormat df=DateFormat.getDateInstance(DateFormat.LONG,new Locale("de","DE"));
	System.out.println("Short format of date:" +df.format(new Date()));

	DateFormat df1=DateFormat.getDateInstance(DateFormat.SHORT,new Locale("de","DE"));
	System.out.println("Short format of date:" +df1.format(new Date()));
	DateFormat df2=DateFormat.getDateInstance(DateFormat.MEDIUM,new Locale("de","DE"));
	System.out.println("Short format of date:" +df2.format(new Date()));
}}
