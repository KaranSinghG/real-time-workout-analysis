package com.fitmetrics.analytics.dto;

public class WorkoutResponse {
    
    private int id;
    private String exercise;
    private int reps;
    private int duration; // in seconds

    public WorkoutResponse(int id, String exercise, int reps, int duration) {
        this.id = id;
        this.exercise = exercise;
        this.reps = reps;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public String getExercise() {
        return exercise;
    }

    public int getReps() {
        return reps;
    }

    public int getDuration() {
        return duration;
    }
}
