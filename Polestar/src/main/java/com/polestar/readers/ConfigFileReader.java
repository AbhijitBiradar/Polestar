package com.polestar.readers;

import com.polestar.configs.APIConfig;
import com.polestar.configs.DBConfig;
import com.polestar.configs.LogConfig;
import com.polestar.configs.ReportConfig;
import com.polestar.configs.RunConfig;
import com.polestar.configs.ScreenshotConfig;
import com.polestar.configs.TestConfig;

public class ConfigFileReader {
	APIConfig apiConfig = new APIConfig();
	RunConfig runConfig = new RunConfig();
	TestConfig testConfig = new TestConfig();
	DBConfig dbConfig = new DBConfig();
	LogConfig logConfig = new LogConfig();
	ReportConfig reportConfig = new ReportConfig();
	ScreenshotConfig screenshotConfig = new ScreenshotConfig();

	public void loadAPIConfig() {
		apiConfig.setAllAPIConfig();
	}

	public void loadDBConfig() {
		dbConfig.setAllDBConfig();
	}

	public void loadRunConfig() {

	}

	public void loadTestConfig() {
		testConfig.setAllTestConfig();
	}

	public void loadTestDataConfig() {

	}

	public void loadLogConfig() {
		logConfig.setAllLogConfig();
	}

	public void loadReportConfig() {
		reportConfig.setAllReportConfig();
	}

	public void loadScreenshotConfig() {
		screenshotConfig.setAllScreenshotConfig();
	}

	public void loadAllConfigs() {
		loadAPIConfig();
		loadDBConfig();
		loadTestConfig();
		loadLogConfig();
		loadReportConfig();
		loadScreenshotConfig();
	}
}
