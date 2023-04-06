package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;

@SpringBootApplication
public class JpapracticeApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpapracticeApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class)
		
	}

}
