package com.game.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.game.model.Gplayer;
import com.game.util.*;


public class GPlayerDBUtil2 {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs= null;
    
	public static int validate( String email,String password)
	{ 
		int gid = 0;
		try 
		{
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from gameplayer where email ='"+email+"'and password = '"+password+"'";
			rs= stmt.executeQuery(sql);
			
			if(rs.next()) 
			{
				 gid = rs.getInt(1);
			}
			else
			{
				 gid = 0;
			}
		}
		catch(Exception e)
		{
			
		}
		return gid;
		
	}
	
	
	public static boolean enter( String name ,String email,String password,String cpassword)
	{ 
		try 
		{
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "INSERT INTO `online_gaming_site`.`gameplayer` (`name`, `email`, `password`) VALUES ('"+name+"', '"+email+"', '"+cpassword+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) 
			{
				isSuccess = true;
			}
			else
			{
				isSuccess = false;
			}
		}
		catch(Exception e)
		{
			
		}
		return isSuccess;
		
	}
	
public static List<Gplayer> show(int playid){
		
		
		
		ArrayList<Gplayer> play = new ArrayList<>();
		
		try 
		{
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from gameplayer where playerId ='"+playid+"'";
			rs= stmt.executeQuery(sql);
			if(rs.next()) 
			{
				 int id = rs.getInt(1);
				 String name = rs.getString(2);
				 String email = rs.getString(3);
				 String password = rs.getString(4);
				 
				 Gplayer g = new Gplayer(id,name,email,password);
				 play.add(g);

			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return play;
	}
	
	public static boolean updatePlayer(String pid , String pname,String pemail ,String ppassword) {
		
		try 
		{
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update gameplayer set name = '"+pname+"' , email ='"+pemail+"',password = '"+ppassword+"' where playerId = '" +pid+"'";
			int rs= stmt.executeUpdate(sql);
			
			if(rs>0)
			{
				isSuccess = true;
				
			}
			else
			{
				isSuccess = false;
			}
			
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static List<Gplayer> getPlayerDetails(String id)
	
	{
		int convertedID = Integer.parseInt(id);
		ArrayList<Gplayer> play = new ArrayList<>();
		try 
		{
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select from gameplayer where playerId = '"+convertedID+"'";
			rs= stmt.executeQuery(sql);
			
			while(rs.next()) 
			{
				 int pid = rs.getInt(1);
				 String pname = rs.getString(2);
				 String pemail = rs.getString(3);
				 String ppassword = rs.getString(4);
				 
				 Gplayer gp = new Gplayer(pid ,pname,pemail,ppassword);
				 play.add(gp);
			}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		return play;
	}
	
	public static boolean deletePlayer(String id) 
	{
		int convID = Integer.parseInt(id);
		
		try 
		{
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "delete from gameplayer where playerId = '"+convID+"'";
			int rs= stmt.executeUpdate(sql);
			
			if(rs>0) 
			{
				isSuccess= true;
			}
			else 
			{
				isSuccess = false;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();;
		}
		
		return isSuccess;
	}

}
