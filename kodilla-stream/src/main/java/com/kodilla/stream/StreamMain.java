package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;



public class StreamMain {

    public static void main(String[] args) {
        Processor processor = new Processor();
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(executeSaySomething);

        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);
        //or
        processor.execute(()-> System.out.println("This is an example text."));

        /**
         *  Expression Executor
         */

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a,b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a,b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a,b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a,b) -> a / b);

        //or

        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);


        /**
         * Poem Beautifier
         */

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("ABC","The text is beautiful.", ((beautifier, textToBeautify) -> (beautifier + " " + textToBeautify + " ") + beautifier));
        poemBeautifier.beautify("***", "The text is beautiful.", ((beautifier, textToBeautify) -> (beautifier + textToBeautify + beautifier)));
        poemBeautifier.beautify("", "The text is beautiful.", ((beautifier, textToBeautify) -> textToBeautify.toUpperCase()));


        /**
         * NumbersGenerator
         */

        System.out.println("using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);




    }





}
