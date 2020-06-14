package com.polestar.configs;

import com.polestar.constants.Constants;
import com.polestar.constants.TestConstant;
import com.polestar.managers.FileReaderManager;
import com.polestar.utils.PropertyFileUtil;

public class ScreenshotConfig {
	private String captureScreenshot;
	private String screenshotFileType;
	private String screenshotType;
	private String screenshotFilePath;

	PropertyFileUtil propertyFileReader = FileReaderManager.getInstance().getPropertyReader();

	public String setCaptureScreenshot() {
		System.out.println("Loading " + Constants.screenshotConstant.CAPTURE_SCREENSHOT + " from property File");
		captureScreenshot = propertyFileReader.getPropertyValue(Constants.screenshotConstant.CAPTURE_SCREENSHOT);
		if (captureScreenshot != null) {
			System.out.println(
					Constants.screenshotConstant.CAPTURE_SCREENSHOT + " loaded successully from property File");
			return captureScreenshot;
		} else {
			System.out.println(
					"Loading " + Constants.screenshotConstant.CAPTURE_SCREENSHOT + " from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}

	public String setScreenshotFileType() {
		System.out.println("Loading " + Constants.screenshotConstant.SCREENSHOT_FILE_TYPE + " from property File");
		screenshotFileType = propertyFileReader.getPropertyValue(Constants.screenshotConstant.SCREENSHOT_FILE_TYPE);
		if (screenshotFileType != null) {
			System.out.println(
					Constants.screenshotConstant.SCREENSHOT_FILE_TYPE + " loaded successully from property File");
			return screenshotFileType;
		} else {
			System.out.println(
					"Loading " + Constants.screenshotConstant.SCREENSHOT_FILE_TYPE + " from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}

	public String setScreenshotType() {
		System.out.println("Loading " + Constants.screenshotConstant.SCREENSHOT_TYPE + " from property File");
		screenshotType = propertyFileReader.getPropertyValue(Constants.screenshotConstant.SCREENSHOT_TYPE);
		if (screenshotType != null) {
			System.out.println(Constants.screenshotConstant.SCREENSHOT_TYPE + " loaded successully from property File");
			return screenshotType;
		} else {
			System.out.println(
					"Loading " + Constants.screenshotConstant.SCREENSHOT_TYPE + " from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}

	public String setScreenshotFilePath() {
		System.out.println("Loading " + Constants.screenshotConstant.SCREENSHOT_FILE_PATH + " from property File");
		screenshotFilePath = propertyFileReader.getPropertyValue(Constants.screenshotConstant.SCREENSHOT_FILE_PATH);
		if (screenshotFilePath != null) {
			System.out.println(
					Constants.screenshotConstant.SCREENSHOT_FILE_PATH + " loaded successully from property File");
			return screenshotFilePath;
		} else {
			System.out.println(
					"Loading " + Constants.screenshotConstant.SCREENSHOT_FILE_PATH + " from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}

	public String getCaptureScreenshot() {
		if (captureScreenshot == null) {
			setCaptureScreenshot();
		}
		return captureScreenshot;
	}

	public String getScreenshotFileType() {
		if (screenshotFileType == null) {
			setScreenshotFileType();
		}
		return screenshotFileType;
	}

	public String getScreenshotType() {
		if (screenshotType == null) {
			setScreenshotType();
		}
		return screenshotType;
	}

	public String getScreenshotFilePath() {
		if (screenshotFilePath == null) {
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
