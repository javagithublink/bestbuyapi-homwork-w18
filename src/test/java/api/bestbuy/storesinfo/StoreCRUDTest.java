package api.bestbuy.storesinfo;

import api.bestbuy.model.StorePojo;
import api.bestbuy.testbase.TestBase;
import api.bestbuy.utility.Utility;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class StoreCRUDTest extends TestBase {

    static String name = "Harrow"+ Utility.getRandomValue();
    static String type = "BigBox";
    static String address = Utility.getRandomValue()+"North Street";
    static String address2="";
    static String city = "London";
    static String state = "MN";
    static String zip = "256879";
    static double lat = 44.879314;
    static double lag = -93.077156;
    static String hours = "Mon: 10-9; Tue: 10-9; Wed: 10-9; Thurs: 10-9; Fri: 10-9; Sat: 10-9; Sun: 10-8";
    static String createAt;
    static String updatedAt;
    static String services;

    @Test
    public void test001(){

        StorePojo storePojo = new StorePojo();
        storePojo.setName(name);
        storePojo.setType(type);
        storePojo.setAddress(address);
        storePojo.setAddress2(address2);
        storePojo.setCity(city);
        storePojo.setState(state);
        storePojo.setZip(zip);
        storePojo.setLat(lat);
        storePojo.setLag(lag);
        storePojo.setHours(hours);

        Response response = given()
                .header("Content-Type","application/json")
                .body(storePojo)
                .when()
                .post();
        response.then().statusCode(201);
        response.prettyPrint();


    }
}


