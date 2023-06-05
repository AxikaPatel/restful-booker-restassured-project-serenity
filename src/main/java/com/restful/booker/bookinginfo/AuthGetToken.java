package com.restful.booker.bookinginfo;

import com.restful.booker.model.AuthPojo;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class AuthGetToken
{

    @Step("Creating auth token with userName : {0},password: {1}")
    public ValidatableResponse createToken(String userName, String password)
    {
        AuthPojo authPojo =AuthPojo.getAuthPojo(userName,password);

      return SerenityRest.given().log().all()
              .contentType("application/json").
                body(authPojo).
                when().
                post().
                then();

    }




}
