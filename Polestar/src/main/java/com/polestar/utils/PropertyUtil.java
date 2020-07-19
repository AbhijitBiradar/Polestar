package com.polestar.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;

public class PropertyUtil {
	private Properties properties;
	private Map<Object, Object> map;
	final static Logger log = Logger.getLogger(PropertyUtil.class);
	private String propertyFilePath = System.getProperty("user.dir")
			+ "\\src\\test\\resources\\Config\\APIConfig.properties";

	public PropertyUtil() {
		loadPropertyFile(propertyFilePath);
	}

	public void loadPropertyFile(String propertyFilePath) {
		log.info("Loading " + propertyFilePath + " Property File");

		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				log.info("Property File :" + propertyFilePath + "loaded successfully !");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Properties file not found at path : " + propertyFilePath);
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException ignore) {
			}
		}
	}

	public String getPropertyValue(String propertyName) {
		log.info("Loading Property value for " + propertyName);

		String propertyValue = properties.getProperty(propertyName);
		if (propertyValue != null) {
			log.info("Property value loaded succesully for " + propertyName);
			return propertyValue;
		} else {
			log.info("Property value is not loaded succesully for " + propertyName);
			throw new RuntimeException(
					"Property not specified in the specified properties file for the key" + propertyName);
		}
	}

	public Map<Object, Object> getAllPropertyValue() {
		log.info("Loading all Property value initiated");

		Enumeration keys = properties.propertyNames();
		while (keys.hasMoreElements()) {
			String key = (String) keys.nextElement();
			map.put(key, properties.getProperty(key));
		}
		log.info("All Property value are loaded successfully");
		return map;
	}
}
