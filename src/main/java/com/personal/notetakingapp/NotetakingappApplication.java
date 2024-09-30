package com.personal.notetakingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories
public class NotetakingappApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotetakingappApplication.class, args);
	}

}
