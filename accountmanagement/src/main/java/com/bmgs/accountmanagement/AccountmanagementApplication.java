package com.bmgs.accountmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.RouterFunction;
import reactor.core.publisher.Flux;

import java.time.Duration;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class AccountmanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountmanagementApplication.class, args);
	}

	@Bean
	RouterFunction<?> routes()
	{
		return
				route(GET("/accounts"), r -> ok().body(Flux.just("a","b"), String.class))

				;

	}
}
