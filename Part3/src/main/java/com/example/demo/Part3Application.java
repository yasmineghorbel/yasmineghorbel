package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.examples.demo.repositories.TaskRepository;

@SpringBootApplication
public class Part3Application  implements CommandLineRunner {
	@Autowired
	TaskRepository taskRepository;
	public static void main(String[] args) {
		SpringApplication.run(Part3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}

}
