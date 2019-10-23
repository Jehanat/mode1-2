package com.hcl.inventory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StockDAO {

	
	PreparedStatement pst;
	Connection con;
	public int generateOrderIdDao(){
		con=DaoConnection.getConnection();
		int orderid=0;
		String cmd="select case when max(orderid) is null then 1"
		+ " else max(orderid)+1 "
		+ "end orderid from orders";
		try {
		pst=con.prepareStatement(cmd);

		ResultSet rs=pst.executeQuery();
		rs.next();
		orderid=rs.getInt("orderid");
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		       return orderid;     
		}



public String placeOrder(String stockId,double qtyOrd) {
Connection con=DaoConnection.getConnection();
Stock stock=setStockDao(stockId);
String result="";
if(stock!=null) {
double qtyAvail=stock.getQuantityAvail();
if(qtyAvail-qtyOrd >= 0) {
String cmd="update stock set quantityavail=quantityavail-? where stockid=?";
try {
pst=con.prepareStatement(cmd);
pst.setDouble(1, qtyOrd); 
pst.setString(2, stockId);
pst.executeUpdate();
int ordid=generateOrderIdDao();
cmd="insert into orders(orderid,stockid,qtyord,billamt) values(?,?,?,?) ";
pst=con.prepareStatement(cmd);
            pst.setInt(1,ordid);
            pst.setString(2,stockId);
            pst.setDouble(3, qtyOrd);
            double total=qtyOrd*stock.getPrice();
            pst.setDouble(4, total);
                  pst.executeUpdate();
                  cmd="Update amount set Gamt=Gamt+?";
                  pst=con.prepareStatement(cmd);
                  pst.setDouble(1, total);
                  pst.executeUpdate();
                  result="Order Placed Successfully...";
} catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
} else {
result="Insufficent Quantity...";
}
} else {
result="StockID not found...";
}
return result;
}

	
	
	public Stock setStockDao(String stockid){
		Connection con=DaoConnection.getConnection();
		String cmd="select * from Stock where stockid=?";
		Stock objStock=null;
		try {
			pst=con.prepareStatement(cmd);
			pst.setString(1, stockid);
			ResultSet rs=pst.executeQuery();
			if(rs.next()){
				objStock=new Stock();
				objStock.setItemName(rs.getString("ItemName"));
				objStock.setPrice(rs.getInt("Price"));
				objStock.setQuantityAvail(rs.getInt("QuantityAvail"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return objStock;
		}
	
	public String addStockid(Stock objStock){
		Connection con=DaoConnection.getConnection();
		String cmd="Insert into stock(Stockid,ItemName,Price,QuantityAvail) values(?,?,?,?)";
		String result="";
		try {
			pst=con.prepareStatement(cmd);
			pst.setString(1, objStock.getStockid());
			pst.setString(2, objStock.getItemName());
			pst.setInt(3, objStock.getPrice());
			pst.setInt(4, objStock.getQuantityAvail());
			pst.executeUpdate();
			result="Stock added successfully";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result=e.getMessage();
			
		}
		return result;
		
	}
	public String generateStockidDao() {
		Connection con=DaoConnection.getConnection();
		String stockid;
		String cmd="Select max(stockid) sid from stock";
		String stid="";
		
			try {
				PreparedStatement pst=con.prepareStatement(cmd);
				ResultSet rs=pst.executeQuery();
				rs.next();
				stid=rs.getString("sid");
				int id=Integer.parseInt(stid.substring(1));
				id++;
				String formated=String.format("%03d", id);
				stid="S"+formated;
			
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return stid;
		}

	}
	
		