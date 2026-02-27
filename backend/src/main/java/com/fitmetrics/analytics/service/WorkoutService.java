package com.fitmetrics.analytics.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.fitmetrics.analytics.dto.WorkoutRequest;
import com.fitmetrics.analytics.dto.WorkoutResponse;
import com.fitmetrics.analytics.entity.Workout;
import com.fitmetrics.analytics.exception.WorkoutNotFoundException;
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

    public List<WorkoutResponse> findAllWorkouts(){
        return workoutRepository.findAll().stream()
            .map(workout -> new WorkoutResponse(
                workout.getId(),
                workout.getExercise(),
                workout.getReps(),
                workout.getDuration()
            ))
            .collect(Collectors.toList());
    }

    public WorkoutResponse findWorkoutById(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("Workout id cannot be null");
        }
        Workout workout = workoutRepository.findById(id)
            .orElseThrow(() -> new WorkoutNotFoundException("Workout not found with id: " + id));
        return new WorkoutResponse(
            workout.getId(),
            workout.getExercise(),
            workout.getReps(),
            workout.getDuration()
        );
    }

    public WorkoutResponse updateWorkout(Long id, WorkoutRequest request) {
        Workout workout = workoutRepository.findById(id)
            .orElseThrow(() -> new WorkoutNotFoundException("Workout not found with id: " + id));
        
        workout.setExercise(request.getExercise());
        workout.setReps(request.getReps());
        workout.setDuration(request.getDuration());
        
        Workout updatedWorkout = workoutRepository.save(workout);
        
        return new WorkoutResponse(
            updatedWorkout.getId(),
            updatedWorkout.getExercise(),
            updatedWorkout.getReps(),
            updatedWorkout.getDuration()
        );
    }
}
