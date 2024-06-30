package com.idho_web.idho_web;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class IdhoWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdhoWebApplication.class, args);
	}

}
