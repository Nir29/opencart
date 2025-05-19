package apiTesting2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostRequestBooks {
	
	RequestSpecification r;
	Response response;
	ValidatableResponse vr;
	
	@Test
	void testPostRequest() {
		String payload="{\r\n"
				+ "    \"firstname\" : \"nirmal\",\r\n"
				+ "    \"lastname\" : \"Brown\",\r\n"
				+ "    \"totalprice\" : 111,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n"
				+ "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
				+ "}";
		
		
		r=RestAssured.given();
		r.baseUri("https://restful-booker.herokuapp.com");
		r.basePath("/booking");
		r.body(payload);
		r.contentType(ContentType.JSON);
		
		
		
		response=r.when().post();
		
		vr=response.then().log().all().statusCode(200);
	}

}
