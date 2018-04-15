package com.chf.firstcloudserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.Scanner;

@SpringBootApplication
@EnableEurekaServer
public class FirstCloudServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstCloudServerApplication.class, args);
	}
}
