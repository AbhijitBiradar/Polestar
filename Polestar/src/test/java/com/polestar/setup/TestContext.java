package com.polestar.setup;

import com.polestar.endpoints.Endpoint;
import com.polestar.enums.Context;

public class TestContext {
	private final String BASE_URL = "http://bookstore.toolsqa.com";
	private final String USER_ID = "9b5f49ab-eea9-45f4-9d66-bcf56a531b85";

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
