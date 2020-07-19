package com.polestar.configs;

import org.apache.log4j.Logger;

import com.polestar.constants.Constants;
import com.polestar.managers.FileReaderManager;
import com.polestar.utils.PropertyUtil;

public class DBConfig {
	private String dbURL;
	private String dbUserName;
	private String dbPassword;
	private String dbDriver;
	
	PropertyUtil propertyFileReader= FileReaderManager.getInstance().getPropertyReader();
	final static Logger log = Logger.getLogger(DBConfig.class);
	
	public String setDBDriver() {
		log.info("Loading "+ Constants.dbConstants.DB_DRIVER+" from property File");
		dbDriver = propertyFileReader.getPropertyValue(Constants.dbConstants.DB_DRIVER);
		if (dbDriver != null) {
			log.info(Constants.dbConstants.DB_DRIVER +" loaded successully from property File");
			return dbDriver;
		} else {
			log.info("Loading "+ Constants.dbConstants.DB_DRIVER +" from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}	
		
	public String setDBURL() {
		log.info("Loading "+ Constants.dbConstants.DB_URL+" from property File");
		dbURL = propertyFileReader.getPropertyValue(Constants.dbConstants.DB_URL);
		if (dbURL != null) {
			log.info(Constants.dbConstants.DB_URL +" loaded successully from property File");
			return dbURL;
		} else {
			log.info("Loading "+ Constants.dbConstants.DB_URL +" from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}	
	
	public String setDBUserName() {
		log.info("Loading "+ Constants.dbConstants.DB_USER_NAME +" from property File");
		dbUserName = propertyFileReader.getPropertyValue(Constants.dbConstants.DB_USER_NAME);
		if (dbUserName != null) {
			log.info(Constants.dbConstants.DB_USER_NAME +" loaded successully from property File");
			return dbUserName;
		} else {
			log.info("Loading "+ Constants.dbConstants.DB_USER_NAME +" from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}
	
	public String setDBPassword() {
		log.info("Loading "+ Constants.dbConstants.DB_PASSWORD +" from property File");
		dbPassword = propertyFileReader.getPropertyValue(Constants.dbConstants.DB_PASSWORD);
		if (dbPassword != null) {
			log.info(Constants.dbConstants.DB_PASSWORD +" loaded successully from property File");
			return dbPassword;
		} else {
			log.info("Loading "+ Constants.dbConstants.DB_PASSWORD +" from property File is failed");
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
	
	public String getDBDriver() {
		return dbDriver;
	}
	
	public void setAllDBConfig() {
		setDBURL();
		setDBUserName();
		setDBPassword();
		setDBDriver();
	}
	
}
