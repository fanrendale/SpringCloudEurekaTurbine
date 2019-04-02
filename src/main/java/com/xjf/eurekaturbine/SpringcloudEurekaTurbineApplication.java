package com.xjf.eurekaturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * 断路器集群监控
 * @author Administrator
 */
@EnableTurbine
@SpringBootApplication
public class SpringcloudEurekaTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaTurbineApplication.class, args);
    }

}
