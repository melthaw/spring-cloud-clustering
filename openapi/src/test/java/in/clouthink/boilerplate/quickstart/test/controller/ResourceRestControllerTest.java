package in.clouthink.boilerplate.quickstart.test.controller;

import in.clouthink.boilerplate.quickstart.test.common.AbstractTest;
import org.junit.Test;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;

public class ResourceRestControllerTest extends AbstractTest {

    @Test
    public void testList() throws Exception {
        //ResourceView
        given()
                .get("/api/resources/list")
                .then()
                .assertThat()
                .statusCode(200);
        given()
                .get("/api/resources/tree")
                .then()
                .assertThat()
                .statusCode(200);
    }

}
