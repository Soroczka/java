package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";
    private Task task;

    public final Task doTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("The driving task", "To Warsaw", "Car");
            case PAINTING:
                return new PaintingTask("The Paiting Task", "Black", "Night");
            case SHOPPING:
                return new ShoppingTask("The Shopping Task", "Milk", 2);
            default:
                return null;
        }
    }
}
