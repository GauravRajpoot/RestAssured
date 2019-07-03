package com.nagarro.RestPractice;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PutRequest {
	@Test
	public void UpdateStudent(){
		
		RestAssured.baseURI="http://localhost";
		RestAssured.port=8080;
		RestAssured.basePath="/student";
		
		File json=new File("C:\\Users\\gauravrajpoot\\workspace\\RestPractice\\student.json");
		
		Response resp=given().contentType(ContentType.JSON).log().all().body(json).put("/102");
	 
		resp.prettyPrint();

}
}
