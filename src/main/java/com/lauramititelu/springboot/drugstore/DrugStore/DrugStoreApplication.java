package com.lauramititelu.springboot.drugstore.DrugStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DrugStoreApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DrugStoreApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(DrugStoreApplication.class, args);
	}

}
