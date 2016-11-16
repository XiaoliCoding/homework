package com.homework.models.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity 
@Table(name = "as_department") 
public class Department {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO) 
    private int id; 
	
	@Column(name="name",nullable = false,length=255)
	private String name;
	
	@Column(name="department",nullable = false)
	private int department;
	
	@Column(name = "departmentname", nullable = false, length = 255)
	private String departmentname; 
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	

}