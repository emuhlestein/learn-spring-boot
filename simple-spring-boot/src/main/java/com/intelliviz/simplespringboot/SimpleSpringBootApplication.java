package com.intelliviz.simplespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/hello")
public class SimpleSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleSpringBootApplication.class, args);
	}

	@RequestMapping
	public String hello() {
		return "Hello from Spring Boot";
	}

	@GetMapping("/{name}")
	public String helloName(@PathVariable String name) {
		return "Hello, " + name + ", from Spring Boot using PathVariable";
	}

	@GetMapping("")
	public String helloName2(@RequestParam String name) {
		return "Hello, " + name + ", from Spring Boot using RequestParam";
	}

}
