package com.johnjohn21121.EducationCenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class EducationCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(EducationCenterApplication.class, args);
	}

}
