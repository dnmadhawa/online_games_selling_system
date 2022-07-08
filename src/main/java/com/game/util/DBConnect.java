package com.game.util;


import java.sql.DriverManager;
import java.io.IOException;
import java.sql.Connection;

public class DBConnect extends CommonUtil{
	
	private static Connection con;	
	
	// singleton pattern
	private DBConnect() {}
	
	public static Connection getConnection() throws ClassNotFoundException, IOException {
		/**
		 * Create Database connection for the given URL, Username and Password
		 * 
		 * @return Connection this returns SQL connection for MySql Database
		 * 
		 * @throws ClassNotFoundException
		 * @throws SQLException
		 */
		
		try {		
			
			//connection objects when connection is closed or it is null		 
			if (con == null || con.isClosed()) {
				
				Class.forName(properties.getProperty(CommonConstants.DRIVER_NAME));
				con = DriverManager.getConnection(properties.getProperty(CommonConstants.URL), properties.getProperty(CommonConstants.USERNAME), properties.getProperty(CommonConstants.PASSWORD));
			}
		} catch (Exception e) {
			System.out.println("Database connection is errorddd!!!");
		}
		
		return con;
	}
}
