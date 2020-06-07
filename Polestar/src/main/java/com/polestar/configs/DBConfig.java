package com.polestar.configs;

import com.polestar.constants.TestConstant;
import com.polestar.managers.FileReaderManager;
import com.polestar.utils.PropertyFileUtil;

public class DBConfig {
	private String dbURL;
	private String dbUserName;
	private String dbPassword;
	
	PropertyFileUtil propertyFileReader= FileReaderManager.getInstance().getPropertyReader();
	private String propertyFilePath="C:\\Users\\Sony\\git\\Polestar\\Polestar\\src\\test\\resources\\Config\\APIConfig.properties";
	
	
	public DBConfig() {
		propertyFileReader.loadPropertyFile(propertyFilePath);
	}
	
	public String setDBURL() {
		System.out.println("Loading "+ TestConstant.BASE_URI +" from property File");
		dbURL = propertyFileReader.getPropertyValue(TestConstant.BASE_URI);
		if (dbURL != null) {
			System.out.println(TestConstant.BASE_URI +" loaded successully from property File");
			return dbURL;
		} else {
			System.out.println("Loading "+ TestConstant.BASE_URI +" from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}	
	
	public String setDBUserName() {
		System.out.println("Loading "+ TestConstant.BASE_URI +" from property File");
		dbUserName = propertyFileReader.getPropertyValue(TestConstant.BASE_URI);
		if (dbUserName != null) {
			System.out.println(TestConstant.BASE_URI +" loaded successully from property File");
			return dbUserName;
		} else {
			System.out.println("Loading "+ TestConstant.BASE_URI +" from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}
	
	public String setDBPassword() {
		System.out.println("Loading "+ TestConstant.BASE_URI +" from property File");
		dbPassword = propertyFileReader.getPropertyValue(TestConstant.BASE_URI);
		if (dbPassword != null) {
			System.out.println(TestConstant.BASE_URI +" loaded successully from property File");
			return dbPassword;
		} else {
			System.out.println("Loading "+ TestConstant.BASE_URI +" from property File is failed");
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
