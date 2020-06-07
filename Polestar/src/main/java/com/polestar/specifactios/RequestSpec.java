package com.polestar.specifactios;

import java.io.IOException;
import java.io.PrintStream;

import com.polestar.configs.APIConfig;
import com.polestar.utils.LogFileUtil;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RequestSpec {
	public static RequestSpecification req;
	public static APIConfig apiConfig= new APIConfig();		
	
	public static RequestSpecification requestSpecification() throws IOException {		
			PrintStream logFile = LogFileUtil.getLogFile();
			req = new RequestSpecBuilder().setBaseUri(apiConfig.getBaseURI()).addQueryParam("key", "qaclick123")
					.addFilter(RequestLoggingFilter.logRequestTo(logFile))
					.addFilter(ResponseLoggingFilter.logResponseTo(logFile)).setContentType(ContentType.JSON).build();
			return req;
	}
}
