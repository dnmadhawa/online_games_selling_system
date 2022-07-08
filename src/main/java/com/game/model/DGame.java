package com.game.model;

/*This is the Game model class*/

public class DGame {
	
	private int gameID;
    private String gname;
    private int developerID;
    private String create_date;
    private String genre;
    private String platform;
    private String price;
    private String description;
	
	public DGame(int gameID, String gname, int developerID, String create_date, String genre, String platform,
			String price, String description) {
		this.gameID = gameID;
		this.gname = gname;
		this.developerID = developerID;
		this.create_date = create_date;
		this.genre = genre;
		this.platform = platform;
		this.price = price;
		this.description = description;
	}
	
	/**
	 * @return the GameID
	 */
	public int getGameID() {
		return gameID;
	}
	
	/**
	 * @return the Game name
	 */
	public String getGname() {
		return gname;
	}
	
	/**
	 * @return the developerID
	 */
	public int getDeveloperID() {
		return developerID;
	}
	
	/**
	 * @return the create date
	 */
	public String getCreate_date() {
		return create_date;
	}
	
	/**
	 * @return the Genre
	 */
	public String getGenre() {
		return genre;
	}
	
	/**
	 * @return the platform
	 */
	public String getPlatform() {
		return platform;
	}
	
	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}
	
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
    
	//insert data
	//update data
	//delete data
	
	public void insertdata() {
		//insert to data for the form
		System.out.println("Insert data - Game");
	}
	public void updatedata() {
		//update to data for the form
		System.out.println("Update data - Game");
	}
	public void deletedata() {
		//delete to data for the form
		System.out.println("Delete data - Game");
	}
}