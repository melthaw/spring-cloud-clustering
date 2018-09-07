package in.clouthink.boilerplate.quickstart.test.controller;

import in.clouthink.boilerplate.quickstart.test.common.AbstractTest;
import org.junit.Test;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;

public class AuthRestControllerTest extends AbstractTest {

    @Test
    public void testList() throws Exception {
        given()
                .get("/api/auth-events")
                .then()
                .assertThat()
                .statusCode(200);
    }

}
