package com.hcl.inventory;



public class SetStock {
private String stockid;

public String getStockid() {
	return stockid;
}

public void setStockid(String stockid) {
	this.stockid = stockid;
}
public Stock setStock(){
	
	
	return StockBAL.setStockBal(stockid);
}
}
