package hello;

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

public class BaseMockMvc {

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new GreetingController());
    }

}
