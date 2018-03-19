package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryDriving(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.doTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("The driving task", driving.getNameTask());
        Assert.assertEquals(false, driving.isTaskExecuted());
    }

    @Test
    public void testFactoryDrivingIfIsExecuted(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.doTask(TaskFactory.DRIVING);
        driving.executeTask();
        //Then
        Assert.assertEquals("The driving task", driving.getNameTask());
        Assert.assertEquals(true, driving.isTaskExecuted());
    }

}
