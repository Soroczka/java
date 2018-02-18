package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;


public class ExceptionModuleRunner {

    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
//        fileReader.readFile();
//
//        FileReaderWithoutHandling fileReader2 = new FileReaderWithoutHandling();
//        fileReader2.readFile(); // tu trzeba obsłużyć wyjątek, który został rzucony wyżej z klasy FileReaderWithoutHandling przy pomocy THROWS

        try {
            fileReader.readFile();
        } catch (FileReaderException e){
            System.out.println("Problem while reading a file");
        }



    }
}
