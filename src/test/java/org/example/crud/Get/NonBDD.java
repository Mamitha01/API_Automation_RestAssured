package org.example.crud.Get;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class NonBDD {

    //GET Request
    //BDD style and Non BDD style

    //given().when().then() . builder pattern

    public static void main(String[] args) {

        //https://restful-booker.herokuapp.com/booking/12

        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/3587").log().all();
        r.when().get();
        r.then().log().all().statusCode(200);



    }
}
