package com.nagarro.RestPractice;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given; 
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequest {
		
	@Test
	public void getWeatherDetail(){
		
		RestAssured.baseURI="http://localhost";
		RestAssured.port=8080;
		RestAssured.basePath="/student/list";
		
		RequestSpecification req=given();
		
		
		//content type =json/xml
		req=req.contentType(ContentType.JSON);
		
		//setting the header
		req=req.header("X","y");
		
		//Loging the request
		
		req=req.log().all();
		
		/*
		 * GETTING THE CONTENT TYPE IN RESPONSE
		 * HEADER IN RESPOPNSE
		 * CHECK RESPONSE TYPE
		 * STATUS CODE
		 * */

		Response response=req.get();//return the object of response class

		System.out.println(response.getContentType());
		System.out.println(response.getStatusCode());
		System.out.println(response.getHeaders());
		System.out.println(response.getTime());
		/*
		response.print();
				*/
	}

}
