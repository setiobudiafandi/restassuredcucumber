package test.java.steps;

import java.util.HashMap;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import net.serenitybdd.rest.SerenityRest;
import org.junit.Assert;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class userStep {
    public static void register(String nama, String emailnya, String passwordnya) {
        HashMap<String,String> postContent = new HashMap<>();
        postContent.put("name", nama);
        postContent.put("email", emailnya);
        postContent.put("password", passwordnya);

        SerenityRest
                .given()
                .contentType("application/json")
                // .header("Authorization", "Bearer "+token)
                .body(postContent)
                .when()
                .post("https://kasir-api.belajarqa.com/registration")
                .then()
                .log()
                .ifValidationFails()
                .statusCode(201);

    }

    public static void getSuccessStatus() {
        String status = SerenityRest
                .then()
                .extract()
                .path("message");
        Assert.assertTrue(status.equals("Toko berhasil didaftarkan"));
    }

    public static void ValidationJSONSchema(String source) {
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath(source));
    }
}
