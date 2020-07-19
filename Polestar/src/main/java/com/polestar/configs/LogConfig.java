package com.polestar.configs;

import org.apache.log4j.Logger;

import com.polestar.constants.Constants;
import com.polestar.managers.FileReaderManager;
import com.polestar.utils.PropertyUtil;

public class LogConfig {		
	private String logFilePath;
	private String generateLog;
	private String appendLog;
	private String createNewLogFile;
	
	PropertyUtil propertyFileReader= FileReaderManager.getInstance().getPropertyReader();
	final static Logger log = Logger.getLogger(LogConfig.class);
		
	public String setLogFilePath() {
		log.info("Loading "+ Constants.logConstants.LOG_FILE_PATH +" from property File");
		logFilePath = propertyFileReader.getPropertyValue(Constants.logConstants.LOG_FILE_PATH);
		if (logFilePath != null) {
			log.info(Constants.logConstants.LOG_FILE_PATH +" loaded successully from property File");
			return logFilePath;
		} else {
			log.info("Loading "+ Constants.logConstants.LOG_FILE_PATH +" from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}
	
	public String setGenerateLog() {
		log.info("Loading "+ Constants.logConstants.GENERATE_LOG +" from property File");
		generateLog = propertyFileReader.getPropertyValue(Constants.logConstants.GENERATE_LOG);
		if (generateLog != null) {
			log.info(Constants.logConstants.GENERATE_LOG +" loaded successully from property File");
			return generateLog;
		} else {
			log.info("Loading "+ Constants.logConstants.GENERATE_LOG +" from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}
	
	public String setAppendLog() {
		log.info("Loading "+ Constants.logConstants.APPEND_LOG +" from property File");
		appendLog = propertyFileReader.getPropertyValue(Constants.logConstants.APPEND_LOG);
		if (appendLog != null) {
			log.info(Constants.logConstants.APPEND_LOG +" loaded successully from property File");
			return appendLog;
		} else {
			log.info("Loading "+ Constants.logConstants.APPEND_LOG +" from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}
	
	public String setCreateNewLogFile() {
		log.info("Loading "+ Constants.logConstants.CREATE_NEW_LOG_FILE +" from property File");
		createNewLogFile = propertyFileReader.getPropertyValue(Constants.logConstants.CREATE_NEW_LOG_FILE);
		if (createNewLogFile != null) {
			log.info(Constants.logConstants.CREATE_NEW_LOG_FILE +" loaded successully from property File");
			return createNewLogFile;
		} else {
			log.info("Loading "+ Constants.logConstants.CREATE_NEW_LOG_FILE +" from property File is failed");
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
