package com.stayhub.Stayhub;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")  // ✅ This tells Spring to load application-test.properties
@SpringBootTest
class StayhubApplicationTests {

	@Test
	void contextLoads() {
	}

}
