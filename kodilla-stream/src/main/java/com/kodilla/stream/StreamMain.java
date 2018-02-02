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

import java.time.LocalDate;
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
        forum.addUser(0, "username_0", 20, LocalDate.of(1958, 05, 13), 'M');
        forum.addUser(1, "username_1", 2, LocalDate.of(1978, 01, 14), 'M');
        forum.addUser(2, "username_2", 0, LocalDate.of(1990, 07, 18),'F');
        forum.addUser(3, "username_3", 74, LocalDate.of(1984, 11, 24), 'M');
        forum.addUser(4, "username_4", 3, LocalDate.of(1999, 12, 2), 'F');
        forum.addUser(5, "username_5", 17, LocalDate.of(2002, 4, 02), 'M');

        Map<Integer, ForumUser> mapOfBooks = forum.getUserList().stream()
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
