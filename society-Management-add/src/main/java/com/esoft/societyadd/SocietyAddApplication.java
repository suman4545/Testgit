package com.esoft.societyadd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SocietyAddApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocietyAddApplication.class, args);
	}

}
