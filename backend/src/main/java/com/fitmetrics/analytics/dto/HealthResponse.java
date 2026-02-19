package com.fitmetrics.analytics.dto;

import java.time.LocalDateTime;

public class HealthResponse {
    private String status;
    private LocalDateTime lastUpdated;

    public HealthResponse(String status, LocalDateTime lastUpdated) {
        this.status = status;
        this.lastUpdated = lastUpdated;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
