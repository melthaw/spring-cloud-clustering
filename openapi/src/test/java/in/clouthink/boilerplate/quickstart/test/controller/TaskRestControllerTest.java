package in.clouthink.boilerplate.quickstart.test.controller;

import in.clouthink.boilerplate.quickstart.test.common.AbstractTest;
import org.junit.Test;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;

public class TaskRestControllerTest extends AbstractTest {

    @Test
    public void testList() throws Exception {
        //TaskView
        given()
                .get("/api/tasks")
                .then()
                .assertThat()
                .statusCode(200);
    }

}
