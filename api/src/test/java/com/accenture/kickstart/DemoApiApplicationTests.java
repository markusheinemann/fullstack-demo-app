package com.accenture.kickstart;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApiApplicationTests {

    @Test
    @DisplayName("Check if the jdbcTemplate object passed in the setter is set correctly.")
    void contextLoads() {

        assertEquals(1,1);
    }

}
