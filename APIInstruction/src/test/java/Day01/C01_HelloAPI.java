package Day01;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class C01_HelloAPI {

    @Test
    public void hello(){

        // GET https://restful-booker.herokuapp.com/booking

        // Body hazirlamam gerekiyor mu? - Hayir
        // Benden ozellikle set etmem istenen bir header var mi? - Hayir

        given().
                // Herhangi bir request hazirligim yok
        when().
                get("https://restful-booker.herokuapp.com/booking"). // request method - request url
        then().
                log().
                body();
    }





}
