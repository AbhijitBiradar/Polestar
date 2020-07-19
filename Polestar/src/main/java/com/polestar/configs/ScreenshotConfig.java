package com.polestar.configs;

import org.apache.log4j.Logger;

import com.polestar.constants.Constants;
import com.polestar.managers.FileReaderManager;
import com.polestar.utils.PropertyUtil;

public class ScreenshotConfig {
	private String captureScreenshot;
	private String screenshotFileType;
	private String screenshotType;
	private String screenshotFilePath;

	PropertyUtil propertyFileReader = FileReaderManager.getInstance().getPropertyReader();
	final static Logger log = Logger.getLogger(ScreenshotConfig.class);

	public String setCaptureScreenshot() {
		log.info("Loading " + Constants.screenshotConstants.CAPTURE_SCREENSHOT + " from property File");
		captureScreenshot = propertyFileReader.getPropertyValue(Constants.screenshotConstants.CAPTURE_SCREENSHOT);
		if (captureScreenshot != null) {
			log.info(
					Constants.screenshotConstants.CAPTURE_SCREENSHOT + " loaded successully from property File");
			return captureScreenshot;
		} else {
			log.info(
					"Loading " + Constants.screenshotConstants.CAPTURE_SCREENSHOT + " from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}

	public String setScreenshotFileType() {
		log.info("Loading " + Constants.screenshotConstants.SCREENSHOT_FILE_TYPE + " from property File");
		screenshotFileType = propertyFileReader.getPropertyValue(Constants.screenshotConstants.SCREENSHOT_FILE_TYPE);
		if (screenshotFileType != null) {
			log.info(
					Constants.screenshotConstants.SCREENSHOT_FILE_TYPE + " loaded successully from property File");
			return screenshotFileType;
		} else {
			log.info(
					"Loading " + Constants.screenshotConstants.SCREENSHOT_FILE_TYPE + " from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}

	public String setScreenshotType() {
		log.info("Loading " + Constants.screenshotConstants.SCREENSHOT_TYPE + " from property File");
		screenshotType = propertyFileReader.getPropertyValue(Constants.screenshotConstants.SCREENSHOT_TYPE);
		if (screenshotType != null) {
			log.info(Constants.screenshotConstants.SCREENSHOT_TYPE + " loaded successully from property File");
			return screenshotType;
		} else {
			log.info(
					"Loading " + Constants.screenshotConstants.SCREENSHOT_TYPE + " from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}

	public String setScreenshotFilePath() {
		log.info("Loading " + Constants.screenshotConstants.SCREENSHOT_FILE_PATH + " from property File");
		screenshotFilePath = propertyFileReader.getPropertyValue(Constants.screenshotConstants.SCREENSHOT_FILE_PATH);
		if (screenshotFilePath != null) {
			log.info(
					Constants.screenshotConstants.SCREENSHOT_FILE_PATH + " loaded successully from property File");
			return screenshotFilePath;
		} else {
			log.info(
					"Loading " + Constants.screenshotConstants.SCREENSHOT_FILE_PATH + " from property File is failed");
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
