package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testBoard(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When & Then
        board.getToDoList();
        board.getInProgressList();
        board.getDoneList();

    }

    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.addTaskToDoList("Task nr 3");
        board.addTaskInProgressList("Task nr 2");
        board.addTaskDoneList("Task nr 1");
        //Then
        Assert.assertEquals(board.getToDoList().getTasks().size(), 1);
        Assert.assertEquals(board.getInProgressList().getTasks().size(), 1);
        Assert.assertEquals(board.getDoneList().getTasks().size(), 1);
    }
}
