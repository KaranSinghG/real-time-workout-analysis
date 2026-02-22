package com.fitmetrics.analytics.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fitmetrics.analytics.dto.WorkoutRequest;
import com.fitmetrics.analytics.service.WorkoutService;

@RestController
@RequestMapping("/api/workouts")
public class WorkoutController {
    
    private final WorkoutService workoutService;
    
    public WorkoutController(WorkoutService workoutService) {
        this.workoutService = workoutService;
    }

    @PostMapping
    public String saveWorkout(@RequestBody WorkoutRequest workoutRequest) {
        workoutService.saveWorkout(workoutRequest);
        return "Workout saved successfully";
    }
}
