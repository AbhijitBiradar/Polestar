package com.polestar.steps;

import com.polestar.endpoints.Endpoint;
import com.polestar.setup.TestContext;

public class BaseStep {
    private static final String BASE_URL = "http://bookstore.toolsqa.com";
    private Endpoint endPoint;

    public BaseStep(TestContext testContext) {
    	endPoint = testContext.getEndPoints();
    }

    public Endpoint getEndPoints() {
        return endPoint;
    }
}
