package com.polestar.steps;

import com.polestar.endpoints.Endpoint;
import com.polestar.managers.FileReaderManager;
import com.polestar.setup.ScenarioContext;
import com.polestar.setup.TestContext;

public class BaseStep {
    private static final String BASE_URL = FileReaderManager.getInstance().getConfigReader().getAPIConfigInstance().getBaseURI();
    private Endpoint endPoint;
    private ScenarioContext scenarioContext;

    public BaseStep(TestContext testContext) {
    	endPoint = testContext.getEndPoints();  
    	scenarioContext = testContext.getScenarioContext();
    }

    public Endpoint getEndPoints() {
        return endPoint;
    }
    
    public ScenarioContext getScenarioContext() {
		return scenarioContext;
	}
}
