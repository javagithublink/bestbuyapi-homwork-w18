package api.bestbuy.extraction;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;

public class StoresExtraction {

    public static ValidatableResponse response;

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 3030;

        response = given()
                .when()
                .get("/stores")
                .then().statusCode(200);
    }


    //1. Extract the limit
    @Test

    public void test001() {
        int limit = response.extract().path("limit");
        System.out.println("//1. Extract the limit//");
        System.out.println("Limit = " + limit);
        System.out.println(" ");
    }

    //2. Extract the total

    @Test
    public void test002() {
        int total = response.extract().path("total");
        System.out.println("//2. Extract the total//");
        System.out.println("total = " + total);
        System.out.println(" ");
    }


    //3. Extract the name of 6th store

    @Test
    public void test003() {
        List<String> name = response.extract().path("data.findAll{it.id == 6}.name");
        System.out.println("//3. Extract the name of 6th store//");
        System.out.println("6th store name = " + name.get(0));
        System.out.println(" ");
    }

    //4. Extract the names of all the store

    @Test
    public void test004() {
        List<String> namesList = response.extract().path("data.name");
        System.out.println("//4. Extract the names of all the store//");
        for (String name : namesList) {
            System.out.println("store name :" + name);
        }
        System.out.println(" ");
    }

    //5. Extract the storeId of all the store
    @Test
    public void test005() {
        List<Integer> idList = response.extract().path("data.id");
        System.out.println("//5. Extract the storeId of all the store//");
        for (int id : idList) {
            System.out.println("store ID :" + id);
        }
        System.out.println(" ");
    }

    //6. Print the size of the data list
    @Test
    public void test006() {
        List<Object> dataList = response.extract().path("data");
        System.out.println("//6. Print the size of the data list//");
        System.out.println("Size of data list : " + dataList.size());
        System.out.println(" ");
    }

    //7. Get all the value of the store where store name = Burnsville
    @Test
    public void test007() {
        List<String> storeDetails = response.extract().path("data.findAll{it.name == 'Burnsville'}");
        System.out.println("//7. Get all the value of the store where store name = Burnsville//");
        System.out.println(storeDetails);
        System.out.println(" ");
    }

    //8. Get the address of the store where store name = Naperville
    @Test
    public void test008() {
        List<String> storeAddress = response.extract().path("data.findAll{it.name =='Naperville'}.address");
        System.out.println("//8. Get the address of the store where store name = Naperville//");
        System.out.println(storeAddress.get(0));
        System.out.println(" ");
    }

    //9. Get all the services of 8th store
    @Test
    public void test009() {
        List<String> services = response.extract().path("data.findAll{it.id==8}.services");
        System.out.println(services);
    }

    //10. Get store services of the store where service name = Windows Store
    @Test
    public void test010() {
        List<List<HashMap<String, ?>>> serviceName = response.extract().path("data.findAll{it.services.findAll{it.name=='Windows Store'}}.services");

        System.out.println(serviceName);
    }

    //11. Get id of all the store
    @Test
    public void test011(){
        List<Integer> storeId = response.extract().path("data.id");
        System.out.println("//11. Get id of all the store//");
        for(int i=0;i<storeId.size();i++) {
            System.out.println("Store ID: "+storeId.get(i));
        }
        System.out.println(" ");
    }

    //12. Get all the storeId of all the store
    @Test
    public void test012(){
        List<Integer> allIdsOfAllStores = response.extract().path("data.services.id");
        System.out.println("//12. Get all the storeId of all the store//");
        System.out.println(allIdsOfAllStores);
        System.out.println(" ");
    }

    //13. Find the store names Where state = ND
    @Test
    public void test013(){
        List<String> storeNames = response.extract().path("data.findAll{it.state=='ND'}.name");
        System.out.println("//13. Find the store names Where state = ND//");
        System.out.println(storeNames.get(0));
        System.out.println(" ");
    }

    //14. Find the Total number of services for the store where store name = Rochester
    @Test
    public void test014(){
       List<List<String>> servicesList = response.extract().path("data.findAll{it.name=='Rochester'}.services.name");
       List<String> servicesList1 = servicesList.get(0);
        System.out.println(servicesList1.size());
    }

    //15. Find the createdAt for all services whose name = “Windows Store”
    @Test
    public void test015() {
        List<HashMap<String, ?>> createdAt = response.extract().path("data.findAll{it.services.findAll{it.name=='Windows Store'}}.services.createdAt");
        System.out.println(createdAt);

    }
    //16. Find the name of all services Where store name = “Fargo”
    @Test
    public void test016() {

        List<HashMap<String, ?>> services = response.extract().path("data.findAll{it.name=='Fargo'}.services.name");
        System.out.println("//16. Find the name of all services Where store name = “Fargo”//");
        System.out.println(services);
        System.out.println(" ");

    }

    //17. Find the zip of all the store

    @Test
    public void test017(){
        List<String> zipList = response.extract().path("data.zip");
        System.out.println(zipList);
    }

    //18. Find the zip of store name = Rochester
    @Test
    public void test018(){
        List<String> zipOfStore = response.extract().path("data.findAll{it.name=='Rochester'}.zip");
        System.out.println(zipOfStore.get(0));
    }

    //19. Find the store services details of the service name = Magnolia Home Theater
    @Test
    public void test019(){
        List<List<HashMap<String,?>>> serviceDetails = response.extract().path("data.findAll{it.services.findAll{it.name=='Magnolia Home Theater'}}.services.storeservices");
        //List<String> serviceDetails = response.extract().path("data.services.name");
        System.out.println(serviceDetails);
    }

    //20. Find the lat of all the stores

    @Test
    public void test020(){
        List<Long> latDetails = response.extract().path("data.lat");
        System.out.println(latDetails);
    }

}
