package org.example.crud.Get;

import io.restassured.RestAssured;

public class RATestcase {
    public static void main(String[] args) {

        //Get request -- https://api.zippopotam.us/IN/560084
        //URL
        //Headers
        //Get Method
        //base URL --- https://api.zippopotam.us
        //base Path --- IN/560084
        //Payload -- No
        //Auth - Basics ,Digest, JWT ,Bearer token ,OAuth 2.0 ? = no

        //Status code
        // Response body
        //Time, Headers ,Cookies


        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us").basePath("/IN/560084")


                .when().log().all()
                .get()

                .then().log().all().statusCode(200);






    }
}
