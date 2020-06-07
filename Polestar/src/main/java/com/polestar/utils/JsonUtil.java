package com.polestar.utils;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class JsonUtil {
	public static JsonPath rawToJson(String response)
	{
		JsonPath js1 =new JsonPath(response);
		return js1;
	}
	
	public static String getJsonPath(Response response,String key)
	{
		  String resp=response.asString();
		JsonPath   js = new JsonPath(resp);
		return js.get(key).toString();
	}
}
