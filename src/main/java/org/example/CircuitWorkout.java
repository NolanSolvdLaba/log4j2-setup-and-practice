package org.example;


import java.util.LinkedList;

public class CircuitWorkout extends Todo {
    private LinkedList<Exercise> exercises;

    public CircuitWorkout(String name, LinkedList<Exercise> exercises) {
        super(name);
        this.exercises = exercises;
    }

    public LinkedList<Exercise> getExercises() {
        return exercises;
    }
}
