package com.polestar.steps;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class BaseTest {
	RequestSpecification requestSpec;
	ResponseSpecification responseSpec;
	Response response;
}
