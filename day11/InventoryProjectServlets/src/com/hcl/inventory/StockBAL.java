package com.hcl.inventory;



public class StockBAL {
	public static String placeOrderBal(String stockId,int qtyOrd) {
		return new StockDAO().placeOrder(stockId, qtyOrd);
		}
		public static int generateOrderidBal(){
		return new StockDAO().generateOrderIdDao();}
	public static Stock setStockBal(String stockid){
		return new StockDAO().setStockDao(stockid);}
	
	
	
	public static String addStockidBal(Stock objstock) {
		return new StockDAO().addStockidDao(objstock);}
	
	public static String generateStockidBal() {
		return new StockDAO().generateStockidDao();
}}
