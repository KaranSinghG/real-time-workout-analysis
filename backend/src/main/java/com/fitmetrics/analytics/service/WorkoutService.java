package com.fitmetrics.analytics.service;

import org.springframework.stereotype.Service;

import com.fitmetrics.analytics.dto.WorkoutRequest;
import com.fitmetrics.analytics.entity.Workout;
import com.fitmetrics.analytics.repository.WorkoutRepository;

@Service
public class WorkoutService {
    
    private final WorkoutRepository workoutRepository;

    WorkoutService(WorkoutRepository workoutRepository) {
        this.workoutRepository = workoutRepository;
    }

    public void saveWorkout(WorkoutRequest request) {
        Workout workout = new Workout();
        workout.setExercise(request.getExercise());
        workout.setReps(request.getReps());
        workout.setDuration(request.getDuration());
        workoutRepository.save(workout);
    }
}
