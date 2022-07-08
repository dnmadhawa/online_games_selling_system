package com.game.service;

import java.sql.Connection;



import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.game.model.Admin;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.game.util.DBConnect;
import com.game.util.CommonConstants;

public class adminServiceImpl implements InterfaceAdminService {
	static boolean  loginState = false;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	public static final Logger adminlog = Logger.getLogger(adminServiceImpl.class.getName());
	
	public adminServiceImpl () {
		
	}
	
	public List<Admin> validate(String userName, String password){
		ArrayList<Admin> admin = new ArrayList<>();
		
		
		
		//validate
		
		try {
			
			
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "select * from admin where userName='"+userName+"' and password='"+password+"'";
			rs = stmt.executeQuery(sql);
			
			
			
			if (rs.next()) {
				int id = rs.getInt(CommonConstants.COLUMN_INDEX_ONE);
				String name = rs.getString(CommonConstants.COLUMN_INDEX_TWO);
				String phone = rs.getString(CommonConstants.COLUMN_INDEX_THREE);
				String user_name = rs.getString(CommonConstants.COLUMN_INDEX_FOUR);
				String user_password = rs.getString(CommonConstants.COLUMN_INDEX_FIVE);
				
				Admin ad = new Admin(id,name , phone , user_name , user_password);
				admin.add(ad);
				
				loginState = true; 
			} else {
				loginState = false;
			}
			
		}catch (Exception e) {
			adminlog.log(Level.SEVERE, e.getMessage());
		}
		
		
		
		return admin;
	}
	public boolean getLoginState() {
		return loginState;
	}
}
