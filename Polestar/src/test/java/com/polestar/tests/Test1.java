package com.polestar.tests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import com.polestar.configs.APIConfig;
import com.polestar.constants.HeaderConstants;
import com.polestar.constants.QueryParamConstants;
import com.polestar.constants.StatusCodeConstants;
import com.polestar.paylods.Paylods;
import com.polestar.resources.Reources;
import com.polestar.utils.JsonUtil;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class Test1 {	 
	public static void main(String[] args) {
		APIConfig apiConfig= new APIConfig();		
		Paylods paylods=new Paylods();
		Reources reources= new Reources();	
		
		
		RestAssured.baseURI=apiConfig.getBaseURI();
		String response=given()
				.log().all()
				.queryParam(QueryParamConstants.KEY, "qaclick123")
				.header(HeaderConstants.CONTENT_TYPE,"application/json")
				.body(paylods.placePaylod.addPlace())
				.when()
				.post(reources.placeResource.getAddPlaceResource())
			.then()
				.log().all()
				.assertThat().statusCode(StatusCodeConstants.OK)
							 .body("scope", equalTo("APP"))	
							 .header(HeaderConstants.SERVER, "Apache/2.4.18 (Ubuntu)")
				.extract().response().asString();
		
			JsonPath jsonPath=JsonUtil.rawToJson(response);
			String placeId=jsonPath.getString("place_id");
			
			System.out.println("Place ID: " + placeId);
	}	
	
}