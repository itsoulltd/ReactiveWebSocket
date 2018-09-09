package com.itsoul.lab.websocket.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class ReactiveWebSocketApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveWebSocketApplication.class, args);
	}
}
