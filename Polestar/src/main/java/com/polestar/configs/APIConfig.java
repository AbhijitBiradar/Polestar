package com.polestar.configs;

import com.polestar.constants.Constants;
import com.polestar.constants.TestConstant;
import com.polestar.managers.FileReaderManager;
import com.polestar.utils.PropertyFileUtil;

public class APIConfig {
	PropertyFileUtil propertyFileReader = FileReaderManager.getInstance().getPropertyReader();
	private String propertyFilePath = System.getProperty("user.dir")
			+ "\\src\\test\\resources\\Config\\APIConfig.properties";

	private String uri;
	private String logFilePath;

	public APIConfig() {		
			propertyFileReader.loadPropertyFile(propertyFilePath);
	}

	public String setBaseURI() {
		System.out.println("Loading " + Constants.apiConstant.BASE_URI + " from property File");
		uri = propertyFileReader.getPropertyValue(Constants.apiConstant.BASE_URI);
		if (uri != null) {
			System.out.println(Constants.apiConstant.BASE_URI + " loaded successully from property File");
			return uri;
		} else {
			System.out.println("Loading " + Constants.apiConstant.BASE_URI + " from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}

	public String getBaseURI() {
		if (uri == null) {
			setBaseURI();
		}
		return uri;
	}

	public void setAllAPIConfig() {
		setBaseURI();
	}
}
