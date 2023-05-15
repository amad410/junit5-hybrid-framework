package com.demo.tests.api;

import com.demo.framework.api.Services;
import com.demo.framework.api.pojos.UserDetails;
import com.demo.framework.api.testdata.UserTestData;
import io.restassured.response.Response;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.IOException;

/**
 * This is a sample API test class that uses https://reqres.in/ restful services.
 */
public class APITest {

    @Test
    public void testListUsersApi(){
        Response response = Services.getUsers();
        int actualStatusCode = response.statusCode();
        Assertions.assertThat(actualStatusCode).isEqualTo(200);
        //assertion

    }

    @Test
    public void testAddUsersApi(){
        Response response = Services.getUsers();
        int actualStatusCode = response.statusCode();
        Assertions.assertThat(actualStatusCode).isEqualTo(200);
    }

    @Test
    public void testAddNewUserApi() throws IOException {

        UserDetails userDetails = UserTestData.getUserDetails();
        Response response = Services.postUsers(userDetails);

        int actualStatusCode = response.statusCode();
        Assertions.assertThat(actualStatusCode).isEqualTo(201);

    }
}
