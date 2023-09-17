package Tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
public class TestCase1 {

    @Test
    public static void ValidateResponseHeaders(){
        System.out.println("The headers in the response "+
                given().get("https://pay2.foodics.dev/404").getStatusCode()+"\n");
        given().get("https://pay2.foodics.dev/404").
                        then().assertThat().statusCode(200);
}
    @Test
    public static void Test2(){
//        given().auth().basic("merchant@foodics.com", "123456").get("https://pay2-admin.foodics.dev/login");
        System.out.println("The headers in the response "+
                given().get("https://pay2-admin.foodics.dev/login").getStatusCode()+"\n");
        given().get("https://pay2-admin.foodics.dev/login").
                then().assertThat().statusCode(200);

    }
}
//merchant@foodics.com
//123456
