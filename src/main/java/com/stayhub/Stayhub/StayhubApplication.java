package com.stayhub.Stayhub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class StayhubApplication {

	public static void main(String[] args) {
		SpringApplication.run(StayhubApplication.class, args);
	}

}
