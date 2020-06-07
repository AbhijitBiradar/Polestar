package com.polestar.configs;

import com.polestar.constants.TestConstant;
import com.polestar.managers.FileReaderManager;
import com.polestar.utils.PropertyFileUtil;

public class LogConfig {		
	private String logFilePath;
	private String generateLog;
	private String appendLog;
	private String createNewLogFile;
	
	PropertyFileUtil propertyFileReader= FileReaderManager.getInstance().getPropertyReader();
	private String propertyFilePath="C:\\Users\\Sony\\git\\Polestar\\Polestar\\src\\test\\resources\\Config\\APIConfig.properties";
	
	public LogConfig() {
		propertyFileReader.loadPropertyFile(propertyFilePath);
	}
	
	public String setLogFilePath() {
		System.out.println("Loading "+ TestConstant.BASE_URI +" from property File");
		logFilePath = propertyFileReader.getPropertyValue(TestConstant.BASE_URI);
		if (logFilePath != null) {
			System.out.println(TestConstant.BASE_URI +" loaded successully from property File");
			return logFilePath;
		} else {
			System.out.println("Loading "+ TestConstant.BASE_URI +" from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}
	
	public String setGenerateLog() {
		System.out.println("Loading "+ TestConstant.BASE_URI +" from property File");
		generateLog = propertyFileReader.getPropertyValue(TestConstant.BASE_URI);
		if (generateLog != null) {
			System.out.println(TestConstant.BASE_URI +" loaded successully from property File");
			return generateLog;
		} else {
			System.out.println("Loading "+ TestConstant.BASE_URI +" from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}
	
	public String setAppendLog() {
		System.out.println("Loading "+ TestConstant.BASE_URI +" from property File");
		appendLog = propertyFileReader.getPropertyValue(TestConstant.BASE_URI);
		if (appendLog != null) {
			System.out.println(TestConstant.BASE_URI +" loaded successully from property File");
			return appendLog;
		} else {
			System.out.println("Loading "+ TestConstant.BASE_URI +" from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}
	
	public String setCreateNewLogFile() {
		System.out.println("Loading "+ TestConstant.BASE_URI +" from property File");
		createNewLogFile = propertyFileReader.getPropertyValue(TestConstant.BASE_URI);
		if (createNewLogFile != null) {
			System.out.println(TestConstant.BASE_URI +" loaded successully from property File");
			return createNewLogFile;
		} else {
			System.out.println("Loading "+ TestConstant.BASE_URI +" from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}
	
	public String getLogFilePath() {
		if(logFilePath==null) {
			setLogFilePath();			
		}		
		return logFilePath;
	}
	
	public String getGenerateLog() {
		if(generateLog==null) {
			setGenerateLog();			
		}
		return generateLog;
	}
	
	public String getAppendLog() {
		if(appendLog==null) {
			setAppendLog();			
		}		
		return appendLog;
	}
	
	public String getCreateNewLogFile() {
		if(createNewLogFile==null) {
			setCreateNewLogFile();			
		}
		return createNewLogFile;
	}
	
	public void setAllLogConfig() {
		setLogFilePath();
		setGenerateLog();
		setAppendLog();
		setCreateNewLogFile();
	}

}
