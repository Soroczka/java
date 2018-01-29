package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.Map;
import java.util.stream.Collectors;


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
         * Book
         */

        BookDirectory theBookDirectory = new BookDirectory();
        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: "  + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

        //

        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));

        System.out.println(theResultStringOfBooks);


        /**
         * Forum
         *
         */

        Forum forum = new Forum();
        Map<Integer, ForumUser> mapOfBooks = forum.getList().stream()
                .filter(forumUser -> forumUser.getSex() != 'M')
                .filter(forumUser -> forumUser.getDateOfBirth().getYear() > 1998)
                .filter(forumUser -> forumUser.getPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getIdOfUser, forumUser -> forumUser));

        System.out.println(mapOfBooks.size());
        mapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + " " + entry.getValue())
                .forEach(System.out::println);

    }

}
