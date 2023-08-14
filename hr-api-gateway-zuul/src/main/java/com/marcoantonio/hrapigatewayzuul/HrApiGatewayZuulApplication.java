package com.marcoantonio.hrapigatewayzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableEurekaClient
@SpringBootApplication
public class HrApiGatewayZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrApiGatewayZuulApplication.class, args);
	}

}
