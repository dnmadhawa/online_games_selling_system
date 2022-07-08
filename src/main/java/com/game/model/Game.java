package com.game.model;



public class Game {

	private int gameID;
    private String gname;
    private String create_date;
    private String genre;
    private String platform;
    private String price;
    private String description;
    
	/**
	 * @param gameID
	 * @param gname
	 * @param create_date
	 * @param genre
	 * @param platform
	 * @param price
	 * @param description
	 */
	public Game(int gameID, String gname, String create_date, String genre, String platform, String price,
			String description) {
		this.gameID = gameID;
		this.gname = gname;
		this.create_date = create_date;
		this.genre = genre;
		this.platform = platform;
		this.price = price;
		this.description = description;
	}
	
	/**
	 * @return the gameID
	 */
	public int getGameID() {
		return gameID;
	}
	
	/**
	 * @return the gname
	 */
	public String getGname() {
		return gname;
	}
	
	/**
	 * @return the create_date
	 */
	public String getCreate_date() {
		return create_date;
	}
	
	/**
	 * @return the genre
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
	
	/**
	 * @param gameID the gameID to set
	 */
	public void setGameID(int gameID) {
		this.gameID = gameID;
	}
	
	/**
	 * @param gname the gname to set
	 */
	public void setGname(String gname) {
		this.gname = gname;
	}
	
	/**
	 * @param create_date the create_date to set
	 */
	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}
	
	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	/**
	 * @param platform the platform to set
	 */
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	
	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
}
