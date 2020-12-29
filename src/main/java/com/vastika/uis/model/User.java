package com.vastika.uis.model;


public class User {
	
	private int  id;
	private String username;
	private  String password;
	private long mobileNo;

	private double Salary;
	private boolean isActive;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public  String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public  String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getmobileNo() {
		return mobileNo;
	}
	public void setmobileNo(long mobileNo) {
		this.mobileNo = mobileNo;

	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		this.Salary = salary;
	}
	public boolean getisActive() {
		return isActive;
	}
	public void setisActive(boolean isActive) {
		this.isActive = isActive;
	}

	
	
	

}
