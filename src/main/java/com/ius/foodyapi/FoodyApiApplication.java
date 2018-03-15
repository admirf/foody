package com.ius.foodyapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class FoodyApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(FoodyApiApplication.class, args);
	}
}
