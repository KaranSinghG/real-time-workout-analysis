package com.fitmetrics.analytics.dto;

public class WorkoutRequest {
    
    private String exercise;
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
