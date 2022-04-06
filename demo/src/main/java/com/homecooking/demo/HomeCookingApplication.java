package com.homecooking.demo;

import logInAndRegister.LogInViewChef;
import logInAndRegister.LogInViewClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
		import org.springframework.web.bind.annotation.RequestParam;
		import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication()
@ComponentScan(basePackages = {"logInAndRegister"})
public class HomeCookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeCookingApplication.class, args);
	}

	@GetMapping("/chef/login")
	public LogInViewChef loginChef() {
		return new LogInViewChef();
	}

	@GetMapping("/client/login")
	public LogInViewClient loginClient() {
		return new LogInViewClient();
	}
}