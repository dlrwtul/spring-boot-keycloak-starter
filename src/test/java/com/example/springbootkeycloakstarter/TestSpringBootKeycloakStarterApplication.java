package com.example.springbootkeycloakstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestSpringBootKeycloakStarterApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringBootKeycloakStarterApplication::main).with(TestSpringBootKeycloakStarterApplication.class).run(args);
	}

}
