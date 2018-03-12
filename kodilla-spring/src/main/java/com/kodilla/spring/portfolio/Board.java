package com.kodilla.spring.portfolio;

public final class Board {
    private final TaskList toDoList;
    private final TaskList inProgressList;
    private final TaskList doneList;

    public Board(final TaskList toDoList, final TaskList inProgressList, final TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void getToDoList(){
        System.out.println("ToDoList: " + toDoList.getTasks());
    }

    public void getInProgressList(){
        System.out.println("InProgressList: " +inProgressList.getTasks());
    }

    public void getDoneList(){
        System.out.println("DoneList: " + doneList.getTasks());
    }

    public void addTaskToDoList(String taskName){
        toDoList.addTasks(taskName);
    }

    public void addTaskInProgressList(String taskName){
        inProgressList.addTasks(taskName);
    }

    public void addTaskDoneList(String taskName){
        doneList.addTasks(taskName);
    }
}
