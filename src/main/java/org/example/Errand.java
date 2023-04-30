package org.example;

public class Errand extends Todo {
    private String location;

    public Errand(String name, String location) {
        super(name);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
}