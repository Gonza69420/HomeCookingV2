package com.homecooking.demo;

import AccessingSQL.ClientDAO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HomecookingApplicationTests {

	@Test
	void contextLoads() {
		//funca
		System.out.println(ClientDAO.getClient(4).getDNI());
	}
}