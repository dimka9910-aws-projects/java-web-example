package com.github.dimka9910.web.example.app.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;


@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI springDemoOpenAPI(@Autowired Environment environment) {
        String serviceTitle = environment.getProperty("service.title").replace('-',' ');
        return new OpenAPI()
                .info(new Info().title(serviceTitle)
                        .description(serviceTitle)
                        .version("v0.0.1")
                        .license(new License().name("dimka9910").url("http://dimka9910.com")))
                .externalDocs(new ExternalDocumentation()
                        .description(serviceTitle)
                        .url("https://dimka9910.com"));
    }

    @Bean
    public GroupedOpenApi notificationServiceDocApi(@Autowired Environment environment) {
        String serviceName = environment.getProperty("service.name");
        return GroupedOpenApi.builder()
                .group(serviceName)
                .pathsToMatch("/rest/**")
                .build();
    }


}
