package com.github.dimka9910.web.example.service.service.impl;

import com.github.dimka9910.web.example.dto.WebDataObjectDto;
import com.github.dimka9910.web.example.service.service.ExampleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.net.InetAddress;

@Slf4j
@Component
@RequiredArgsConstructor
public class ExampleServiceImpl implements ExampleService {

    @Autowired
    Environment environment;

    @Override
    public WebDataObjectDto helloReturner(String data) {

        String hostAdress = null;
        String hostName = null;
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            hostAdress = inetAddress.getHostAddress();
            hostName = inetAddress.getCanonicalHostName();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }

        return WebDataObjectDto.builder()
                .id(1L)
                .data(data)
                .port(environment.getProperty("local.server.port"))
                .host(hostAdress)
                .hostName(hostName)
                .hostNameProperty(environment.getProperty("hostname"))
                .build();



    }
}
