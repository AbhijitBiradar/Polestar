package com.polestar.setup;

import java.sql.ResultSet;

import org.testng.annotations.BeforeClass;

import com.polestar.managers.DBReaderManager;
import com.polestar.managers.FileReaderManager;
import com.polestar.readers.ConfigFileReader;
import com.polestar.utils.DBUtil;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before
	public void setup() {

		// load config File
		ConfigFileReader configFileReader = FileReaderManager.getInstance().getConfigReader();
		configFileReader.loadAllConfigs();

		// load previous test status from DB
		DBUtil dbFileReader = DBReaderManager.getInstance().getDBReader();
		ResultSet r = dbFileReader.selectDataFromDB("", "", "", "");

		// Load TestData file
		// TestDataFileReader testDataFileReader =FileReaderManager.getTestDataReader()
		// testDataFileReader.loadTestDataFile();
	}

	@Before
	public void beforeTest() {
		// load config File
		ConfigFileReader configFileReader = FileReaderManager.getInstance().getConfigReader();
		configFileReader.loadAllConfigs();

		// load test status from DB
		DBUtil dbFileReader = DBReaderManager.getInstance().getDBReader();
		ResultSet r = dbFileReader.selectDataFromDB("", "", "", "");

		// Load TestData file
		// TestDataFileReader testDataFileReader =FileReaderManager.getTestDataReader()
		// testDataFileReader.loadTestDataFile();
	}

	@After
	public void afterTest() {
		// APIConfig.resetBaseURI();
		// APIConfig.resetBasePath();
	}
}
