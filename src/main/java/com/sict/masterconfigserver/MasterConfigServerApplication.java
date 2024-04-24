package com.sict.masterconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MasterConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MasterConfigServerApplication.class, args);
	}

}
