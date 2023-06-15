package com.abc.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

 
@SpringBootApplication
@ComponentScan("com.abc.login.repository")
public class UserActivationApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserActivationApplication.class, args);
	}

}
