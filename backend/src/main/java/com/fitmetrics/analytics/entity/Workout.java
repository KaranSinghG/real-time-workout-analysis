package com.fitmetrics.analytics.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "WORKOUTS")
public class Workout {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String exercise;
    private int reps;
    private int duration; // in seconds

    public Workout() {
    }

    public Workout(String exercise, int reps, int duration) {
        this.exercise = exercise;
        this.reps = reps;
        this.duration = duration;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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
