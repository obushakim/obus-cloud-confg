package com.obus.cloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigServer
@SpringBootApplication
public class ObusCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObusCloudConfigApplication.class, args);
	}

	@GetMapping
	public String index() {
		return "obus cloud config index";
	}
}
