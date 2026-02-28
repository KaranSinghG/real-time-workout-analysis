package com.fitmetrics.analytics.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fitmetrics.analytics.dto.WorkoutRequest;
import com.fitmetrics.analytics.dto.WorkoutResponse;
import com.fitmetrics.analytics.service.WorkoutService;

import jakarta.websocket.server.PathParam;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;



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

    @GetMapping
    public List<WorkoutResponse> getAllWorkouts() {
        return workoutService.findAllWorkouts();
    }

    @GetMapping("/{id}")
    public WorkoutResponse getWorkout(@PathVariable Long id) {
        return workoutService.findWorkoutById(id);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<WorkoutResponse> putMethodName(@PathVariable Long id, @RequestBody WorkoutRequest request) {
        WorkoutResponse response = workoutService.updateWorkout(id, request);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWorkout(@PathVariable Long id) {
        workoutService.deleteWorkout(id);
        return ResponseEntity.noContent().build();
    }
}
