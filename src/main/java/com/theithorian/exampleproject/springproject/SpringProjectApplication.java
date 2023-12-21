package com.theithorian.exampleproject.springproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringProjectApplication {

	@Autowired
	private UserRepository userRepository;

	@EventListener(ApplicationReadyEvent.class)
	public void runAfterStartup() {
		var userCount = this.userRepository.count();
		System.out.println("Number of customers: " + userCount);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringProjectApplication.class, args);
	}

}
