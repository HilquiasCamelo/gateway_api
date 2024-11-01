package com.hilquiascamelo.gateway_api.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("token_validation", r -> r.path("/api/v1/auth/validate-token")
                        .filters(f -> f.filter((exchange, chain) -> {
                            String token = exchange.getRequest().getHeaders().getFirst(HttpHeaders.AUTHORIZATION);
                            if (token != null) {
                                exchange.getRequest()
                                        .mutate()
                                        .header(HttpHeaders.AUTHORIZATION, token)
                                        .build();
                            }
                            return chain.filter(exchange);
                        }))
                        .uri("http://localhost:8083")) // URL do Serviço de Autenticação

                .route("autenticacao_service", r -> r.path("/api/v1/auth/**")
                        .uri("http://localhost:8083"))

                .route("lancamentos_service", r -> r.path("/api/daily-balance/**")
                        .uri("http://localhost:8084")) // URL do Serviço de Lançamentos

                .route("lancamentos_service_transaction", r -> r.path("/api/transaction/**")
                        .uri("http://localhost:8084")) // URL do Serviço de Lançamentos

                .route("consolidacao_service", r -> r.path("/consolidacao/**")
                        .uri("http://localhost:8085")) // URL do Serviço de Consolidação
                .build();
    }
}
