package com.bmgs.accountmanagement.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.RouterFunction;
import reactor.core.publisher.Flux;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@RestController
public class AccountController {

    @Bean
    RouterFunction<?> routes() {
        return route(GET("/accounts"), r -> ok().body(Flux.just("a", "b"), String.class));
    }

}
