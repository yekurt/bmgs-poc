package com.bmgs.telemetry.rest;


import com.bmgs.telemetry.converter.TelemetryDataConverter;
import com.bmgs.telemetry.data.entity.TelemetryData;
import com.bmgs.telemetry.data.repository.TelemetryRepository;
import com.bmgs.telemetry.rest.resource.TelemetryResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.RouterFunction;
import reactor.core.publisher.Flux;

import java.time.Duration;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@RestController
public class TelemetryController {

    /*
    @Autowired
    private TelemetryDataConverter c;

    @Bean
    ApplicationRunner init(TelemetryRepository tr) {
        return args -> tr.deleteAll()
                .thenMany(
                        Flux.just("temperature", "pressure").map(l -> new TelemetryData(null, l)).flatMap(tr::save)
                )
                .thenMany(tr.findAll())
                .subscribe(System.out::println);
    }

    @Bean
    RouterFunction<?> routes(TelemetryRepository tr) {
        return
                route(GET("/telemetry"), r -> ok().body(tr.findAll().map(t -> c.toResource(t)), TelemetryResource.class))
                        .andRoute(GET("/telemetry/{id}"), r -> ok().body(tr.findById(r.pathVariable("id")).map(t -> c.toResource(t)), TelemetryResource.class))
                        .andRoute(GET("/delay"), r -> ok().body(Flux.just("Hello World").delayElements(Duration.ofSeconds(10)), String.class)
                        );

    }
    */
}
