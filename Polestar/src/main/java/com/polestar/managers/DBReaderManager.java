package com.polestar.managers;

import com.polestar.utils.DBUtil;

public class DBReaderManager {
	private static DBReaderManager dbReaderManager=new DBReaderManager();
	private static DBUtil dbReader;
	
	private DBReaderManager() {
		
	}
	
	public static DBReaderManager getInstance() {
		return dbReaderManager;
	}	
	
	public DBUtil getDBReader() {
		return (dbReader == null) ? new DBUtil() : dbReader;
	}
}
