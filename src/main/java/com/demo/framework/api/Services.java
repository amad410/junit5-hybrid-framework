package com.demo.framework.api;

import com.demo.framework.api.pojos.UserDetails;
import com.demo.framework.config.factory.ApiConfigFactory;
import io.restassured.response.Response;

/**
 * This is the service layer logic class that handles most of the operations.
 * You can further extend this class by abstracting operations into separate classes
 * and then use this class as one to be inherited encapsulating the logic of getting a token
 * or logging.
 */
public final class Services {

    private Services(){}

    private static final String LIST_USERS_ENDPOINT = ApiConfigFactory.getConfig().listUsersEndpoint();
    private static final String POST_USERS_ENDPOINT = ApiConfigFactory.getConfig().postUserEndpoint();

    public static Response getUsers(){

        return BaseRequestSpecification.getDefaultRequestSpec()
                .queryParam("page", 2)
                .get(LIST_USERS_ENDPOINT);
    }

    public static Response postUsers(UserDetails userDetails){

        return BaseRequestSpecification.getDefaultRequestSpec()
                .body(userDetails)
                .post(POST_USERS_ENDPOINT);
    }
}
