package com.polestar.managers;

import com.polestar.readers.ConfigFileReader;
import com.polestar.utils.PropertyUtil;

public class FileReaderManager {
	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static ConfigFileReader configFileReader;
	private static PropertyUtil propertyFileReader;

	private FileReaderManager() {
	}

	public static FileReaderManager getInstance() {
		return fileReaderManager;
	}

	public ConfigFileReader getConfigReader() {
		if(configFileReader == null) {
			configFileReader=new ConfigFileReader();
		}
		return configFileReader;
	}
	
	public PropertyUtil getPropertyReader() {
		if(propertyFileReader == null) {
			propertyFileReader=new PropertyUtil();
		}
		return propertyFileReader;
	}
}
