package com.homecooking.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


		import org.springframework.web.bind.annotation.GetMapping;
		import org.springframework.web.bind.annotation.RequestParam;
		import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HomeCookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeCookingApplication.class, args);
	}

	@GetMapping("/login")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
}