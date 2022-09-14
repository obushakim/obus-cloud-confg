package com.obus.cloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ObusCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObusCloudConfigApplication.class, args);
	}

}
