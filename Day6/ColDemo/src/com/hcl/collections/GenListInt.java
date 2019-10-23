package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class GenListInt {
	public static void main(String[] args) {
		List<Integer> lstData= new ArrayList<Integer>();
		lstData.add(new Integer (42));
		lstData.add(new Integer(11));
		lstData.add(new Integer (18));
		lstData.add(new Integer(19));
		lstData.add(new Integer(13));
		int sum=0;
		for(Integer i:lstData){
			sum+=1;
		}
		System.out.println("Sum is " +sum);
	}

}
