package Day05;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojo.reqres.UsersResponse;

public class C01_ResponsePOJO {


    @Test
    public void pojo(){


        Response response = RestAssured.
            given().
                baseUri("https://reqres.in/api").
                accept("application/json").
                queryParam("page", 1).
                queryParam("per_page", 11).
            when().
                get("/users");

        UsersResponse usersResponse = response.as(UsersResponse.class);

        Assert.assertEquals(usersResponse.getData().size(), 11);


    }




}
