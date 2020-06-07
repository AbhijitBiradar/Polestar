package com.polestar.managers;

import com.polestar.readers.ConfigFileReader;
import com.polestar.utils.PropertyFileUtil;

public class FileReaderManager {
	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static ConfigFileReader configFileReader;
	private static PropertyFileUtil propertyFileReader;

	private FileReaderManager() {
	}

	public static FileReaderManager getInstance() {
		return fileReaderManager;
	}

	public ConfigFileReader getConfigReader() {
		return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
	}
	
	public PropertyFileUtil getPropertyReader() {
		return (propertyFileReader == null) ? new PropertyFileUtil() : propertyFileReader;
	}
}
