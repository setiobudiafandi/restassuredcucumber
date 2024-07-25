package test.java.steps;

import java.util.HashMap;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class userStep {
    public static void register(String nama, String emailnya, String passwordnya) {
        HashMap<String,String> postContent = new HashMap<>();
        postContent.put("name", nama);
        postContent.put("email", emailnya);
        postContent.put("password", passwordnya);

        given()
            .contentType(ContentType.JSON) .
        with()
            .body(postContent) .
        when()
            .post("https://kasir-api.belajarqa.com/registration") .
        then()
            .statusCode(201)
            .body("status", equalTo("success"));

    }

    // public static void getSuccessStatus() {
    //     given().
    //     when().
    //     then()
    //         .body("status", is("success"));
    // }
}
