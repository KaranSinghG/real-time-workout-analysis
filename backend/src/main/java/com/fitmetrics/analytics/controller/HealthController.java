package com.fitmetrics.analytics.controller;

import org.springframework.web.bind.annotation.RestController;

import com.fitmetrics.analytics.dto.HealthResponse;
import com.fitmetrics.analytics.service.HealthService;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HealthController {
    
    private final HealthService healthService;
    
    public HealthController(HealthService healthService) {
        this.healthService = healthService;
    }

    @GetMapping("/api/health")
    public HealthResponse getMethodName() {
        return healthService.getHealthStatus();
    }
    
}
