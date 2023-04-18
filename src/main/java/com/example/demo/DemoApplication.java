package com.example.demo;

import com.example.demo.configuration.OpenApiProperties;
import com.example.demo.configuration.ServerProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableConfigurationProperties({
		OpenApiProperties.class,
		ServerProperties.class
})

@SpringBootApplication()
@EnableJpaRepositories
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}