package com.homecooking.demo;

import AccessingSQL.ClientDAO;
import model.Client;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HomecookingApplicationTests {

	@Test
	void contextLoads() {
		//funca
		//ClientDAO.createClient(new Client("test", "test", "test", "test", "test", "test" ));
		//System.out.println(ClientDAO.getClient(1).getDNI());
	}
}