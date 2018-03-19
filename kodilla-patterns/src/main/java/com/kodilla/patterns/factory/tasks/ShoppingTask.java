package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task{

    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private int isDone;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public int getIsDone() {
        return isDone;
    }

    @Override
    public String executeTask() {
        isDone = 1;
        return "shopping task in progress";
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
