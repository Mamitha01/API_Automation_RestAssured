package org.example.crud.Post;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class BDDstylePost {

    @Test
    public void testBDDstylePostPositive(){

        //Post request
        //URL
        //Headers-content type
        //Body -Payload-JSON

        String payload ="{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";


        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth").contentType(ContentType.JSON).log().all()
                .body(payload).when().post() .then().log().all().statusCode(200);

    }
}
