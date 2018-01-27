package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public static void beautify(String beautifier, String textToBeautify, PoemDecorator poemDecorator){

        String result = poemDecorator.decorator(beautifier, textToBeautify);
        System.out.println(result);

    }

}
