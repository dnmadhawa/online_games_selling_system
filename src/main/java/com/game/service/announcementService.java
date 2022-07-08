package com.game.service;
import java.sql.Connection;


import java.util.logging.Level;
import java.util.logging.Logger;



import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.game.model.announcement;
import com.game.model.*;
import com.game.util.DBConnect;
import com.game.util.CommonConstants;


public class announcementService {

	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static final Logger announcelog = Logger.getLogger(adminServiceImpl.class.getName());
	
	public static boolean insertAnnouncement(String announcement ,String description , String section ,String announcementHead) {
		boolean isSuccess = false;
		
		
		
		try {
            
			con = DBConnect.getConnection();
			
			stmt = con.createStatement();
			
			String sql = "insert into announcement values (0,'"+announcement+"','"+description+"','"+section+"','"+announcementHead+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
		}
		catch (Exception e) {
			announcelog.log(Level.SEVERE, e.getMessage());
		}
		
		return isSuccess;
	}
	
	//data retrive method
	
	public static List<announcement> getAnnouncementDetails(String Id){
		
		int convertedID = Integer.parseInt(Id);
		
		ArrayList<announcement> announ = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from announcement where announcementID = '"+convertedID+"'";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				 int announcementID = rs.getInt(CommonConstants.COLUMN_INDEX_ONE) ;
				 String announcement = rs.getString(CommonConstants.COLUMN_INDEX_TWO);
				 String description = rs.getString(CommonConstants.COLUMN_INDEX_THREE);
				 String section = rs.getString(CommonConstants.COLUMN_INDEX_FOUR) ; 
				 String announcementHead = rs.getString(CommonConstants.COLUMN_INDEX_FIVE);
				 
				 
				 announcement annou = new announcement( announcementID, announcement, description,section,
							announcementHead);
				 
				 announ.add(annou);
			}
			
		}
		catch (Exception e) {
			announcelog.log(Level.SEVERE, e.getMessage());
		}
		
		return announ;
	}
	
	public static boolean updateAnnouncement(String annoID ,String announcement ,String description , String section ,String announcementHead) {
		
		boolean successStatus = false ;
		
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "update announcement set announcement = '"+announcement+"' , description = '"+description+"' ,section = '"+section+"' ,announcementHead = '"+announcementHead+"'"+"where announcementID='"+annoID+"'";
			int rs = stmt.executeUpdate(sql);
			
			
			
			if (rs > 0) {
				successStatus = true;
			}else {
				successStatus = false;
			}
			
		}catch (Exception e) {
			announcelog.log(Level.SEVERE, e.getMessage());
		}
		
		return successStatus;
		
	}
	
	public static boolean deleteAnnouncement(String announcementID) {
		
		boolean delSuccessState = false;
		
		int delConvertedID = Integer.parseInt(announcementID);
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "delete from announcement where announcementID = '"+delConvertedID+"'";
			int delRs = stmt.executeUpdate(sql);
			
			if (delRs > 0 ) {
				delSuccessState = true;
			}else {
				delSuccessState = false;
			}
			
		}
		catch (Exception e) {
			announcelog.log(Level.SEVERE, e.getMessage());
		}
		
		return delSuccessState ;
	}
	
	
	public static int getHighestID () {
		int highestID = 0;
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "select max(announcementID) from announcement";
			stmt.execute(sql);
			rs = stmt.getResultSet();
			
			if(rs.next()) {
				highestID = rs.getInt(1);
				
			}
			
		}catch (Exception e) {
			announcelog.log(Level.SEVERE, e.getMessage());
		}
		
		return highestID;
	}
	
	public static int getLowestID () {
		int lowestID = 0;
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "select min(announcementID) from announcement";
			stmt.execute(sql);
			rs = stmt.getResultSet();
			
			if(rs.next()) {
				lowestID = rs.getInt(1);
				
			}
			
		}catch (Exception e) {
			announcelog.log(Level.SEVERE, e.getMessage());
		}
		
		return lowestID;
	}
	
	
	public static String getAnnouncementHead(String Id){
		
		int convertedID = Integer.parseInt(Id);
		String announHead = "\n";
		
		
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from announcement where announcementID = '"+convertedID+"'";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				  
				 String announcementHead = rs.getString(5);
				 announHead = announcementHead;
			}
			
		}
		catch (Exception e) {
			announcelog.log(Level.SEVERE, e.getMessage());
		}
		
		return announHead;
	}
	
}
