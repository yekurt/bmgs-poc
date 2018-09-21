package com.bmgs.telemetry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TelemetryApplication {

    public static void main(String[] args) {
        SpringApplication.run(TelemetryApplication.class, args);
    }

}
