package in.clouthink.boilerplate.quickstart.test.common;

import in.clouthink.boilerplate.quickstart.test.application.OpenApiApplication;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = OpenApiApplication.class)
@WithMockUser(username = "administrator", roles = {"ADMIN", "USER"})
@ActiveProfiles(profiles = "test")
public abstract class AbstractTest {

    @Autowired
    protected WebApplicationContext webApplicationContext;

    @Before
    public void setUp() {
        RestAssuredMockMvc.webAppContextSetup(webApplicationContext);
    }

}
