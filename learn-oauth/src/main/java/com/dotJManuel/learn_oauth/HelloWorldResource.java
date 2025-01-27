package com.dotJManuel.learn_oauth;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {

	@GetMapping("/")
	public String helloWorld(Authentication authentication) {
		System.out.print(authentication);
		System.out.print(authentication.getPrincipal());
		return "HELLO WORLD";
	}
}
