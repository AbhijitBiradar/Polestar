package com.polestar.setup;

import java.sql.ResultSet;
import java.sql.SQLException;

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
		ResultSet resultSet = dbFileReader.selectDataFromDB(
				FileReaderManager.getInstance().getConfigReader().getDBConfigInstance().getDBURL(),
				FileReaderManager.getInstance().getConfigReader().getDBConfigInstance().getDBUserName(),
				FileReaderManager.getInstance().getConfigReader().getDBConfigInstance().getDBPassword(),
				"select * from FunctionalTestExecution");

		try {
			if (resultSet.first()) {
				System.out.println("test case already passed !...");
				System.exit(0);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
