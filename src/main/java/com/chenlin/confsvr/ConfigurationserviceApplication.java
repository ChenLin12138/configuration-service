package com.chenlin.confsvr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
//使得服务称为spring cloud config服务
@EnableConfigServer
public class ConfigurationserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationserviceApplication.class, args);
	}

}
