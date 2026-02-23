package com.fitmetrics.analytics.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fitmetrics.analytics.entity.Workout;

public interface WorkoutRepository extends JpaRepository<Workout, Long> {
    
}
