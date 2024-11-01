package com.hilquiascamelo.gateway_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiGatewayController {

    @GetMapping("/health")
    public String healthCheck() {
        return "API Gateway is up and running!";
    }
}
