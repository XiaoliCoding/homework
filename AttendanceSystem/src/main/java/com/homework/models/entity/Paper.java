package com.homework.models.entity;

import java.sql.Date;

import javax.persistence.*;  
@Entity 
@Table(name = "as_paper") 
public class Paper {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO) 
    private int id; 
	
	@Column(name="type",nullable = false,length = 255)
	private String type;
	
	@Column(name="content",nullable = false,length = 255)
	private String content;
	
	@Column(name = "start", nullable = false)  
	private Date start;
	
	@Column(name = "end", nullable = false)  
	private Date end;
	
	@Column(name="flag",nullable = false)
	private int flag;
	
	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}



	
}

