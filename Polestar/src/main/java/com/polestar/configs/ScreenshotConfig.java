package com.polestar.configs;

import com.polestar.constants.TestConstant;
import com.polestar.managers.FileReaderManager;
import com.polestar.utils.PropertyFileUtil;

public class ScreenshotConfig {	
	private String captureScreenshot;
	private String screenshotFileType;
	private String screenshotType;
	private String screenshotFilePath;
	
	
	PropertyFileUtil propertyFileReader= FileReaderManager.getInstance().getPropertyReader();
	private String propertyFilePath="C:\\Users\\Sony\\git\\Polestar\\Polestar\\src\\test\\resources\\Config\\APIConfig.properties";
	
	public ScreenshotConfig() {
		propertyFileReader.loadPropertyFile(propertyFilePath);
	}
	
	public String setCaptureScreenshot() {
		System.out.println("Loading "+ TestConstant.BASE_URI +" from property File");
		captureScreenshot = propertyFileReader.getPropertyValue(TestConstant.BASE_URI);
		if (captureScreenshot != null) {
			System.out.println(TestConstant.BASE_URI +" loaded successully from property File");
			return captureScreenshot;
		} else {
			System.out.println("Loading "+ TestConstant.BASE_URI +" from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}
	
	public String setScreenshotFileType() {
		System.out.println("Loading "+ TestConstant.BASE_URI +" from property File");
		screenshotFileType = propertyFileReader.getPropertyValue(TestConstant.BASE_URI);
		if (screenshotFileType != null) {
			System.out.println(TestConstant.BASE_URI +" loaded successully from property File");
			return screenshotFileType;
		} else {
			System.out.println("Loading "+ TestConstant.BASE_URI +" from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}
	
	public String setScreenshotType() {
		System.out.println("Loading "+ TestConstant.BASE_URI +" from property File");
		screenshotType = propertyFileReader.getPropertyValue(TestConstant.BASE_URI);
		if (screenshotType != null) {
			System.out.println(TestConstant.BASE_URI +" loaded successully from property File");
			return screenshotType;
		} else {
			System.out.println("Loading "+ TestConstant.BASE_URI +" from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}
	
	public String setScreenshotFilePath() {
		System.out.println("Loading "+ TestConstant.BASE_URI +" from property File");
		screenshotFilePath = propertyFileReader.getPropertyValue(TestConstant.BASE_URI);
		if (screenshotFilePath != null) {
			System.out.println(TestConstant.BASE_URI +" loaded successully from property File");
			return screenshotFilePath;
		} else {
			System.out.println("Loading "+ TestConstant.BASE_URI +" from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}
	
	public String getCaptureScreenshot() {
		if(captureScreenshot==null) {
			setCaptureScreenshot();			
		}		
		return captureScreenshot;
	}
	
	public String getScreenshotFileType() {
		if(screenshotFileType==null) {
			setScreenshotFileType();			
		}
		return screenshotFileType;
	}
	
	public String getScreenshotType() {
		if(screenshotType==null) {
			setScreenshotType();			
		}		
		return screenshotType;
	}
	
	public String getScreenshotFilePath() {
		if(screenshotFilePath==null) {
			setScreenshotFilePath();			
		}
		return screenshotFilePath;
	}
	
	public void setAllScreenshotConfig() {
		setCaptureScreenshot();
		setScreenshotFileType();
		setScreenshotType();
		setScreenshotFilePath();
	}	
}
