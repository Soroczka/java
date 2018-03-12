package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("ToDoList")
    TaskList toDoList;

    @Autowired
    @Qualifier("InProgressList")
    TaskList inProgressList;

    @Autowired
    @Qualifier("DoneList")
    TaskList doneList;

    @Bean
    public Board getBoard(){
        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean(name = "ToDoList")
    @Scope("prototype")
    public TaskList getToDoList(){
        List<String> toDoList = new ArrayList<>();
        return new TaskList(toDoList);
    }

    @Bean(name = "InProgressList")
    @Scope("prototype")
    public TaskList getInProgressList(){
        List<String> inProgressList = new ArrayList<>();
        return new TaskList(inProgressList);
    }

    @Bean(name = "DoneList")
    @Scope("prototype")
    public TaskList getDoneList(){
        List<String> doneList = new ArrayList<>();
        return new TaskList(doneList);
    }

}
