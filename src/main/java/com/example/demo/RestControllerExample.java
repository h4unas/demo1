package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerExample {
	@RequestMapping("/demo/{name}")
	public String rest(@PathVariable String name) {
		String str = "hello %s";
		return String.format(str, name);
	}

}
