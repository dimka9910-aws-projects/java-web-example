package com.github.dimka9910.web.example.web.rest;

import com.github.dimka9910.web.example.dto.WebDataObjectDto;
import com.github.dimka9910.web.example.service.service.ExampleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/rest/example")
@RequiredArgsConstructor
public class ExampleRest {

    private final ExampleService exampleService;

    @Operation(description = "Example Hello World")
    @PostMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public WebDataObjectDto postHelloWorld(@RequestBody String data) {
        return exampleService.helloReturner(data);
    }

    @Operation(description = "Example Hello World")
    @GetMapping(value = "/hello/{data}", produces = MediaType.APPLICATION_JSON_VALUE)
    public WebDataObjectDto getHelloWorld(@PathVariable("data") String data) {
        return exampleService.helloReturner(data);
    }

}
