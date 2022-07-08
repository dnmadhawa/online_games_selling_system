package com.game.util;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.game.service.IMyGameService;


public class CommonUtil {

	// Initialize logger 
	public static final Logger log = Logger.getLogger(IMyGameService.class.getName());

	public static final Properties properties = new Properties();

	static {
		try {
			
			// Read the property only once when load the class
			properties.load(CommonUtil.class.getResourceAsStream(CommonConstants.PROPERTY_FILE));
			
		} catch (IOException e) {
			// catch IOException 
			log.log(Level.SEVERE, e.getMessage());
		}
	}

	
}
