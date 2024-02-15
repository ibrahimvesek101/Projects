package utilities;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

public class APIUtil {

    // Rest Assured da not found bir status code degil bir exception dur bu yuzden try catch ile test edilebilir

    // Status code assertion
    public static void assertStatusCodeIsOk(Response response){
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    public static void assertStatusCodeBadRequest(Response response){

        Assert.assertEquals(response.getStatusCode(), 400);
    }

    public static void assertStatusCodeCreated(Response response){
        Assert.assertEquals(response.getStatusCode(), 201);
    }

    public static void assertStatusCode(Response response,int expected){
        Assert.assertEquals(response.getStatusCode(), expected);
    }


    public static Response sendGetRequest(String endpoint){

        return RestAssured.given().
                // templated request
                when().get(endpoint);

    }

    public static Response sendPostRequest(Object body, String endpoint){

        return RestAssured.given().
                        body(body).
                // templated request
                        when().post(endpoint);
    }

    public static Response sendPostRequest(Object body, String endpoint, String token){

        return RestAssured.given().
                auth().oauth2(token).
                body(body).
                // templated request
                        when().post(endpoint);
    }



}
