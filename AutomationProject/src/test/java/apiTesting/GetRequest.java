package apiTesting;

import io.restassured.RestAssured;

public class GetRequest {
	public static void main(String[]args) {
		RestAssured.given()
		.baseUri("https://api.zippopotam.us")
		.basePath("/IN/754142")
		.when().get()
		.then()
		.log().all().statusCode(200);
	}

}
