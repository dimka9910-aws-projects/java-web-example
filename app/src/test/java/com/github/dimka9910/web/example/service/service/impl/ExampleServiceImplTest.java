package com.github.dimka9910.web.example.service.service.impl;

import com.github.dimka9910.web.example.dto.WebDataObjectDto;
import com.github.dimka9910.web.example.service.service.ExampleService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.core.env.Environment;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.net.InetAddress;

public class ExampleServiceImplTest {

    @Mock
    private Environment environment;
    @Mock
    private InetAddress inetAddress;

    @InjectMocks
    private ExampleServiceImpl exampleService;


    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testHelloReturner() throws Exception {
        String data = "Test Data";


        when(inetAddress.getHostAddress()).thenReturn("localhost");
        when(inetAddress.getCanonicalHostName()).thenReturn("localhost.localdomain");

        when(environment.getProperty("local.server.port")).thenReturn("8080");
        when(environment.getProperty("hostname")).thenReturn("my-hostname");

        WebDataObjectDto webDataObjectDto = exampleService.helloReturner(data);

        assertEquals(Long.valueOf(1L), webDataObjectDto.getId());
        assertEquals(data, webDataObjectDto.getData());
        assertEquals("8080", webDataObjectDto.getPort());
        assertEquals("my-hostname", webDataObjectDto.getHostNameProperty());
    }


}
