package com.game.model;

public class Admin {
	private int adminID;
	private String name;
	private String phone;
	private String userName;
	private String password;
	public Admin(int adminID, String name, String phone, String userName, String password) {
		
		this.adminID = adminID;
		this.name = name;
		this.phone = phone;
		this.userName = userName;
		this.password = password;
	}
	public int getAdminID() {
		return adminID;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getPassword() {
		return password;
	}
}
