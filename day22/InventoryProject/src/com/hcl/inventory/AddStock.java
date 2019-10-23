package com.hcl.inventory;



public class AddStock {
	
	private String stockid;
	private String ItemName;
	private int Price;
	private int QuantityAvail;
	public String getStockid() {
		return stockid;
	}
	public void setStockid(String stockid) {
		this.stockid = stockid;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getQuantityAvail() {
		return QuantityAvail;
	}
	public void setQuantityAvail(int quantityAvail) {
		QuantityAvail = quantityAvail;
	}
	
	public String addStockid(){
		Stock objStock=new Stock();
		String stockid=StockBAL.generateStockidBal();
		objStock.setStockid(stockid);
		objStock.setItemName(ItemName);
		objStock.setPrice(Price);
		objStock.setQuantityAvail(QuantityAvail);
		
		
		return StockBAL.addStockidBal(objStock);
	}
}


	
