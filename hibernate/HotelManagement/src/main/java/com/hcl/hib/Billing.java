package com.hcl.hib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Billing")
public class Billing {
	private String BookID ;
	private String RoomID ;
	  private int NoOfDays ;
	  private int BillAmt ;
	  
	  @Id
	  @Column(name="BookID")
	public String getBookID() {
		return BookID;
	}
	public void setBookID(String bookID) {
		BookID = bookID;
	}
	  @Column(name="RoomID")

	public String getRoomID() {
		return RoomID;
	}
	public void setRoomID(String roomID) {
		RoomID = roomID;
	}
	  @Column(name="NoOfDays")

	public int getNoOfDays() {
		return NoOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		NoOfDays = noOfDays;
	}
	  @Column(name="BillAmt")

	public int getBillAmt() {
		return BillAmt;
	}
	public void setBillAmt(int billAmt) {
		BillAmt = billAmt;
	}

}
