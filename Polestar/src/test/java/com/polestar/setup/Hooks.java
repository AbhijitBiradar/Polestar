package com.polestar.setup;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.polestar.managers.DBReaderManager;
import com.polestar.managers.FileReaderManager;
import com.polestar.readers.ConfigFileReader;
import com.polestar.utils.DBUtil;
import com.polestar.utils.ReportUtil;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	private static ReportUtil reportUtil;
	private static boolean isReporterRunning;

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

	@Before
	public void beforeScenario() {
		if (!isReporterRunning) {
			reportUtil = new ReportUtil(System.getProperty("user.dir")
					+ FileReaderManager.getInstance().getConfigReader().getReportConfigInstance().getReportFilePath());
			isReporterRunning = true;
		}
	}

	@After
	public void afterScenario(Scenario scenario) throws IOException {
		String screenshotFileName = System.getProperty("user.dir")
				+ FileReaderManager.getInstance().getConfigReader().getScreenshotConfigInstance()
						.getScreenshotFilePath()
				+ scenario.getName().replaceAll(" ", "") + FileReaderManager.getInstance().getConfigReader()
						.getScreenshotConfigInstance().getScreenshotFileType();
		if (scenario.isFailed()) {
			// write take screeenshot code here
		}
		reportUtil.createTest(scenario, screenshotFileName);
		reportUtil.writeToReport();
	}

	@After
	public void afterTest() {
		// APIConfig.resetBaseURI();
		// APIConfig.resetBasePath();
	}
}
