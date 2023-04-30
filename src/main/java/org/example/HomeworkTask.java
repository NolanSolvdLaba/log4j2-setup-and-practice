package org.example;

public class HomeworkTask extends Todo {
    private String subject;

    public HomeworkTask(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
}