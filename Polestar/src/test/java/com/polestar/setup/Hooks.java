package com.polestar.setup;

import java.sql.ResultSet;

import org.testng.annotations.BeforeClass;

import com.polestar.managers.DBReaderManager;
import com.polestar.utils.DBUtil;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@BeforeClass
    public void setup (){
		
		//load config File
		//ConfigFileReader configFileReader =FileReaderManager.getConfigReader()
		//configFileReader.loadConfigFile();
		
		//Load TestData file
		//TestDataFileReader testDataFileReader =FileReaderManager.getTestDataReader()
		//testDataFileReader.loadTestDataFile();		
		
		//load test status from DB
		DBUtil dbFileReader= DBReaderManager.getInstance().getDBReader();
		ResultSet r=dbFileReader.selectDataFromDB("", "", "", "");		
	}
	
	@Before
	public void beforeTest() {
		//initialize test related activity here
		
	}
	
	@After
    public void afterTest (){   
	 	//APIConfig.resetBaseURI();
	 	//APIConfig.resetBasePath();
    }
}
