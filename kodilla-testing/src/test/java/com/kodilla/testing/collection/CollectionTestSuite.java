package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("test case: begin");
    }

    @After
    public void after(){
        System.out.println("test case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {

        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> emptyList = new ArrayList<>();
        //When
        List<Integer> result = oddNumbersExterminator.exterminate(emptyList);
        System.out.println(result);
        //Then
        Assert.assertEquals(0, result.size());

    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();

        evenList.add(2);
        evenList.add(4);
        evenList.add(6);
        evenList.add(8);

        oddList.add(1);
        oddList.add(3);
        oddList.add(5);
        oddList.add(7);
        oddList.add(9);

        //When
        List<Integer> resultForEven = oddNumbersExterminator.exterminate(evenList);
        System.out.println(resultForEven + "\n");
        List<Integer> resultOfOdd = oddNumbersExterminator.exterminate(oddList);
        System.out.println(resultOfOdd + "\n");
        //Then
        Assert.assertEquals(4, resultForEven.size());
        Assert.assertEquals(0, resultOfOdd.size());
    }


}