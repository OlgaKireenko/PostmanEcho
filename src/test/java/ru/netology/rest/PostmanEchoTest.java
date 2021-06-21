package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


class MobileBankApiTestV1 {
    @Test
    void shouldReturnBody() {
        // Given - When - Then
        // Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Kireenko")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body ("data", equalTo("Ivanov"))
        ;
    }
}