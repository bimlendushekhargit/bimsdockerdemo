package com.bs.dockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BsDockerApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(BsDockerApplication.class, args);
	}

}
