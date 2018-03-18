package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){
        //Given
        Book book1 = new Book("Thinking in Java", "Bruce Eckel", LocalDate.of(1999, 01, 01));
        Book book2 = new Book("Move Head! Java", "Kathy Sierra, Bert Bates", LocalDate.of(2003, 02, 02));
        Library library = new Library("Library nr 1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library nr 2");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try{
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library nr 3");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //When
        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
        Assert.assertEquals(2, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }

    @Test
    public void testRemoveBook(){
        //Given
        Book book1 = new Book("Thinking in Java", "Bruce Eckel", LocalDate.of(1999, 01, 01));
        Book book2 = new Book("Move Head! Java", "Kathy Sierra, Bert Bates", LocalDate.of(2003, 02, 02));
        Library library = new Library("Library nr 1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library nr 2");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try{
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library nr 3");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(1, library.getBooks().size());
        Assert.assertEquals(1, clonedLibrary.getBooks().size());
        Assert.assertEquals(2, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }

}
