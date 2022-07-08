package com.game.model;

public class MyGame {
	private int myg_id;
	private int game_id;
	private String game_name;
	private String game_username;
	private String game_pass;
	private int game_points;
	private String language;
	
	/**
	 * @param myg_id
	 * @param game_id
	 * @param game_name
	 * @param game_username
	 * @param game_pass
	 * @param game_points
	 * @param language
	 */
	public MyGame(int myg_id, int game_id, String game_name, String game_username, String game_pass, int game_points,
			String language) {
		this.myg_id = myg_id;
		this.game_id = game_id;
		this.game_name = game_name;
		this.game_username = game_username;
		this.game_pass = game_pass;
		this.game_points = game_points;
		this.language = language;
	}

	/**
	 * @return the myg_id
	 */
	public int getMyg_id() {
		return myg_id;
	}

	/**
	 * @return the game_id
	 */
	public int getGame_id() {
		return game_id;
	}

	/**
	 * @return the game_name
	 */
	public String getGame_name() {
		return game_name;
	}

	/**
	 * @return the game_username
	 */
	public String getGame_username() {
		return game_username;
	}

	/**
	 * @return the game_pass
	 */
	public String getGame_pass() {
		return game_pass;
	}

	/**
	 * @return the game_points
	 */
	public int getGame_points() {
		return game_points;
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param myg_id the myg_id to set
	 */
	public void setMyg_id(int myg_id) {
		this.myg_id = myg_id;
	}

	/**
	 * @param game_id the game_id to set
	 */
	public void setGame_id(int game_id) {
		this.game_id = game_id;
	}

	/**
	 * @param game_name the game_name to set
	 */
	public void setGame_name(String game_name) {
		this.game_name = game_name;
	}

	/**
	 * @param game_username the game_username to set
	 */
	public void setGame_username(String game_username) {
		this.game_username = game_username;
	}

	/**
	 * @param game_pass the game_pass to set
	 */
	public void setGame_pass(String game_pass) {
		this.game_pass = game_pass;
	}

	/**
	 * @param game_points the game_points to set
	 */
	public void setGame_points(int game_points) {
		this.game_points = game_points;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	


}
