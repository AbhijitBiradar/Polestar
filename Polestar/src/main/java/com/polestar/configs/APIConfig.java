package com.polestar.configs;

import com.polestar.constants.Constants;
import com.polestar.managers.FileReaderManager;
import com.polestar.utils.PropertyFileUtil;

public class APIConfig {
	PropertyFileUtil propertyFileReader = FileReaderManager.getInstance().getPropertyReader();	
	private String uri;
	private String logFilePath;
	
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
