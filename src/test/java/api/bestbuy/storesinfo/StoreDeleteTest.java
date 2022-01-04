package api.bestbuy.storesinfo;

import api.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class StoreDeleteTest extends TestBase {


    @Test
    public void test001(){
        Response response = given()
                .pathParam("id",7)
                .when()
                .delete("/{id}");
                response.then().statusCode(200);
                response.prettyPrint();

    }

}
