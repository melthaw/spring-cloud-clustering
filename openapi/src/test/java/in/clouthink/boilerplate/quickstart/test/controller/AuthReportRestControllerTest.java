package in.clouthink.boilerplate.quickstart.test.controller;

import in.clouthink.boilerplate.quickstart.test.common.AbstractTest;
import org.junit.Test;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;

public class AuthReportRestControllerTest extends AbstractTest {

    @Test
    public void testList() throws Exception {
        //AuthEventAggregation.class
        given()
                .get("/api/auth-report/by-month")
                .then()
                .assertThat()
                .statusCode(200);
        given()
                .get("/api/auth-report/by-day")
                .then()
                .assertThat()
                .statusCode(200);
    }

}
