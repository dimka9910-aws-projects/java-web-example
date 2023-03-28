package com.github.dimka9910.web.example.app.config;

import com.github.dimka9910.web.example.service.ServiceConfig;
import com.github.dimka9910.web.example.web.WebConfig;
import org.springdoc.webmvc.ui.SwaggerConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ServiceConfig.class, WebConfig.class})
public class ApplicationConfiguration {

}
