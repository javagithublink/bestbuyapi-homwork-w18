package api.bestbuy.storesinfo;

import api.bestbuy.model.StorePojo;
import api.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class StoresPostTest extends TestBase {

    @Test
    public void test001() {

        StorePojo storePojo = new StorePojo();
        storePojo.setName("Harrow");
        storePojo.setType("BigBox");
        storePojo.setAddress("12 1st Street A");
        storePojo.setAddress2("abc");
        storePojo.setCity("London");
        storePojo.setState("MN");
        storePojo.setZip("25687");
        storePojo.setLat(44.879314);
        storePojo.setLng(93.077156);
        storePojo.setHours("Mon: 10-9; Tue: 10-9; Wed: 10-9; Thurs: 10-9; Fri: 10-9; Sat: 10-9; Sun: 10-8");


        Response response = given()
                .header("Content-Type", "application/json")
                //.contentType(ContentType.JSON)
                .body(storePojo)
                .when()
                .post();
        response.then().statusCode(201);
        response.prettyPrint();
    }


}
