package apiTesting3gson;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.Gson;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class ApiTestGson {
	RequestSpecification request; 
	Response response;
	ValidatableResponse validate;
	@Test
	void testgson() {
		Booking booking=new Booking();
		booking.setFirstname("nirmal");
		booking.setLastname("Brown");
		booking.setTotalprice(111);
		booking.setDepositpaid(true);
		
		
		Bookingdates bookingdate=new Bookingdates();
		bookingdate.setCheckin("2018-01-01");
		bookingdate.setCheckout("2019-01-01");
		
		booking.setBookingdates(bookingdate);
		booking.setAdditionalneeds("Breakfast");
		
		Gson gson=new Gson();
		String jsonbooking=gson.toJson(booking);
		
		request=RestAssured.given();
		request.baseUri("https://restful-booker.herokuapp.com");
		request.basePath("/booking");
		request.contentType(ContentType.JSON);
		request.body(jsonbooking);
		
		response=request.when().post();
		
		validate=response.then().log().all().statusCode(200);
		
		
		String firstname=response.then().extract().path("booking.firstname");
		String lastname=response.then().extract().path("booking.lastname");	
		boolean depositpaid=response.then().extract().path("booking.depositpaid");
		
		
		Assert.assertEquals(firstname, "nirmal");
		Assert.assertEquals(lastname, "Brown");
		Assert.assertTrue(depositpaid);
		
	}

}
