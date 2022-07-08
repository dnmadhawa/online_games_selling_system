package com.game.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.game.model.DGame;
import com.game.util. *;




public class GameDBUtil {
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
		public static List<DGame> showGames(){
			
			ArrayList<DGame> gam = new ArrayList<>();

			
			try {
	       		con = DBConnect.getConnection();
	       		stmt = con.createStatement();
	       		String sql = "select * from game";
	       		rs = stmt.executeQuery(sql);
				
				while (rs.next()) {
					Integer GameID = rs.getInt(1);
					String Gamename = rs.getString(2);
					Integer DeveloperID = rs.getInt(3);
				    String date = rs.getString(4);
				    String Genre = rs.getString(5);
					String platform = rs.getString(6);
					String price = rs.getString(7);
					String description = rs.getString(8);
					
					DGame g = new DGame(GameID,Gamename,DeveloperID,date,Genre,platform,price,description);
					gam.add(g);
				}
				
			} 
			 catch (Exception e) {
				e.printStackTrace();
			}
			
			return gam;
		}
		
		
	
/*Insert the game details to the database*/
	
       public static boolean insertgame(String Gname,String DeveloperID,String create_date,String Genre,String platform,String price,String description){
    	   
    	   boolean isSuccess = false;
    	   
    	   
    	   
    	   try {
    		   con = DBConnect.getConnection();
    		   stmt = con.createStatement();
       		   String sql = "insert into game values (0,'"+Gname+"','"+DeveloperID+"','"+create_date+"','"+Genre+"','"+platform+"','"+price+"','"+description+"')";
       		   int rs = stmt.executeUpdate(sql);
       		if(rs > 0) {
       			isSuccess = true;
       		} else {
       			isSuccess = false;
       		}
       		
       	}
       	catch (Exception e) {
       		e.printStackTrace();
       	}

    	   return isSuccess;
       }
	
       
       /*Update game details*/
    public static boolean updategame(String GameID,String Gname,String DeveloperID,String create_date,String Genre,String platform,String price,String description){
    	   
    	   try {
    		   
    		   con = DBConnect.getConnection();
    		   stmt = con.createStatement();
    		   String sql =  "UPDATE game SET `Gname` = '"+Gname+"', `DeveloperID` = '"+DeveloperID+"', `create_date` = '"+create_date+"', `Genre` = '"+Genre+"', `platform` = '"+platform+"', `price` = "+price+", `description` = '"+description+"' WHERE `GameID` = '"+GameID+"'";
    		  

    		   int rs = stmt.executeUpdate(sql);
    		   
    		   if(rs > 0) {
    			   isSuccess = true;
    		   }
    		   else {
    			   isSuccess = false;
    		   }
    	   }
    	   catch(Exception e) {
    		   e.printStackTrace();
    	   }
    	   
    	   return isSuccess;
  }
       public static List<DGame> getgameDetails(String GameID) {
       	
       	int convertedID = Integer.parseInt(GameID);/*String value converted to the integer value*/
       	
       	ArrayList<DGame> ga = new ArrayList<>();
       	
       	try {
       		
       		con = DBConnect.getConnection();
       		stmt = con.createStatement();
       		String sql = "select * from game where GameID ='"+convertedID+"'";
       		rs = stmt.executeQuery(sql);
       		
       		if (rs.next()) {
				int GID = rs.getInt(1);
				String Gamename = rs.getString(2);
				int DeveloperID = rs.getInt(3);
			    String date = rs.getString(4);
			    String Genre = rs.getString(5);
				String platform = rs.getString(6);
				String price = rs.getString(7);
				String description = rs.getString(8);
				
				DGame g = new DGame(GID,Gamename,DeveloperID,date,Genre,platform,price,description);
				ga.add(g);
			}
       		
       	}
       	catch(Exception e) {
       		e.printStackTrace();
       	}	
       	return ga;	
       }
       
       /*delete game details */
       
       public static boolean deletegame(String GameID) {
       	
       	int convId = Integer.parseInt(GameID);
       	
       	try {
       		
       		con = DBConnect.getConnection();
       		stmt = con.createStatement();
       		String sql = "delete from game where GameID='"+convId+"'";
       		int r = stmt.executeUpdate(sql);
       		
       		if (r > 0) {
       			isSuccess = true;
       		}
       		else {
       			isSuccess = false;
       		}
       		
       	}
       	catch (Exception e) {
       		e.printStackTrace();
       	}
       	
       	return isSuccess;
       }
}   