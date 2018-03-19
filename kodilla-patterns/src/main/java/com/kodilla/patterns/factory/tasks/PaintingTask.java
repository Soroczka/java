package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{

    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private int isDone;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    public int getIsDone() {
        return isDone;
    }

    @Override
    public String executeTask() {
        isDone = 1;
        return "painting task in progress";
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
