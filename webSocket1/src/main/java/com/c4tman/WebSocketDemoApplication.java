package com.c4tman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class WebSocketDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebSocketDemoApplication.class, args);
	}
}
