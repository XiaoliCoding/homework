package com.homework.models.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity 
@Table(name = "as_userpaper") 
public class UserPaper {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO) 
    private int id; 
	
	@Column(name="applyer",nullable = false)
	private int applyer;
	
	@Column(name="paper_id",nullable = false)
	private int paper_id;
	
	@Column(name = "state", nullable = false, length = 255)
	private String state; 
	
	@Column(name = "time", nullable = false)  
	private Date time;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getApplyer() {
		return applyer;
	}

	public void setApplyer(int applyer) {
		this.applyer = applyer;
	}

	public int getPaper_id() {
		return paper_id;
	}

	public void setPaper_id(int paper_id) {
		this.paper_id = paper_id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	
	
}