package com.hcl.hib;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Booking")
public class Booking {
	 private String BookId ;
	 private String RoomID;
	 private String CustName;
	 private String City ;
	 private Timestamp BookDate ;
	 private Timestamp ChkDate ;
	 
	 @Id
	 @Column(name="BookId")
	public String getBookId() {
		return BookId;
	}
	public void setBookId(String bookId) {
		BookId = bookId;
	}
	 @Column(name="RoomID")

	public String getRoomID() {
		return RoomID;
	}
	public void setRoomID(String roomID) {
		RoomID = roomID;
	}
	 @Column(name="CustName")

	public String getCustName() {
		return CustName;
	}
	public void setCustName(String custName) {
		CustName = custName;
	}
	 @Column(name="City")

	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	 @Column(name="BookDate")
	
	public Timestamp getBookDate() {
		return BookDate;
	}
	public void setBookDate(Timestamp bookDate) {
		BookDate = bookDate;
	}
	 @Column(name="ChkDate")
	public Timestamp getChkDate() {
		return ChkDate;
	}
	public void setChkDate(Timestamp chkDate) {
		ChkDate = chkDate;
	}

}
