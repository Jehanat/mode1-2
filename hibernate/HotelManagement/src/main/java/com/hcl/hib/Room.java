package com.hcl.hib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Room")
public class Room {
private String RoomID;
private String Type;
private String Status;
private int CostPerDay;

@Id
@Column(name="RoomID")
public String getRoomID() {
	return RoomID;
}
public void setRoomID(String roomID) {
	RoomID = roomID;
}
@Column(name="Type")
public String getType() {
	return Type;
}
public void setType(String type) {
	Type = type;
}
@Column(name="Status")
public String getStatus() {
	return Status;
}
public void setStatus(String status) {
	Status = status;
}
@Column(name="CostPerDay")
public int getCostPerDay() {
	return CostPerDay;
}
public void setCostPerDay(int costPerDay) {
	CostPerDay = costPerDay;
}
}
