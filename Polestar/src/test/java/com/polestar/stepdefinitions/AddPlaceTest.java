package com.polestar.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddPlaceTest {

	@Given("Add Place Payload with {string}  {string} {string}")
	public void add_Place_Payload_with(String string, String string2, String string3) {
	    
	}

	@When("user calls {string} with {string} http request")
	public void user_calls_with_http_request(String string, String string2) {
	    
	}

	@Then("the API call got success with status code {int}")
	public void the_API_call_got_success_with_status_code(Integer int1) {
	    
	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String string, String string2) {
	    
	}

	@Then("verify place_Id created maps to {string} using {string}")
	public void verify_place_Id_created_maps_to_using(String string, String string2) {
	   
	}
}
