package com.game.service;

import java.util.List;
import java.util.logging.Logger;

import com.game.model.Game;
import com.game.model.MyGame;

public interface IMyGameService {
	
	//Initialize logger
	public static final Logger log = Logger.getLogger(IMyGameService.class.getName());
	
	
    public boolean insertMyGame(String gid, int cusid, String gname, String guname, String gpass, String points, String lang);		
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

    public List<MyGame> getMyGame(int cusid);
	/**
	 * Get all My Games
	 * 
	 * @param cusid
	 * @return ArrayList<MyGame> 
	 */
    
    public boolean updateMyGame(String mgid, String guname, String gpass, String points, String lang);
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
    
    public  boolean deleteMyGame(String mgid);
    /**
	 * Delete My Games
	 * 
	 * @param mgid
	 * 
	 * @return boolean
	 */   
    
    public List<Game> getGame();
    /**
	 * Delete My Games
	 * 
	 * @param mgid
	 * 
	 * @return ArrayList<Game> 
	 */
}
