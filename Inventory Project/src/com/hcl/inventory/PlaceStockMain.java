package com.hcl.inventory;

import java.util.Scanner;

public class PlaceStockMain {
	public static void main(String[] args) {
		int qtyOrd;
		String stockID;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter StockID and Qtyord");
		stockID=sc.nextLine();
		qtyOrd=Integer.parseInt(sc.nextLine());
		System.out.println(StockBAL.placeOrderBal(stockID, qtyOrd));
	}
}


