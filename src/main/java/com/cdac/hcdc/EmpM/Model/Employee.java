package com.cdac.hcdc.EmpM.Model;



public class Employee {

	
private	int id;
private	String name;
private Long mobile;
private String country;

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
public Long getMobile() {
	return mobile;
}
public void setMobile(Long mobile) {
	this.mobile = mobile;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", mobile=" + mobile + ", country=" + country + "]";
}

	
}
