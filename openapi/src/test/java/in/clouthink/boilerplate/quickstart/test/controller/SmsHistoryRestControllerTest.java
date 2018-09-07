package in.clouthink.boilerplate.quickstart.test.controller;

import in.clouthink.boilerplate.quickstart.test.common.AbstractTest;
import org.junit.Test;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;

public class SmsHistoryRestControllerTest extends AbstractTest {

    @Test
    public void testList() throws Exception {
        //SmsHistorySummary.class
        given()
                .when()
                .get("/api/sms-histories")
                .then()
                .assertThat()
                .statusCode(200);
    }
}
