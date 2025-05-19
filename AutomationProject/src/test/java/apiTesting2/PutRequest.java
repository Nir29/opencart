package apiTesting2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PutRequest {
	@Test
	void testPut() {
		String token="2b7d7880e1f01c0";
		String bookid="334";
		String body="{\r\n"
				+ "    \"firstname\" : \"nala\",\r\n"
				+ "    \"lastname\" : \"Black\",\r\n"
				+ "    \"totalprice\" : 155,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n"
				+ "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
				+ "}";
		
		RequestSpecification r=RestAssured.given();
		r.baseUri("https://restful-booker.herokuapp.com");
		r.basePath("/booking/"+bookid);
		r.body(body);
		r.cookie("token",token);
		r.contentType(ContentType.JSON);
		
		Response response=r.when().put();
		
		
		ValidatableResponse vr=response.then().log().all().statusCode(200);
	}

}
