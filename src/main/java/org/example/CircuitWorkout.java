package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CircuitWorkout extends Todo {
    private final List<Exercise> exercises;

    public CircuitWorkout(String name) {
        super(name);
        exercises = new ArrayList<>();
    }

    public void addExercise() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter exercise name: ");
        String name = scanner.nextLine();
        System.out.print("Enter number of reps: ");
        int reps = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter body part: ");
        String bodyPart = scanner.nextLine();
        System.out.print("Enter duration: ");
        int duration = scanner.nextInt();
        scanner.nextLine();
        Exercise exercise = new Exercise(name, reps, bodyPart, duration);
        exercises.add(exercise);
    }

    public void listExercises() {
        System.out.println("Exercise list:");
        for (Exercise exercise : exercises) {
            System.out.println(exercise.getName() + " (" + exercise.getReps() + " reps, " + exercise.getDuration() + " sec, " + exercise.getBodyPart() + ")");
        }
    }

    public void addExercise(Exercise exercise) {
    }

    public void start() throws InterruptedException {
        System.out.println("Starting circuit training");
        System.out.println("Get ready!");

        for (Exercise exercise : exercises) {
            System.out.println("Starting exercise: " + exercise.getName());
            System.out.println("Reps: " + exercise.getReps());
            System.out.println("Body part targeted: " + exercise.getBodyPart());
            System.out.println("Duration (in seconds): " + exercise.getDuration());

            Thread.sleep(exercise.getDuration() * 1000L);

            System.out.println("Exercise complete.");
            System.out.println();
        }

        System.out.println("Circuit training complete!");
    }

}
