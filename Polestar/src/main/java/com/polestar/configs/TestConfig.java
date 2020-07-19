package com.polestar.configs;

import org.apache.log4j.Logger;

import com.polestar.constants.Constants;
import com.polestar.managers.FileReaderManager;
import com.polestar.utils.PropertyUtil;

public class TestConfig {
	private String dryRun;
	private String testScreenShot;
	private String executeParallel;
	private String testEnvironment;
	
	final static Logger log = Logger.getLogger(TestConfig.class);
	PropertyUtil propertyFileReader = FileReaderManager.getInstance().getPropertyReader();
	
	public String setDryRun() {
		log.info("Loading " + Constants.testConstants.DRY_RUN + " from property File");
		dryRun = propertyFileReader.getPropertyValue(Constants.testConstants.DRY_RUN);
		if (dryRun != null) {
			log.info(Constants.testConstants.DRY_RUN + " loaded successully from property File");
			return dryRun;
		} else {
			log.info("Loading " + Constants.testConstants.DRY_RUN + " from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}

	public String setTestScreenShot() {
		log.info("Loading " + Constants.testConstants.TEST_SCREEN_SHOT + " from property File");
		testScreenShot = propertyFileReader.getPropertyValue(Constants.testConstants.TEST_SCREEN_SHOT);
		if (testScreenShot != null) {
			log.info(Constants.testConstants.TEST_SCREEN_SHOT + " loaded successully from property File");
			return testScreenShot;
		} else {
			log.info("Loading " + Constants.testConstants.TEST_SCREEN_SHOT + " from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}

	public String setExecuteParallel() {
		log.info("Loading " + Constants.testConstants.EXECUTE_PARALLEL + " from property File");
		executeParallel = propertyFileReader.getPropertyValue(Constants.testConstants.EXECUTE_PARALLEL);
		if (executeParallel != null) {
			log.info(Constants.testConstants.EXECUTE_PARALLEL + " loaded successully from property File");
			return executeParallel;
		} else {
			log.info("Loading " + Constants.testConstants.EXECUTE_PARALLEL + " from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}

	public String setTestEnvironment() {
		log.info("Loading " + Constants.testConstants.TEST_ENVIRONMENT + " from property File");
		testEnvironment = propertyFileReader.getPropertyValue(Constants.testConstants.TEST_ENVIRONMENT);
		if (testEnvironment != null) {
			log.info(Constants.testConstants.TEST_ENVIRONMENT + " loaded successully from property File");
			return testEnvironment;
		} else {
			log.info("Loading " + Constants.testConstants.TEST_ENVIRONMENT + " from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}

	public String getDryRun() {
		return dryRun;
	}

	public String getTestScreenShot() {
		return testScreenShot;
	}

	public String getExecuteParallel() {
		return executeParallel;
	}

	public String getTestEnvironment() {
		return testEnvironment;
	}

	public void setAllTestConfig() {
		getDryRun();
		getTestScreenShot();
		getExecuteParallel();
		getTestEnvironment();
	}
}
