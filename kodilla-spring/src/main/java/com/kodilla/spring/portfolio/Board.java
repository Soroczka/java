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

    public TaskList getToDoList(){
        System.out.println("ToDoList: " + toDoList.getTasks());
        return toDoList;
    }

    public TaskList getInProgressList(){
        System.out.println("InProgressList: " +inProgressList.getTasks());
        return inProgressList;
    }

    public TaskList getDoneList(){
        System.out.println("DoneList: " + doneList.getTasks());
        return doneList;
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
