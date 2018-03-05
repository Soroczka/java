package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double added = calculator.add(10, 5.5);
        double subtracted = calculator.sub(10, 5.5);
        double multiplied = calculator.mul(10, 2);
        double divided = calculator.div(10, 2);

        //Then
        Assert.assertEquals(15.5, added, 0.01);
        Assert.assertEquals(4.5, subtracted, 0.01);
        Assert.assertEquals(20, multiplied, 0.01);
        Assert.assertEquals(5, divided, 0.01);

    }


    @Test
    public void testDividedWhenDividerIsZero(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double divided = calculator.div(10, 0);

        //Then
        Assert.assertEquals(0, divided, 0.01);

    }

}
