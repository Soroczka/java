package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Calculator {

    private final Display display;
    private double value;

    @Autowired
    public Calculator(final Display display) {
        this.display = display;
    }

    public double add(double a, double b){
        value = a + b;
        display.displayValue(value);
        return value;
    }

    public double sub(double a, double b){
        value = a - b;
        display.displayValue(value);
        return value;
    }

    public double mul(double a, double b){
        value = a * b;
        display.displayValue(value);
        return value;
    }

    public double div(double a, double b){
        if(b != 0){
            value = a / b;
            display.displayValue(value);
            return value;
        }
        return 0;
    }


}
