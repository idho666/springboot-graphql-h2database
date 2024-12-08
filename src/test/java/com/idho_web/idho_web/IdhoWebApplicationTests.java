package com.idho_web.idho_web;

import org.example.generate.GenerateCaptcha;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IdhoWebApplicationTests {

	@Test
	void contextLoads() {
	}


	@Test
	void dependencytest() {

		GenerateCaptcha generateCaptcha = new GenerateCaptcha();

		System.out.println(generateCaptcha.valeCaptcha());
	}

}
