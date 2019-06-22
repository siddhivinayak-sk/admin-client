package com.client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerTest {

	@RequestMapping("/home")
	public String gethome() {
		return "Hello";
	}
}
