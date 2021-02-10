package com.candipay.apigateway;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Slf4j
@RestController
public class ApigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApigatewayApplication.class, args);
	}

	@GetMapping("/test")
	public void test() {
		log.info("test-api called...");
	}

	@GetMapping("/healthcheck")
	public String healthcheck() {
		return "Healthcheck... SUCCESS!!!"
	}
}
