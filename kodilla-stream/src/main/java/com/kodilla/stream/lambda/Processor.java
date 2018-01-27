package com.kodilla.stream.lambda;

public class Processor {

    public void execute (Executor executor){ // przyjmuje jako argument obiekt dowolnej klasy implementujacej interfejs Executor
        executor.process();
    }

}
