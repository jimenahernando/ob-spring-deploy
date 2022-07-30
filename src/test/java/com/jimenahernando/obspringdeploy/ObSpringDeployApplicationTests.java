package com.jimenahernando.obspringdeploy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class ObSpringDeployApplicationTests {

	@Test
	void contextLoads() {

		System.getenv().forEach(
				(key, value) -> System.out.println(key + " " + value)
		);
	}

}
