package com.nt.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleRestApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(SimpleRestApp1Application.class, args);
		System.out.println("From MAin class");
	}

}
