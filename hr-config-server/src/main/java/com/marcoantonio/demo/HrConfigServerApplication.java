package com.marcoantonio.demo;

import org.gradle.cli.CommandLineConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class HrConfigServerApplication implements CommandLineConverter{
	
	@Value("${spring.cloud.config.server.git.username}")
	private String username;
	
	public static void main(String[] args) {
		SpringApplication.run(HrConfigServerApplication.class, args);
	}

	//Override
	public static void main(String... args) throws Exception{
		System.out.print("USERNAME = ");
	}
}
