package com.nagarro.RestPractice;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given; 
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetRequest {
		
	@Test
	public void getWeatherDetail(){
		
		RestAssured.baseURI="http://localhost";
		RestAssured.port=8080;
		RestAssured.basePath="/student/list";
		
		
		Response resp=given().contentType(ContentType.JSON).header("X","Y").log().all().get();
		
		/*
		 * GETTING THE CONTENT TYPE IN RESPONSE
		 * HEADER IN RESPOPNSE
		 * CHECK RESPONSE TYPE
		 * STATUS CODE
		 */
		

		System.out.println(resp.getContentType());
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getHeaders());
		System.out.println(resp.getTime());
	
		
		/*	
		 *This is the explanation of the above line 
		
		RequestSpecification req=given();
			
		
		req=req.contentType(ContentType.JSON);  //content type =json/xml
		
		req=req.header("X","y");   //setting the header
		
		
		req=req.log().all();   //Loging the request
		
	
		/*
		Response response=req.get();//return the object of response class

		
		response.print();
				*/
	}

}
