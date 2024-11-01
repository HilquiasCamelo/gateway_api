package com.hilquiascamelo.gateway_api.service;


import org.springframework.stereotype.Service;

@Service
public class MonitoringService {

    public void logRequest(String requestDetails) {
        // Implementar a lógica para registrar detalhes da requisição
        System.out.println("Request logged: " + requestDetails);
    }
}
