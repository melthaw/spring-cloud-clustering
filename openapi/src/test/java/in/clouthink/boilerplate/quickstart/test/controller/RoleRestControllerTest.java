package in.clouthink.boilerplate.quickstart.test.controller;

import in.clouthink.boilerplate.quickstart.test.common.AbstractTest;
import org.junit.Test;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;

public class RoleRestControllerTest extends AbstractTest {

    @Test
    public void testList() throws Exception {
        //RoleView
        given()
                .get("/api/roles")
                .then()
                .assertThat()
                .statusCode(200);
    }
}
