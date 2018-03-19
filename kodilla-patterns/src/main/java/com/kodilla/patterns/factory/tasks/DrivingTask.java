package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {

    private final String taskName;
    private final String where;
    private final String using;
    private int isDone;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    public int getIsDone() {
        return isDone;
    }

    @Override
    public String executeTask() {
        isDone = 1;
        return "driving task in progress";
    }

    @Override
    public String getNameTask() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (isDone == 1){
            return true;
        }
        return false;
    }
}
