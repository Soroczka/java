package com.kodilla.testing;

import com.kodilla.testing.user.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")){
            System.out.println("test ok");
        }
        else {
            System.out.println("error!");
        }

        System.out.println("Pierwszy test jednostkowy");

        Calculator calc = new Calculator();
        int addRestult = calc.add(10, 20);
        int subtractResult = calc.subtract(20, 10);

        if(addRestult == 30){
            System.out.println("Nice");
        }
        else {
            System.out.println("error!");
        }

        if(subtractResult == 10){
            System.out.println("Nice");
        }
        else {
            System.out.println("error!");
        }
    }
}