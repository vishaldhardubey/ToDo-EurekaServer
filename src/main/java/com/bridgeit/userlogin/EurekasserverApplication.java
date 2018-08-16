package com.bridgeit.userlogin;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.boot.SpringApplication;
/**
 * <p>
 * <b>Eureka Server Application to enable the eureka server</b>
 * </p>
 * 
 * @author : Vishal Dhar Dubey
 * @version : 1.0
 * @since : 06-07-2018
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekasserverApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekasserverApplication.class, args);
	}
}
