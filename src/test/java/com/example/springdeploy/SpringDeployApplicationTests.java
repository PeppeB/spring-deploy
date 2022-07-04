package com.example.springdeploy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class SpringDeployApplicationTests {

	@Test
	void contextLoads() {
		// System.getenv(): returns an unmodifiable string map view of the current system environment.
		System.getenv().forEach(
				(key, value) -> System.out.println(key + " " + value)
		);
	}

}
