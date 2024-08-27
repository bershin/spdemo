package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworld {
	@GetMapping("/helloworld")
	public UserDetails getHello() {
		return new UserDetails("John","Bershin",32);
	}
}
