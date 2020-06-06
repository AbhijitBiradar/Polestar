package com.polestar.configs;

import com.polestar.constants.TestConstants;
import com.polestar.utils.PropertyFileUtil;

public class APIConfig {		
	PropertyFileUtil propertyFileUtil=new PropertyFileUtil();
	private String propertyFilePath="C:\\Users\\Sony\\git\\Polestar\\Polestar\\src\\test\\resources\\Config\\APIConfig.properties";
	
	private String uri;
	private String logFilePath;
	
	public APIConfig() {
		propertyFileUtil.loadPropertyFile(propertyFilePath);
	}
	public String setBaseURI() {
		System.out.println("Loading "+ TestConstants.BASE_URI +" from property File");
		uri = propertyFileUtil.getPropertyValue(TestConstants.BASE_URI);
		if (uri != null) {
			System.out.println(TestConstants.BASE_URI +" loaded successully from property File");
			return uri;
		} else {
			System.out.println("Loading "+ TestConstants.BASE_URI +" from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}
	
	public String setLogFilePath() {
		System.out.println("Loading "+ TestConstants.LOG_FILE_PATH +" from property File");
		logFilePath = propertyFileUtil.getPropertyValue(TestConstants.LOG_FILE_PATH);
		if (logFilePath != null) {
			System.out.println(TestConstants.LOG_FILE_PATH +" loaded successully from property File");
			return logFilePath;
		} else {
			System.out.println("Loading "+ TestConstants.LOG_FILE_PATH +" from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	} 
	
	public String getBaseURI() {
		if(uri==null) {
			setBaseURI();			
		}		
		return uri;
	}
	
	public String getLogFilePath() {
		if(logFilePath==null) {
			setLogFilePath();			
		}
		return logFilePath;
	}
}
