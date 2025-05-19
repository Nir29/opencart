package apiTesting2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetRequestBooks {
	
	RequestSpecification r;
	Response response;
	ValidatableResponse vr;
	@Test
	void testPostRequest() {
		r=RestAssured.given();
		r.baseUri("https://simple-books-api.glitch.me");
		r.basePath("/books");
		
		
		response=r.when().get();
		
		
		vr=response.then().log().all().statusCode(200);
		
		
	}

}
