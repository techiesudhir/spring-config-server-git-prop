package org.codingfreaks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringBootConfigservergitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootConfigservergitApplication.class, args);
	}
}
