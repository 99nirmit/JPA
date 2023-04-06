package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.MyUserRepository;
import com.jpa.test.entities.MyUser;



@SpringBootApplication
public class JpapracticeApplication {

	public static void main(String[] args) {
		
		
		ApplicationContext context = SpringApplication.run(JpapracticeApplication.class, args);
		
		MyUserRepository myUserRepository = context.getBean(MyUserRepository.class);
		
		MyUser myUser = new MyUser();
		myUser.setName("Nirmit");
		myUser.setState("Gujarat");
		myUser.setCity("Surat");
		
		  MyUser user = myUserRepository.save(myUser);
		  
		  System.out.println(user);
	}

}
