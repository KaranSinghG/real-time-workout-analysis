package com.fitmetrics.analytics.service;

import org.springframework.stereotype.Service;

import com.fitmetrics.analytics.dto.HealthResponse;

@Service
public class HealthService {
    
    public HealthResponse getHealthStatus() {
        HealthResponse response = new HealthResponse();
        response.setStatus("UP");
        response.setLastUpdated(java.time.LocalDateTime.now());
        return response;
    }   
}
