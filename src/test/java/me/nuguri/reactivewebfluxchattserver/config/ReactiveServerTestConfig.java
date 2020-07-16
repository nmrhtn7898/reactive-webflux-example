package me.nuguri.reactivewebfluxchattserver.config;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.test.web.reactive.server.WebTestClient;

@TestConfiguration
public class ReactiveServerTestConfig {

    @Bean
    public WebTestClient webTestClient(ApplicationContext applicationContext) {
        return WebTestClient
                .bindToApplicationContext(applicationContext)
                .build();
    }

}
