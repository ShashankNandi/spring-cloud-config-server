package com.iris.microservices.spring_cloud_config_sever;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigSeverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigSeverApplication.class, args);
	}
//	url to get the configuration "localhost:8888//limits-services/default"

//	ie limits-services is the name of the propertied file in the local git repo
//	default means the default environment , where other other environments can be production env, test env

}
