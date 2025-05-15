package org.example;

import java.util.List;
import java.util.ArrayList;

public class TaskManager    {
    private List<String> tasks = new ArrayList<>();

    public void addTask(String description) {
        tasks.add(description);
    }

    public List<String> getAllTasks() {
        return tasks;
    }
}


