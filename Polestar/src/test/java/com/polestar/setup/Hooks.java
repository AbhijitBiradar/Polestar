package com.polestar.setup;

import org.testng.annotations.BeforeClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@BeforeClass
    public void setup (){
		///initialize all configuration
		//read test data file
		//read configuration file
		//read 
		
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
