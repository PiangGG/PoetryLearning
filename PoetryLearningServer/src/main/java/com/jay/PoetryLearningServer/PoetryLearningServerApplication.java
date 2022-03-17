package com.jay.PoetryLearningServer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = "com.jay.PoetryLearningServer.dao")
public class PoetryLearningServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PoetryLearningServerApplication.class, args);
	}

}
