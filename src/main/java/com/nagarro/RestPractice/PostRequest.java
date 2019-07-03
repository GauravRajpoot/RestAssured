package com.nagarro.RestPractice;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import java.io.File;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequest {
	
	@Test
	public void getStudent(){
		
		RestAssured.baseURI="http://localhost";
		RestAssured.port=8080;
		RestAssured.basePath="/student";
		
		File json=new File("C:\\Users\\gauravrajpoot\\workspace\\RestAssured\\student.json");
		
		Response resp=given().contentType(ContentType.JSON).log().all().body(json).post();
	 
		resp.prettyPrint();
	
}

}
