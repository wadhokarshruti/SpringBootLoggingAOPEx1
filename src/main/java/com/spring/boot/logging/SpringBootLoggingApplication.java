package com.spring.boot.logging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringBootLoggingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLoggingApplication.class, args);
	}

}
