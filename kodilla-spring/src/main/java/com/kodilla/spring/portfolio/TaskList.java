package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class TaskList {
    private List<String> tasks;

    public TaskList(List<String> tasks) {
        this.tasks = tasks;
        tasks = new ArrayList<>();
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void addTasks(String taskName){
        tasks.add(taskName);
    }


}
