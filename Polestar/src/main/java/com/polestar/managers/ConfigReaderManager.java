package com.polestar.managers;

import com.polestar.utils.DBUtil;

public class ConfigReaderManager {

	
	public void loadAllConfigs() {
		
	}
	
	
	private static ConfigReaderManager configReaderManager=new ConfigReaderManager();	
	
	private ConfigReaderManager() {
		
	}
	
	public static ConfigReaderManager getInstance() {
		return configReaderManager;
	}	
	
	
}
