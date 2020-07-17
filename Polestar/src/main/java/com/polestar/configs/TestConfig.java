package com.polestar.configs;

import org.apache.log4j.Logger;

import com.polestar.constants.Constants;
import com.polestar.managers.FileReaderManager;
import com.polestar.utils.PropertyFileUtil;

public class TestConfig {
	private String dryRun;
	private String testScreenShot;
	private String executeParallel;
	private String testEnvironment;
	
	final static Logger log = Logger.getLogger(TestConfig.class);
	PropertyFileUtil propertyFileReader = FileReaderManager.getInstance().getPropertyReader();
	
	public String setDryRun() {
		log.info("Loading " + Constants.testConstant.DRY_RUN + " from property File");
		dryRun = propertyFileReader.getPropertyValue(Constants.testConstant.DRY_RUN);
		if (dryRun != null) {
			log.info(Constants.testConstant.DRY_RUN + " loaded successully from property File");
			return dryRun;
		} else {
			log.info("Loading " + Constants.testConstant.DRY_RUN + " from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}

	public String setTestScreenShot() {
		log.info("Loading " + Constants.testConstant.TEST_SCREEN_SHOT + " from property File");
		testScreenShot = propertyFileReader.getPropertyValue(Constants.testConstant.TEST_SCREEN_SHOT);
		if (testScreenShot != null) {
			log.info(Constants.testConstant.TEST_SCREEN_SHOT + " loaded successully from property File");
			return testScreenShot;
		} else {
			log.info("Loading " + Constants.testConstant.TEST_SCREEN_SHOT + " from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}

	public String setExecuteParallel() {
		log.info("Loading " + Constants.testConstant.EXECUTE_PARALLEL + " from property File");
		executeParallel = propertyFileReader.getPropertyValue(Constants.testConstant.EXECUTE_PARALLEL);
		if (executeParallel != null) {
			log.info(Constants.testConstant.EXECUTE_PARALLEL + " loaded successully from property File");
			return executeParallel;
		} else {
			log.info("Loading " + Constants.testConstant.EXECUTE_PARALLEL + " from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}

	public String setTestEnvironment() {
		log.info("Loading " + Constants.testConstant.TEST_ENVIRONMENT + " from property File");
		testEnvironment = propertyFileReader.getPropertyValue(Constants.testConstant.TEST_ENVIRONMENT);
		if (testEnvironment != null) {
			log.info(Constants.testConstant.TEST_ENVIRONMENT + " loaded successully from property File");
			return testEnvironment;
		} else {
			log.info("Loading " + Constants.testConstant.TEST_ENVIRONMENT + " from property File is failed");
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
