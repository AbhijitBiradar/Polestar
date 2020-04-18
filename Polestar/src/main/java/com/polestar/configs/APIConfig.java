package com.polestar.configs;

import com.polestar.constants.TestConstants;
import com.polestar.utils.PropertyFileUtil;

public class APIConfig {		
	PropertyFileUtil propertyFileUtil=new PropertyFileUtil();
	private String propertyFilePath="C:\\Users\\Sony\\git\\Polestar\\Polestar\\src\\main\\resources\\Config\\APIConfig.properties";
	
	public APIConfig() {
		propertyFileUtil.loadPropertyFile(propertyFilePath);
	}
	public String getBaseURI() {
		//System.out.println("Loading "+ TestConstants.URL +" from property File");
		String url = propertyFileUtil.getPropertyValue(TestConstants.BASE_URI);
		if (url != null) {
			System.out.println(TestConstants.BASE_URI +" loaded successully from property File");
			return url;
		} else {
			System.out.println("Loading "+ TestConstants.BASE_URI +" from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}
	
    
}