package com.example.demo;

import com.example.demo.MessageHandler.Message;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private TestRestTemplate restTemplate;

	@LocalServerPort
	private int port;

	private String getRootUrl() {
		return "http://localhost:" + port;
	}

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreateMessage() {
		Message msg = new Message("1");

		ResponseEntity<Message> postResponse = restTemplate.postForEntity(getRootUrl() + "/messages", msg, Message.class);

		Assert.assertNotNull(postResponse.getBody());
	}



}
