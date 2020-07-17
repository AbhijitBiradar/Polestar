package com.polestar.setup;

import com.polestar.endpoints.Endpoint;
import com.polestar.enums.Context;
import com.polestar.managers.FileReaderManager;

public class TestContext {	
	private final String BASE_URL = FileReaderManager.getInstance().getConfigReader().getAPIConfigInstance().getBaseURI();	
	private final String USER_ID = FileReaderManager.getInstance().getConfigReader().getAPIConfigInstance().getUserID();

	private Endpoint endPoint;
	private ScenarioContext scenarioContext;

	public TestContext() {
		endPoint = new Endpoint(BASE_URL);
		scenarioContext = new ScenarioContext();
		scenarioContext.setContext(Context.USER_ID, USER_ID);
	}

	public Endpoint getEndPoints() {
		return endPoint;
	}

	public ScenarioContext getScenarioContext() {
		return scenarioContext;
	}
}
