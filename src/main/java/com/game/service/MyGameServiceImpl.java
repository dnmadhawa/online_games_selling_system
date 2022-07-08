package com.game.service;

import com.game.model.Game;
import com.game.model.MyGame;
import com.game.util.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MyGameServiceImpl implements IMyGameService{
	
	private static  boolean isSuccess = false;
	private static Connection con = null;
	private static ResultSet resultSet = null;
	private PreparedStatement preparedStatement;
	
	//Initialize logger 
	public static final Logger log = Logger.getLogger(MyGameServiceImpl.class.getName());
	
	//get my game query
	private static final String GET_MYGAME_QUERY = "SELECT * FROM my_game WHERE (cus_id = ?)";
	//insert my game query
	private static final String INSERT_MYGAME_QUERY = "INSERT INTO my_game VALUES (NULL,?, ?, ?, ?, ?, ?, ?)";
	//update my game query
	private static final String UPDATE_MYGAME_QUERY = "UPDATE my_game SET `game_username` = ?, `game_pass` = ?, `game_points` = ?, `language` = ? WHERE (`mg_id` = ?)";
	//delete my game query
	private static final String DELETE_MYGAME_QUERY = "DELETE FROM my_game WHERE (mg_id=?)";
	//get all game query
	private static final String GET_ALL_GAME_QUERY = "SELECT * FROM game";

	
	/**
	 * Insert My Game
	 * 
	 * @param gid
	 * @param cusid
	 * @param gamename
	 * @param Game Username
	 * @param Game Password
	 * @param Game Points
	 * @param language
	 * @return boolean
	 */
    public boolean insertMyGame(String gid, int cusid, String gname, String guname, String gpass, String points, String lang) {
    	    	
    	isSuccess = false;
    	
    	try {
    		boolean result;
    		con = DBConnect.getConnection();
    		preparedStatement = con.prepareStatement(INSERT_MYGAME_QUERY);
			con.setAutoCommit(false);
    		preparedStatement.setInt(CommonConstants.COLUMN_INDEX_ONE, cusid);
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_TWO, gid);
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_THREE, gname);
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_FOUR, guname);
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_FIVE, gpass);
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_SIX, points);
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_SEVEN, lang);
			result = preparedStatement.execute();
			con.commit();
    		if(result == false) {
    			//if Success
    			isSuccess = true;
    		} else {
    			//if unsuccess
    			log.log(Level.INFO, "Insert unsuccess!");
    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		log.log(Level.SEVERE,  e.getMessage());
    	} finally {
			/*
			 * Close prepared statement and database connectivity at the end of
			 * transaction
			 */
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				log.log(Level.SEVERE, e.getMessage());
			}
    	}
    	return isSuccess;
    }		
    
    
    /**
	 * Get all My Games
	 * 
	 * @param cusid
	 * @return ArrayList<MyGame> 
	 */
    public List<MyGame> getMyGame(int cusid) {
    	
    	ArrayList<MyGame> mgame = new ArrayList<>(); 
    	
    	try {
    		con = DBConnect.getConnection();
    	    preparedStatement = con.prepareStatement(GET_MYGAME_QUERY);
			preparedStatement.setInt(CommonConstants.COLUMN_INDEX_ONE, cusid);
			
			resultSet = preparedStatement.executeQuery();
    		while(resultSet.next()) {
    			int mygID = resultSet.getInt(CommonConstants.COLUMN_INDEX_ONE);
    			int gID = resultSet.getInt(CommonConstants.COLUMN_INDEX_THREE);
    			String gname = resultSet.getString(CommonConstants.COLUMN_INDEX_FOUR);
    			String g_uname = resultSet.getString(CommonConstants.COLUMN_INDEX_FIVE);
    			String g_pass = resultSet.getString(CommonConstants.COLUMN_INDEX_SIX);
    			int g_point = resultSet.getInt(CommonConstants.COLUMN_INDEX_SEVEN);
    			String lang = resultSet.getString(CommonConstants.COLUMN_INDEX_EIGHT);
    			
    			MyGame mgMyGame = new MyGame(mygID, gID, gname, g_uname, g_pass, g_point, lang);
    			mgame.add(mgMyGame);
    			
    		} 
    		
    	}
    	catch (Exception e) {
    		log.log(Level.SEVERE,  e.getMessage());
    	} finally {
			/*
			 * Close prepared statement and database connectivity at the end of
			 * transaction
			 */
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				log.log(Level.SEVERE, e.getMessage());
			}
    	}
 	
    	return mgame;
    }
    
    
    /**
	 * Update My Games
	 * 
	 * @param mgid
	 * @param Game Usernam
	 * @param Game Password
	 * @param Game Points
	 * @param language
	 * 
	 * @return boolean
	 */
    public boolean updateMyGame(String mgid, String guname, String gpass, String points, String lang) {
    	
    	
    	isSuccess = false;
    	int result;
    	try {
    		con = DBConnect.getConnection();
    		preparedStatement = con.prepareStatement(UPDATE_MYGAME_QUERY);
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_ONE, guname);
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_TWO, gpass);
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_THREE, points);
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_FOUR,lang);
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_FIVE, mgid);
			result = preparedStatement.executeUpdate();
    		if(result >0) {
    			//if Success
    			isSuccess = true;
    		} else {
    			//if unsuccess
    			log.log(Level.INFO, "Update unsuccess!");
    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		log.log(Level.SEVERE,  e.getMessage());
    	} finally {
			/*
			 * Close prepared statement and database connectivity at the end of
			 * transaction
			 */
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				log.log(Level.SEVERE, e.getMessage());
			}
    	}
 	
    	return isSuccess;
    }
    
    
    
	/**
	 * Delete My Games
	 * 
	 * @param mgid
	 * 
	 * @return ArrayList<Game> 
	 */
    public boolean deleteMyGame(String mgid) {
    	
    	
    	isSuccess = false;
    	int result;
    	try {
    		con = DBConnect.getConnection();    		
    		preparedStatement = con.prepareStatement(DELETE_MYGAME_QUERY);
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_ONE, mgid);
			result = preparedStatement.executeUpdate();
    		
    		if(result > 0) {
    			//if Success
    			isSuccess = true;
    		} else {
    			//if unsuccess
    			log.log(Level.INFO, "Delete unsuccess!");
    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		log.log(Level.SEVERE,  e.getMessage());
    	} finally {
			/*
			 * Close prepared statement and database connectivity at the end of
			 * transaction
			 */
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				log.log(Level.SEVERE, e.getMessage());
			}
    	}
 	
    	return isSuccess;
    }
    
    
    /**
	 * Delete My Games
	 * 
	 * @param mgid
	 * 
	 * @return ArrayList<Game> 
	 */
    public List<Game> getGame() {
    	    	
    	ArrayList<Game> game = new ArrayList<>(); 
    	
    	try {
    		con = DBConnect.getConnection();    		
    		preparedStatement = con.prepareStatement(GET_ALL_GAME_QUERY);
	
    		resultSet = preparedStatement.executeQuery();
    		
    		while(resultSet.next()) {
    			int gid = resultSet.getInt(CommonConstants.COLUMN_INDEX_ONE);
    			String gname = resultSet.getString(CommonConstants.COLUMN_INDEX_TWO);
    			String c_date = resultSet.getString(CommonConstants.COLUMN_INDEX_FOUR);
    			String genre = resultSet.getString(CommonConstants.COLUMN_INDEX_FIVE);
    			String platform = resultSet.getString(CommonConstants.COLUMN_INDEX_SIX);
    			String price = resultSet.getString(CommonConstants.COLUMN_INDEX_SEVEN);
    			String des = resultSet.getString(CommonConstants.COLUMN_INDEX_EIGHT);
    			
    			Game g = new Game(gid, gname, c_date, genre, platform, price, des);
    			game.add(g);
    			
    		} 
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	} finally {
			/*
			 * Close prepared statement and database connectivity at the end of
			 * transaction
			 */
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				log.log(Level.SEVERE, e.getMessage());
			}
    	}
 	
    	return game;
    }
}
