package com.kodilla.exception.test;

public class FirstChallange {

    public double divide(double a, double b) throws ArithmeticException {

        try {

            if(b == 0){
                throw new ArithmeticException();
            }

            return a/b;

        } catch (ArithmeticException e){

            System.out.println("Something went wrong.");
            return 0;

        }


    }

    public static void main(String[] args) {

        FirstChallange firstChallange = new FirstChallange();

        double result = firstChallange.divide(3, 0);

        System.out.println(result);
    }

}
