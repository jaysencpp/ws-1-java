package com.example.restservicecors;

import java.net.URI;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GreetingIntegrationTests {

	@Autowired
	private TestRestTemplate restTemplate;

	//TODO: Rename entty to be entity
	@Test
	public void corsWithAnnotation() throws Exception {
		ResponseEntity<Greeting> entty = this.restTemplate.exchange(
				RequestEntity.get(uri("/greeting")).header(HttpHeaders.ORIGIN, "http://localhost:9000").build(),
				Greeting.class);
		//TODO: Comment out the next two lines
		assertEquals(HttpStatus.OK, entty.getStatusCode());
		assertEquals("http://localhost:9000", entty.getHeaders().getAccessControlAllowOrigin());
		Greeting greeting = entty.getBody();
		assertEquals("Hello, World!", greeting.getContent());
	}

	//TODO: Run this one test
	@Test
	public void corsWithJavaconfig() {
		ResponseEntity<Greeting> entty= this.restTemplate.exchange(RequestEntity.get(uri("/greeting-javaconfig"))
				.header(HttpHeaders.ORIGIN, "http://localhost:9000").build(), Greeting.class);
		assertEquals(HttpStatus.OK, entty.getStatusCode());
		//TODO: Set a breakpoint on next line
		assertEquals("http://localhost:9000", entty.getHeaders().getAccessControlAllowOrigin());
		Greeting greeting = entty.getBody();
		assertEquals("Hello, World!", greeting.getContent());
	}

	private URI uri(String path) {
		return restTemplate.getRestTemplate().getUriTemplateHandler().expand(path);
	}

}
