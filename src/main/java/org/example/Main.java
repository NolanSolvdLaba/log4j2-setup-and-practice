package org.example;

import java.util.Scanner;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        CircuitWorkout circuitTraining = new CircuitWorkout("Tuesday's workout");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Circuit Training!");

        boolean addMoreExercises = true;
        while (addMoreExercises) {
            System.out.print("Enter the name of exercise: ");
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

            System.out.print("Do you want to add more exercises? (Y/N) ");
            String answer = scanner.nextLine().toLowerCase();
            while (!answer.equals("y") && !answer.equals("n")) {
                System.out.print("Invalid input. Do you want to add more exercises? (Y/N) ");
                answer = scanner.nextLine().toLowerCase();
            }
            addMoreExercises = answer.equals("y");
        }

        // Start the circuit training
        System.out.println("\nStarting Circuit Training!");
        circuitTraining.start();
    }
}
