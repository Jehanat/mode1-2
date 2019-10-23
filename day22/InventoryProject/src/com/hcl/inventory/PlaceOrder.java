package com.hcl.inventory;

public class PlaceOrder {
	private String stockid;
	private double qtyOrd;
	public String getStockid() {
		return stockid;
	}
	public void setStockid(String stockid) {
		this.stockid = stockid;
	}
	public double getQtyOrd() {
		return qtyOrd;
	}
	public void setQtyOrd(double qtyOrd) {
		this.qtyOrd = qtyOrd;
	}
	public String placeOrder(){
		
		
		return  StockBAL.placeOrderBal(stockid, qtyOrd);
	}

}
