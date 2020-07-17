package com.polestar.configs;

import org.apache.log4j.Logger;

import com.polestar.constants.Constants;
import com.polestar.managers.FileReaderManager;
import com.polestar.utils.PropertyFileUtil;

public class APIConfig {
	private PropertyFileUtil propertyFileReader = FileReaderManager.getInstance().getPropertyReader();
	final static Logger log = Logger.getLogger(APIConfig.class);
	private String baseURI;
	private String userID;

	public String setBaseURI() {		
		log.info("Loading " + Constants.apiConstant.BASE_URI + " from property File");
		baseURI = propertyFileReader.getPropertyValue(Constants.apiConstant.BASE_URI);
		if (baseURI != null) {
			log.info(Constants.apiConstant.BASE_URI + " loaded successully from property File");
			return baseURI;
		} else {
			log.info("Loading " + Constants.apiConstant.BASE_URI + " from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}

	public String getBaseURI() {
		if (baseURI == null) {
			setBaseURI();
		}
		return baseURI;
	}

	public String setUserID() {
		log.info("Loading " + Constants.apiConstant.USER_ID + " from property File");
		userID = propertyFileReader.getPropertyValue(Constants.apiConstant.USER_ID);
		if (userID != null) {
			log.info(Constants.apiConstant.USER_ID + " loaded successully from property File");
			return userID;
		} else {
			log.info("Loading " + Constants.apiConstant.USER_ID + " from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}

	public String getUserID() {
		if (userID == null) {
			setBaseURI();
		}
		return userID;
	}

	public void setAllAPIConfig() {
		setBaseURI();
		setUserID();
	}
}
