package com.hcl.inventory;

import java.util.Scanner;



public class SetStockMain {

public static void main(String[] args) {
	String stockid;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Stock Id:");
	stockid=sc.nextLine();
Stock objStock=StockBAL.setStockBal(stockid);
if(objStock!=null){
	System.out.println("Item Name:" +objStock.getItemName());
	System.out.println("Price:" +objStock.getPrice());
    System.out.println("Quantity available:" +objStock.getQuantityAvail());
    

}else{
	System.out.println("Stock Id  Not Found!");
}
}
}


