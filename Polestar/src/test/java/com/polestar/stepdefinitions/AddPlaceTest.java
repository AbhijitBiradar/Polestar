package com.polestar.stepdefinitions;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import com.polestar.paylods.PlacePaylod;
import com.polestar.resources.Reources;
import com.polestar.specifactios.RequestSpec;
import com.polestar.utils.JsonUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;

public class AddPlaceTest extends BaseTest{	

	@Given("Add Place Payload with {string}  {string} {string}")
	public void add_Place_Payload_with(String string, String string2, String string3) throws IOException {
		requestSpec = given().spec(RequestSpec.requestSpecification()).body(PlacePaylod.addPlace());
	}

	@When("user calls {string} with {string} http request")
	public void user_calls_with_http_request(String resource, String method) {		
		responseSpec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();		
		
		response = requestSpec.when().post(Reources.placeResource.getAddPlaceResource());	
	}

	@Then("the API call got success with status code {int}")
	public void the_API_call_got_success_with_status_code(Integer int1) {
		assertEquals(response.getStatusCode(),200);
	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String keyValue, String expectedvalue) {
		assertEquals(JsonUtil.getJsonPath(response,keyValue),expectedvalue);		
	}

	@Then("verify place_Id created maps to {string} using {string}")
	public void verify_place_Id_created_maps_to_using(String string, String string2) {

	}
}
