package com.polestar.steps;

import org.junit.Assert;

import com.polestar.datatypes.Book;
import com.polestar.datatypes.responses.IRestResponse;
import com.polestar.datatypes.responses.UserAccount;
import com.polestar.enums.Context;
import com.polestar.setup.TestContext;

import io.cucumber.java.en.Then;
import io.restassured.response.Response;

public class VerificationSteps extends BaseStep {

    public VerificationSteps(TestContext testContext) {
        super(testContext);
    }
    
    @Then("the book is added")
	public void the_book_is_added() {      	
    	Book book = (Book) getScenarioContext().getContext(Context.BOOK);
    	String userId = (String) getScenarioContext().getContext(Context.USER_ID);
        IRestResponse<UserAccount> userAccountResponse = (IRestResponse<UserAccount>) getScenarioContext().getContext(Context.USER_ACCOUNT_RESPONSE);

        Assert.assertTrue(userAccountResponse.isSuccessful());
        Assert.assertEquals(201, userAccountResponse.getStatusCode());

        Assert.assertEquals(userId, userAccountResponse.getBody().userID);
        Assert.assertEquals(book.isbn, userAccountResponse.getBody().books.get(0).isbn);
        
	}	

	@Then("the book is removed")
	public void the_book_is_removed() {
		String userId = (String) getScenarioContext().getContext(Context.USER_ID);
        Response response = (Response) getScenarioContext().getContext(Context.BOOK_REMOVE_RESPONSE);

        Assert.assertEquals(204, response.getStatusCode());

        IRestResponse<UserAccount> userAccountResponse = getEndPoints().getUserAccount(userId);
        Assert.assertEquals(200, userAccountResponse.getStatusCode());

        Assert.assertEquals(4, userAccountResponse.getBody().books.size());
	}
}
