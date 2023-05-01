package org.example;

import java.util.Scanner;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

public class Main {

    public static void main(String[] args) {
        CircuitWorkout circuitTraining = new CircuitWorkout("Tuesday's workout");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Circuit Training!");
        System.out.print("Enter the name of exercise " + i + ": ");
        for (int i = 1; i <= 2; i++) {
            // Get user input for the exercise

            String exerciseName = scanner.nextLine();
            System.out.print("Enter the number of reps: ");
            int reps = scanner.nextInt();
            System.out.print("Enter the body part targeted: ");
            scanner.nextLine(); // consume the newline character
            String bodyPart = scanner.nextLine();
            System.out.print("Enter the duration (in seconds): ");
            int duration = scanner.nextInt();

            // Add the exercise to the circuit training
            Exercise exercise = new Exercise(exerciseName, reps, bodyPart, duration);
            circuitTraining.addExercise(exercise);
        }

        // Start the circuit training
        System.out.println("\nStarting Circuit Training!");
        circuitTraining.start();
    }
}
