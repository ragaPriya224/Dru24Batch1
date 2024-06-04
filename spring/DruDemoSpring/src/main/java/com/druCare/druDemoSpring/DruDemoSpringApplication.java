package com.druCare.druDemoSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DruDemoSpringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DruDemoSpringApplication.class, args);
		Home h = context.getBean(Home.class);
		h.m1();
	}

}
