package com.home.microtest;

import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class GreetingControllerTest {

    @Test
    void greetingTest() {
        RestTemplate restTemplate = new RestTemplate();

        String forObject = restTemplate.getForObject("http://localhost:8085/greeting", String.class);
        assertThat(forObject, equalTo("Hello!"));
    }
}
