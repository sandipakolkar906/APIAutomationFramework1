package com.qa.httpmethods;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ServiceHelper {

	public static Response getNoAuthhttpRequest(String endPoint) {

		Response getreqResponse = RestAssured.given().header("authorization", "No Auth").when().get(endPoint);

		return getreqResponse;

	}

	public static Response postNoAuthhttpRequest(String endPoint, Object objRequest) {

		Response postrequestResponse = RestAssured.given().header("authorization", "No Auth")
				.contentType(ContentType.JSON).when().body(objRequest).post(endPoint);

		return postrequestResponse;

	}

	public static Response postwithTokenhttpRequest(String endPoint, Object objRequest, String token) {

		Response postrequestResponse = RestAssured.given().header("Authorization", "Bearer " + token)
				.contentType(ContentType.JSON).accept(ContentType.JSON).when().body(objRequest).post(endPoint);

		return postrequestResponse;

	}

}
