# Real-Time Workout Analytics Dashboard

A production-grade real-time analytics system built using:

- React (Frontend)
- Spring Boot (Backend)
- PostgreSQL
- Redis
- Kafka
- Docker
- Kubernetes (AKS)

## Features (Planned)

- JWT Authentication
- Workout logging
- Weekly volume analytics
- Real-time dashboard updates
- Event-driven architecture using Kafka
- Redis caching
- CI/CD with GitHub Actions
- Deployment on AKS

## Architecture

Frontend → API → PostgreSQL  
               ↓  
            Kafka → Analytics Service → WebSocket → Frontend

## Goal

To create an application to track workouts and calculate score and compare with friends
