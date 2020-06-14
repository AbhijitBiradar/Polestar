package com.polestar.configs;

import com.polestar.constants.Constants;
import com.polestar.constants.TestConstant;
import com.polestar.managers.FileReaderManager;
import com.polestar.utils.PropertyFileUtil;

public class DBConfig {
	private String dbURL;
	private String dbUserName;
	private String dbPassword;
	
	PropertyFileUtil propertyFileReader= FileReaderManager.getInstance().getPropertyReader();
		
	public String setDBURL() {
		System.out.println("Loading "+ Constants.dbConstant.DB_URL+" from property File");
		dbURL = propertyFileReader.getPropertyValue(Constants.dbConstant.DB_URL);
		if (dbURL != null) {
			System.out.println(Constants.dbConstant.DB_URL +" loaded successully from property File");
			return dbURL;
		} else {
			System.out.println("Loading "+ Constants.dbConstant.DB_URL +" from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}	
	
	public String setDBUserName() {
		System.out.println("Loading "+ Constants.dbConstant.DB_USER_NAME +" from property File");
		dbUserName = propertyFileReader.getPropertyValue(Constants.dbConstant.DB_USER_NAME);
		if (dbUserName != null) {
			System.out.println(Constants.dbConstant.DB_USER_NAME +" loaded successully from property File");
			return dbUserName;
		} else {
			System.out.println("Loading "+ Constants.dbConstant.DB_USER_NAME +" from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}
	
	public String setDBPassword() {
		System.out.println("Loading "+ Constants.dbConstant.DB_PASSWORD +" from property File");
		dbPassword = propertyFileReader.getPropertyValue(Constants.dbConstant.DB_PASSWORD);
		if (dbPassword != null) {
			System.out.println(Constants.dbConstant.DB_PASSWORD +" loaded successully from property File");
			return dbPassword;
		} else {
			System.out.println("Loading "+ Constants.dbConstant.DB_PASSWORD +" from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}
	
	public String getDBURL() {
		return dbURL;
	}
	
	public String getDBUserName() {
		return dbUserName;
	}
	
	public String getDBPassword() {
		return dbPassword;
	}
	
	public void setAllDBConfig() {
		setDBURL();
		setDBUserName();
		setDBPassword();
	}
	
}
