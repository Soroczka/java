package com.kodilla.testing.forum.statistics;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsCalculatorTestSuite {

    private static Statistics statisticsMock;

    @Before
    public void beforeTests(){
        System.out.println("Tests are starting...");
        statisticsMock = mock(Statistics.class);
    }

    @After
    public void afeterTests() {
        System.out.println("Tests just ended.");
    }

    @Test
    public void testWhenNoPosts(){

        //Given
        when(statisticsMock.postsCount()).thenReturn(0);
        ForumStatisticsCalculator calculator = new ForumStatisticsCalculator(statisticsMock);

        //When
        int posts = calculator.getPosts();

        //Then
        Assert.assertEquals(0, posts);

    }

    @Test
    public void testWhenPostsCount1000(){

        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);
        ForumStatisticsCalculator calculator = new ForumStatisticsCalculator(statisticsMock);
        calculator.calculateAdvStatistics(statisticsMock);

        //When
        int posts = calculator.getPosts();

        //Then
        Assert.assertEquals(1000, posts);
    }

    @Test
    public void testWhenNoComments(){

        //Given
        when(statisticsMock.commentsCount()).thenReturn(0);
        ForumStatisticsCalculator calculator = new ForumStatisticsCalculator(statisticsMock);

        //When
        int comments = calculator.getComments();

        //Then
        Assert.assertEquals(0, comments);

    }

    @Test
    public void testWhenPostCountIsBiggerThanCommentsCount(){

        //Given
        when(statisticsMock.commentsCount()).thenReturn(20);
        when(statisticsMock.postsCount()).thenReturn(30);
        ForumStatisticsCalculator calculator = new ForumStatisticsCalculator(statisticsMock);
        calculator.calculateAdvStatistics(statisticsMock);

        //When
        int posts = calculator.getPosts();
        int comments = calculator.getComments();

        //Then
        Assert.assertEquals(20, comments);
        Assert.assertEquals(30, posts);

    }

    @Test
    public void testWhenPostCountIsSmallerThanCommentsCount(){

        //Given
        when(statisticsMock.commentsCount()).thenReturn(20);
        when(statisticsMock.postsCount()).thenReturn(3);
        ForumStatisticsCalculator calculator = new ForumStatisticsCalculator(statisticsMock);
        calculator.calculateAdvStatistics(statisticsMock);

        //When
        int posts = calculator.getPosts();
        int comments = calculator.getComments();

        //Then
        Assert.assertEquals(20, comments);
        Assert.assertEquals(3, posts);

    }

    @Test
    public void testWhenUserCountIs0(){

        //Given
        List<String> listOfUsers = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        ForumStatisticsCalculator calculator = new ForumStatisticsCalculator(statisticsMock);
        calculator.calculateAdvStatistics(statisticsMock);

        //When
        int users = calculator.getUsersCount();

        //Then
        Assert.assertEquals(0, users);

    }

    @Test
    public void testWhenUserCountIs1000(){

        //Given
        List<String> listOfUsers = new ArrayList<>();
        for(int i = 0 ; i < 1000; i++){
            listOfUsers.add("UserName"+i);
        }
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        ForumStatisticsCalculator calculator = new ForumStatisticsCalculator(statisticsMock);
        calculator.calculateAdvStatistics(statisticsMock);

        //When
        int users = calculator.getUsersCount();

        //Then
        Assert.assertEquals(1000, users);

    }

    @Test
    public void testShowStatistics(){

        //Given
        List<String> listOfUsers = new ArrayList<>();
        listOfUsers.add("UserA");
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        ForumStatisticsCalculator calculator = new ForumStatisticsCalculator(statisticsMock);
        calculator.calculateAdvStatistics(statisticsMock);

        //When
        String statisticsShown = calculator.showStatistics();

        //Then
        Assert.assertEquals("0.5 10.0 20.0", statisticsShown);
    }

}
