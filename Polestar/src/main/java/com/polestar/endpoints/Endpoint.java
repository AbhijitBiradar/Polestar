package com.polestar.endpoints;

import org.apache.http.HttpStatus;

import com.polestar.datatypes.requests.AddBooksRequest;
import com.polestar.datatypes.requests.AuthorizationRequest;
import com.polestar.datatypes.requests.RemoveBookRequest;
import com.polestar.datatypes.responses.Books;
import com.polestar.datatypes.responses.IRestResponse;
import com.polestar.datatypes.responses.RestResponse;
import com.polestar.datatypes.responses.Token;
import com.polestar.datatypes.responses.UserAccount;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Endpoint {
	private final RequestSpecification request;

	public Endpoint(String baseUrl) {
		RestAssured.baseURI = baseUrl;
		request = RestAssured.given();
		request.header("Content-Type", "application/json");
	}

	public void authenticateUser(AuthorizationRequest authRequest) {
		Response response = request.body(authRequest).post(Route.generateToken());
		if (response.statusCode() != HttpStatus.SC_OK)
			throw new RuntimeException("Authentication Failed. Content of failed Response: " + response.toString()
					+ " , Status Code : " + response.statusCode());

		Token tokenResponse = response.body().jsonPath().getObject("$", Token.class);
		request.header("Authorization", "Bearer " + tokenResponse.token);
	}

	public IRestResponse<Books> getBooks() {
		Response response = request.get(Route.books());
        return new RestResponse(Books.class, response);
	}

	public IRestResponse<UserAccount> addBook(AddBooksRequest addBooksRequest) {
		Response response = request.body(addBooksRequest).post(Route.books());
		return new RestResponse(UserAccount.class, response);
	}

	public Response removeBook(RemoveBookRequest removeBookRequest) {
		return request.body(removeBookRequest).delete(Route.book());
	}

	public IRestResponse<UserAccount> getUserAccount(String userId) {
		Response response = request.get(Route.userAccount(userId));
		return new RestResponse(UserAccount.class, response);
	}
}
