package com.hcl.inventory;

public class Stock {

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
	@Override
	public String toString() {
		return "Stock [stockid=" + stockid + ", ItemName=" + ItemName + ", Price=" + Price + ", QuantityAvail="
				+ QuantityAvail + "]";
	}
	public void setQtyOrd(int qtyOrd) {
		// TODO Auto-generated method stub
		
	}
	public void setStockid(int stockid2) {
		// TODO Auto-generated method stub
		
	}}
	