package com.fitmetrics.analytics.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class WorkoutRequest {
    @NotBlank(message = "Exercise name cannot be blank")
    private String exercise;
    @NotNull(message = "Reps cannot be null")
    @Positive(message = "Reps must be a positive integer")
    private int reps;
    private int duration; // in seconds

    public WorkoutRequest() {
    }

    public WorkoutRequest(String exercise, int reps, int duration) {
        this.exercise = exercise;
        this.reps = reps;
        this.duration = duration;
    }

    public String getExercise() {
        return exercise;
    }
    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    public int getReps() {
        return reps;
    }
    public void setReps(int reps) {
        this.reps = reps;
    }

    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
}
