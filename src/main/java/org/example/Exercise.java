package org.example;

public class Exercise {
    private String name;
    private int reps;
    private String bodyPart;
    private int duration;

    public Exercise(String name, int reps, String bodyPart, int duration) {
        this.name = name;
        this.reps = reps;
        this.bodyPart = bodyPart;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public int getReps() {
        return reps;
    }

    public String getBodyPart() {
        return bodyPart;
    }

    public int getDuration() {
        return duration;
    }
}
