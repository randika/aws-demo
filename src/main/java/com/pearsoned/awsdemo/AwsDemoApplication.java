package com.pearsoned.awsdemo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;


@RestController
@SpringBootApplication

public class AwsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsDemoApplication.class, args);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    String status() {
        return "OK";
    }
}
