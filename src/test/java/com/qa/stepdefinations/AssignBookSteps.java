package com.qa.stepdefinations;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.qa.endpoints.ServiceEndPoints;
import com.qa.httpmethods.ServiceHelper;
import com.qa.payloads.AssignBookPayload;
import com.qa.payloads.CollectionOfIsbn;
import com.qa.payloads.GenerateTokenPayload;
import com.qa.utils.ApiComons;
import com.qa.utils.ReadConfig;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import junit.framework.Assert;

public class AssignBookSteps {

	GenerateTokenPayload objGenerateTokenPayload;
	CollectionOfIsbn objCollectionOfIsbn;
	AssignBookPayload objAssignBookPayload;
	List listofISBN;
	Response objAssignBookResponse;
	Scenario scenario;

	@Before
	public void beforeScenario(Scenario scenario) {
		this.scenario = scenario;
	}

	@Given("I prepare the Assign books Request payload with ISBN {string}")
	public void i_prepare_the_Assign_books_Request_payload_with_ISBN(String iSBN) throws IOException {

		scenario.write("Preparing the Assignbook Request with ISBN:" + iSBN);
		objCollectionOfIsbn = new CollectionOfIsbn(iSBN);

		listofISBN = new ArrayList<CollectionOfIsbn>();

		listofISBN.add(objCollectionOfIsbn);

		objAssignBookPayload = new AssignBookPayload(ReadConfig.getValue("userID"), listofISBN);

	}

	@When("I send the Assign book Post request")
	public void i_send_the_Assign_book_Post_request() throws IOException {
		scenario.write("Sending the Assignbook Request with ISBN list :");

		objAssignBookResponse = ServiceHelper.postwithTokenhttpRequest(ServiceEndPoints.postAssignBooks,
				objAssignBookPayload, ApiComons.generateToken());
		scenario.write("Received Response :" + objAssignBookResponse.asString());
	}

	@Then("I verify Assign book Request Respone has below Expected status code as {string} and Response Message as {string}")
	public void i_verify_Assign_book_Request_Respone_has_below_Expected_status_code_as_and_Response_Message_as(
			String expectedStatusCode, String expectedResponseMessage) {

		Assert.assertEquals(Integer.parseInt(expectedStatusCode), objAssignBookResponse.statusCode());
		Assert.assertEquals(expectedResponseMessage, objAssignBookResponse.body().jsonPath().getString("message"));

	}

}
