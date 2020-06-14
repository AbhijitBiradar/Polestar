package com.polestar.configs;

import com.polestar.constants.Constants;
import com.polestar.constants.TestConstant;
import com.polestar.managers.FileReaderManager;
import com.polestar.utils.PropertyFileUtil;

public class TestConfig {
	private String dryRun;
	private String testScreenShot;
	private String executeParallel;
	private String testEnvironment;

	PropertyFileUtil propertyFileReader = FileReaderManager.getInstance().getPropertyReader();
	
	public String setDryRun() {
		System.out.println("Loading " + Constants.testConstant.DRY_RUN + " from property File");
		dryRun = propertyFileReader.getPropertyValue(Constants.testConstant.DRY_RUN);
		if (dryRun != null) {
			System.out.println(Constants.testConstant.DRY_RUN + " loaded successully from property File");
			return dryRun;
		} else {
			System.out.println("Loading " + Constants.testConstant.DRY_RUN + " from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}

	public String setTestScreenShot() {
		System.out.println("Loading " + Constants.testConstant.TEST_SCREEN_SHOT + " from property File");
		testScreenShot = propertyFileReader.getPropertyValue(Constants.testConstant.TEST_SCREEN_SHOT);
		if (testScreenShot != null) {
			System.out.println(Constants.testConstant.TEST_SCREEN_SHOT + " loaded successully from property File");
			return testScreenShot;
		} else {
			System.out.println("Loading " + Constants.testConstant.TEST_SCREEN_SHOT + " from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}

	public String setExecuteParallel() {
		System.out.println("Loading " + Constants.testConstant.EXECUTE_PARALLEL + " from property File");
		executeParallel = propertyFileReader.getPropertyValue(Constants.testConstant.EXECUTE_PARALLEL);
		if (executeParallel != null) {
			System.out.println(Constants.testConstant.EXECUTE_PARALLEL + " loaded successully from property File");
			return executeParallel;
		} else {
			System.out.println("Loading " + Constants.testConstant.EXECUTE_PARALLEL + " from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}

	public String setTestEnvironment() {
		System.out.println("Loading " + Constants.testConstant.TEST_ENVIRONMENT + " from property File");
		testEnvironment = propertyFileReader.getPropertyValue(Constants.testConstant.TEST_ENVIRONMENT);
		if (testEnvironment != null) {
			System.out.println(Constants.testConstant.TEST_ENVIRONMENT + " loaded successully from property File");
			return testEnvironment;
		} else {
			System.out.println("Loading " + Constants.testConstant.TEST_ENVIRONMENT + " from property File is failed");
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
