$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Books.feature");
formatter.feature({
  "name": "Assign Books Feature API Tests",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Execute AssignBooks API and verify Response",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I prepare the Assign books Request payload with ISBN \"\u003cISBN\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "I send the Assign book Post request",
  "keyword": "When "
});
formatter.step({
  "name": "I verify Assign book Request Respone has below Expected status code as \"\u003cexpectedStatusCode\u003e\" and Response Message as \"\u003cResponseMessage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "expectedStatusCode",
        "ISBN",
        "ResponseMessage"
      ]
    },
    {
      "cells": [
        "400",
        "9781449365035",
        "ISBN already present in the User\u0027s Collection!"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Execute AssignBooks API and verify Response",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I prepare the Assign books Request payload with ISBN \"9781449365035\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.qa.stepdefinations.AssignBookSteps.i_prepare_the_Assign_books_Request_payload_with_ISBN(java.lang.String)"
});
formatter.write("Preparing the Assignbook Request with ISBN:9781449365035");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send the Assign book Post request",
  "keyword": "When "
});
formatter.match({
  "location": "com.qa.stepdefinations.AssignBookSteps.i_send_the_Assign_book_Post_request()"
});
formatter.write("Sending the Assignbook Request with ISBN list :[com.qa.payloads.CollectionOfIsbn@6dc17b83]");
formatter.write("Received Response :{\"code\":\"1210\",\"message\":\"ISBN already present in the User\u0027s Collection!\"}");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify Assign book Request Respone has below Expected status code as \"400\" and Response Message as \"ISBN already present in the User\u0027s Collection!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qa.stepdefinations.AssignBookSteps.i_verify_Assign_book_Request_Respone_has_below_Expected_status_code_as_and_Response_Message_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});