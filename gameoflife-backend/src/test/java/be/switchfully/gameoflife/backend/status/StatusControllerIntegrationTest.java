package be.switchfully.gameoflife.backend.status;

import be.switchfully.gameoflife.backend.IntegrationTest;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import static be.switchfully.gameoflife.backend.status.StatusController.STATUS_BASE_URL;
import static io.restassured.RestAssured.given;

public class StatusControllerIntegrationTest extends IntegrationTest {

    @Test
    public void getStatusCheck() {
        String statusCheck = given()
                .port(port)
                .basePath(STATUS_BASE_URL + "/check")
                .contentType("text/plain;charset=UTF-8")
                .when()
                .get()
                .then()
                .statusCode(200)
                .extract()
                .response()
                .asString();

        Assertions.assertThat(statusCheck).isEqualTo("Up and running!");
    }

}