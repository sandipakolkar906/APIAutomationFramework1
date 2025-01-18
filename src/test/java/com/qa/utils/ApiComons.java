package com.qa.utils;

import java.io.IOException;

import com.qa.endpoints.ServiceEndPoints;
import com.qa.httpmethods.ServiceHelper;
import com.qa.payloads.GenerateTokenPayload;

public class ApiComons {

	public static String generateToken() throws IOException {

		GenerateTokenPayload objGenerateTokenPayload = new GenerateTokenPayload(ReadConfig.getValue("userName"),
				ReadConfig.getValue("password"));

		return ServiceHelper.postNoAuthhttpRequest(ServiceEndPoints.postGenerateToken, objGenerateTokenPayload).body()
				.jsonPath().getString("token");

	}

}
