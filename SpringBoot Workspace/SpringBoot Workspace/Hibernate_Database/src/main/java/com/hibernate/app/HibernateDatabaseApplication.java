package com.hibernate.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hibernate.app.entity.User;
import com.hibernate.app.repository.UserRepository;

import jakarta.annotation.PostConstruct;


@SpringBootApplication
public class HibernateDatabaseApplication {
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(HibernateDatabaseApplication.class, args);
	}

	@PostConstruct
	public void testDatabaseConnection() {
		List<User> users = userRepository.findAll();
		System.out.println("Retrieved " + users.size() + " users from the database.");
	}
}
