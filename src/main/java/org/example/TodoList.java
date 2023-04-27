package org.example;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<Todo> todos;

    public TodoList() {
        this.todos = new ArrayList<>();
    }

    public void addTodo(Todo todo) {
        todos.add(todo);
    }

    public List<Todo> getTodos() {
        return todos;
    }

    public void setTodos(List<Todo> todos) {
        this.todos = todos;
    }

    public void printTodos() {
        System.out.println("Todo List:");
        for (Todo todo : todos) {
            System.out.println("Task: " + todo.getTaskName() + ", Description: " + todo.getTaskDescription() + ", Completed: " + todo.isCompleted());
        }
    }
}
