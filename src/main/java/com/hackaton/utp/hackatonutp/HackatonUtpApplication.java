package com.hackaton.utp.hackatonutp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class HackatonUtpApplication {

	public static void main(String[] args) {
		SpringApplication.run(HackatonUtpApplication.class, args);
	}

}
