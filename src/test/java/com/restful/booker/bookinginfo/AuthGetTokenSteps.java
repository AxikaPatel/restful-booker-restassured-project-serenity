package com.restful.booker.bookinginfo;

import com.restful.booker.testbase.TestBaseAuthToken;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class AuthGetTokenSteps extends TestBaseAuthToken
{
    static String userName = "admin";
    static String password = "password123";

    @Steps
    AuthGetToken authGetToken;

    @Title("This will Create Token")
    @Test
    public void test001()
    {
        ValidatableResponse response = authGetToken.createToken(userName,password);
        response.log().all().statusCode(200);
    }

}
