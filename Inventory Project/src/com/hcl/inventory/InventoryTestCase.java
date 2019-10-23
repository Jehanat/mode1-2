package com.hcl.inventory;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;








public class InventoryTestCase {
	
	
	
	@Test
	public void testPlaceOrder(){
		assertEquals("Order Placed Successfully...",StockBAL.placeOrderBal("S008", 1));
		assertEquals("Insufficent Quantity...",StockBAL.placeOrderBal("S002", 8));
		assertEquals("StockID not found...",StockBAL.placeOrderBal("A005",2 ));
		
	}
	
	@Test
	public void testAddStock(){

		Stock objStock=new Stock();
		String stockid=StockBAL.generateStockidBal();
		    objStock.setStockid(stockid);
			objStock.setItemName("Mouse");
			objStock.setPrice(6987);
			objStock.setQuantityAvail(6);
			
			assertEquals("Stock added successfully",StockBAL.addStockidBal(objStock));
		
		
	}
	
	
	
	
	
	@Test
	public void testSetStock(){
		assertNotNull(StockBAL.setStockBal("S001"));
		assertNull(StockBAL.setStockBal("B001"));
	}
	
	
	
	
@Test
public void testDaoConnection(){
	assertNotNull(DaoConnection.getConnection());
}

	
	
	@Test
	public void testGenerateStockid(){
		String stockid=null;
		String stid="";
		Connection con=DaoConnection.getConnection();
		String cmd="Select max(stockid) sid from stock";
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
			assertEquals(stid,StockBAL.generateStockidBal());
		}
		
	
	
	
	@Test
     public void testGettersAndSetters() {
		
		Stock objStock=new Stock();
		objStock.setStockid("S005");
		objStock.setItemName("IWatch");
		objStock.setPrice(44000);
		objStock.setQuantityAvail(10);
		
		
		assertEquals("S005",objStock.getStockid());
		assertEquals("IWatch",objStock.getItemName());
		assertEquals(44000,objStock.getPrice());
		assertEquals(10,objStock.getQuantityAvail());
		
	}

}
