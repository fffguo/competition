package com.example.competition;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

@MapperScan(basePackages = "com.example.competition.dao.mapper")
public class CompetitionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompetitionApplication.class, args);
	}
}
