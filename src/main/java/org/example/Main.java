package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        TodoList todoList = new TodoList();

        logger.info("Creating new todo list...");


        logger.info("Adding two new todos to the list...");

        todoList.printTodos();
        logger.info("Printing todo list...");

        logger.info("Finished running the to-do list application.");
    }
}
