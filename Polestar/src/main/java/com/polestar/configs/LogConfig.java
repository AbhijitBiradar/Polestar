package com.polestar.configs;

import com.polestar.constants.Constants;
import com.polestar.constants.TestConstant;
import com.polestar.managers.FileReaderManager;
import com.polestar.utils.PropertyFileUtil;

public class LogConfig {		
	private String logFilePath;
	private String generateLog;
	private String appendLog;
	private String createNewLogFile;
	
	PropertyFileUtil propertyFileReader= FileReaderManager.getInstance().getPropertyReader();
		
	public String setLogFilePath() {
		System.out.println("Loading "+ Constants.logConstant.LOG_FILE_PATH +" from property File");
		logFilePath = propertyFileReader.getPropertyValue(Constants.logConstant.LOG_FILE_PATH);
		if (logFilePath != null) {
			System.out.println(Constants.logConstant.LOG_FILE_PATH +" loaded successully from property File");
			return logFilePath;
		} else {
			System.out.println("Loading "+ Constants.logConstant.LOG_FILE_PATH +" from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}
	
	public String setGenerateLog() {
		System.out.println("Loading "+ Constants.logConstant.GENERATE_LOG +" from property File");
		generateLog = propertyFileReader.getPropertyValue(Constants.logConstant.GENERATE_LOG);
		if (generateLog != null) {
			System.out.println(Constants.logConstant.GENERATE_LOG +" loaded successully from property File");
			return generateLog;
		} else {
			System.out.println("Loading "+ Constants.logConstant.GENERATE_LOG +" from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}
	
	public String setAppendLog() {
		System.out.println("Loading "+ Constants.logConstant.APPEND_LOG +" from property File");
		appendLog = propertyFileReader.getPropertyValue(Constants.logConstant.APPEND_LOG);
		if (appendLog != null) {
			System.out.println(Constants.logConstant.APPEND_LOG +" loaded successully from property File");
			return appendLog;
		} else {
			System.out.println("Loading "+ Constants.logConstant.APPEND_LOG +" from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}
	
	public String setCreateNewLogFile() {
		System.out.println("Loading "+ Constants.logConstant.CREATE_NEW_LOG_FILE +" from property File");
		createNewLogFile = propertyFileReader.getPropertyValue(Constants.logConstant.CREATE_NEW_LOG_FILE);
		if (createNewLogFile != null) {
			System.out.println(Constants.logConstant.CREATE_NEW_LOG_FILE +" loaded successully from property File");
			return createNewLogFile;
		} else {
			System.out.println("Loading "+ Constants.logConstant.CREATE_NEW_LOG_FILE +" from property File is failed");
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
