package com.intelliviz.simplespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class SimpleSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleSpringBootApplication.class, args);
	}

	@RequestMapping("/hello")
	public String hello(@RequestParam int number) {
		String s = "odd";
		if(number % 2 == 0) {
			s = "even";
		}
		return "Hello from Spring Boot: " + number + " is " + s;
	}

	@PostMapping("/hello/detail")
	public int helloWBody(@RequestBody int value) {
		return 0;
	}


//	@GetMapping("/hello/{name}")
//	public String helloName(@PathVariable String name) {
//		return "Hello, " + name + ", from Spring Boot using PathVariable";
//	}
//
//	@GetMapping("/hello")
//	public String helloName2(@RequestParam String name) {
//		return "Hello, " + name + ", from Spring Boot using RequestParam";
//	}

}
