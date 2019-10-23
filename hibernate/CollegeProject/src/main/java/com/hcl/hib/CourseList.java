package com.hcl.hib;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="CourseList")

public class CourseList {
	 private int courseno ;
	 private int duration ;
	   private Date startDate ;
	   private Date endDate ;
	   private String HOD ;
	   
	   
	   @Id
		@Column(name="courseno")
	public int getCourseno() {
		return courseno;
	}
	public void setCourseno(int courseno) {
		this.courseno = courseno;
	}
	@Column(name="duration")
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Column(name="startDate")
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	@Column(name="endDate")
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	@Column(name="HOD")
	public String getHOD() {
		return HOD;
	}
	public void setHOD(String hOD) {
		HOD = hOD;
	}
}
