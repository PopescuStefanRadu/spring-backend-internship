package com.example.app3;

import com.example.app3.config.KauflandApiProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(KauflandApiProperties.class)
public class App3Application {

	public static void main(String[] args) {
		SpringApplication.run(App3Application.class, args);
	}

}
