package com.homework.models.entity;

import java.sql.Date;

import javax.persistence.*;  
@Entity 
@Table(name = "as_user") 
public class User {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO) 
    private int id; 
	
	@Column(name="work_id",nullable = false,length = 255)
	private String work_id;
	
	@Column(name="password",nullable = false,length = 255)
	private String password;
	
	@Column(name = "name", nullable = false, length = 255)
	private String name; 
	
	@Column(name = "birth", nullable = false)  
	private Date birth;
	
	@Column(name="work_start",nullable = false)
	private Date work_start;
	
	@Column(name="sex",nullable = false)
	private boolean sex;
	
	@Column(name="department",nullable = false)
	private int department;
	
	@Column(name="level",nullable = false)
	private int level;
	
	@Column(name="leave_day",nullable = false)
	private int leave_day;
	
	public int getId() {  
        return id;  
    }
	public void setId(int id) {  
        this.id=id;  
    }
	
	public String getPassword() {  
        return name;  
    }
	public void setPassword(String name) {  
        this.name=name;  
    }
	
	public String getName() {  
        return name;  
    }
	public void setName(String name) {  
        this.name=name;  
    }
	
	public Date getBirth() {  
        return birth;  
    }
	public void setBirth(Date birth) {  
        this.birth=birth;  
    }
	
	public Date getWork_start() {  
        return work_start;  
    }
	public void setWork_start(Date work_start) {  
        this.work_start=work_start;  
    }

	public boolean getSex() {  
        return sex;  
    }
	public void setSex(boolean sex) {
		this.sex=sex;

	}

	public int getDepartment() {  
        return department;  
    }
	public void setDepartment(int department) {  
        this.department=department;  
    }
	
	public int getLevel() {  
        return level;  
    }
	public void setLevel(int level) {  
        this.level=level;  
    }
	
	public int getLeave_day() {  
        return leave_day;  
    }
	public void setLeave_day(int leave_day) {  
        this.leave_day=leave_day;  
    }
}

