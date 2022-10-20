package com.hr.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.hr.controller"})
public class PariApplication {

	public static void main(String[] args) {
		SpringApplication.run(PariApplication.class, args);
	}

}
