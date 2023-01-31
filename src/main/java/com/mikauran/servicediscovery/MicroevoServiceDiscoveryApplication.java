package com.mikauran.servicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroevoServiceDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroevoServiceDiscoveryApplication.class, args);
    }

}
