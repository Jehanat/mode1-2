package com.hcl.inventory;

import java.util.Scanner;




public class AddStockMain {

	public static void main(String[] args) {
	String stockid=StockBAL.generateStockidBal();
	
	//System.out.println(accountno);
	Stock objStock=new Stock();
	objStock.setStockid(stockid);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Item Name:");
	objStock.setItemName(sc.nextLine());
	System.out.println("Enter Price:");
	objStock.setPrice(Integer.parseInt(sc.nextLine()));
	System.out.println("Enter QuantityAvail:");
	objStock.setQuantityAvail(Integer.parseInt(sc.nextLine()));

	System.out.println(StockBAL.addStockidBal(objStock));
	}

}
