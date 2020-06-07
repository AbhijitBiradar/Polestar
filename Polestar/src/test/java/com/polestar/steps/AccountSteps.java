package com.polestar.steps;

import com.polestar.datatypes.AuthorizationRequest;
import com.polestar.setup.TestContext;

import io.cucumber.java.en.Given;

public class AccountSteps extends BaseStep {

    public AccountSteps(TestContext testContext){
    	super(testContext);
    }

    @Given("^I am an authorized user$")
    public void iAmAnAuthorizedUser() {
        AuthorizationRequest authRequest = new AuthorizationRequest("TOOLSQA-Test", "Test@@123");
        getEndPoints().authenticateUser(authRequest);
    }

}
