package api.bestbuy.storesinfo;

import api.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class StoresGetTest extends TestBase {

    @Test
    public void getAllStoresList() {
        Response response = given()
                .when()
                .get();
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test
    public void getSingleStoreInfo(){
        Response response = given()
                .pathParam("id",7)
                .when()
                .get("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }

    @Test
    public void getStoreDetailsWithParameters(){
        Response response = given()
                .queryParam("address","13513 Ridgedale Dr")
                .when()
                .get();
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
