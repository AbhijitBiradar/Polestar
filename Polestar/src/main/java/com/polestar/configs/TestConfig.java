package com.polestar.configs;

import com.polestar.constants.TestConstant;
import com.polestar.managers.FileReaderManager;
import com.polestar.utils.PropertyFileUtil;

public class TestConfig {
	private String dryRun;
	private String testScreenShot;
	private String executeParallel;
	private String testEnvironment;
	
	PropertyFileUtil propertyFileReader= FileReaderManager.getInstance().getPropertyReader();
	private String propertyFilePath="C:\\Users\\Sony\\git\\Polestar\\Polestar\\src\\test\\resources\\Config\\APIConfig.properties";
	
	public TestConfig() {
		propertyFileReader.loadPropertyFile(propertyFilePath);
	}
	
	public String setDryRun() {
		System.out.println("Loading "+ TestConstant.BASE_URI +" from property File");
		dryRun = propertyFileReader.getPropertyValue(TestConstant.BASE_URI);
		if (dryRun != null) {
			System.out.println(TestConstant.BASE_URI +" loaded successully from property File");
			return dryRun;
		} else {
			System.out.println("Loading "+ TestConstant.BASE_URI +" from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}
	
	public String setTestScreenShot() {
		System.out.println("Loading "+ TestConstant.BASE_URI +" from property File");
		testScreenShot = propertyFileReader.getPropertyValue(TestConstant.BASE_URI);
		if (testScreenShot != null) {
			System.out.println(TestConstant.BASE_URI +" loaded successully from property File");
			return testScreenShot;
		} else {
			System.out.println("Loading "+ TestConstant.BASE_URI +" from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}
	
	public String setExecuteParallel() {
		System.out.println("Loading "+ TestConstant.BASE_URI +" from property File");
		executeParallel = propertyFileReader.getPropertyValue(TestConstant.BASE_URI);
		if (executeParallel != null) {
			System.out.println(TestConstant.BASE_URI +" loaded successully from property File");
			return executeParallel;
		} else {
			System.out.println("Loading "+ TestConstant.BASE_URI +" from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}
	
	public String setTestEnvironment() {
		System.out.println("Loading "+ TestConstant.BASE_URI +" from property File");
		testEnvironment = propertyFileReader.getPropertyValue(TestConstant.BASE_URI);
		if (testEnvironment != null) {
			System.out.println(TestConstant.BASE_URI +" loaded successully from property File");
			return testEnvironment;
		} else {
			System.out.println("Loading "+ TestConstant.BASE_URI +" from property File is failed");
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
