package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.*;

public class ForumTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests(){
        System.out.println("all tests are finished");
    }

    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("preparing to execute test #"+testCounter);
    }

    @Test
    //spr czy po dodaniu nowego postu liczba postów wynosi 1
    public void testAddPost(){
        //Given
        ForumUser forumUser = new ForumUser("olgutek", "Olga Soroka");

        //When
        forumUser.addPost("olgutek", "Hello, This is first post.");

        //Then
        Assert.assertEquals(1, forumUser.getPostQuantity());
    }

    @Test
    //spr czy po dodaniu nowego komentarza liczba komentarzy wynosi 1
    public void testAddComment(){
        //Given
        ForumUser forumUser = new ForumUser("Olgutek", "Olga Soroka");
        ForumPost forumPost = new ForumPost("Hello, " + "This is my first post", "olgutek");

        //When
        forumUser.addComment(forumPost, "olgutek", "Thanks");

        //Then
        Assert.assertEquals(1, forumUser.getCommentQuantity());
    }

    @Test
    //sprawdzający czy post pobrany z klasy ForumUser jest taki sam jak post, który był wstawiany do klasy
    public void testGetPost(){
        //Given
        ForumUser forumUser = new ForumUser("Olgutek", "Olga Soroka");
        ForumPost forumPost = new ForumPost("Hello, " + "This is my first post", "olgutek");
        forumUser.addPost(forumPost.getAuthor(), forumPost.getPostBody());

        //When
        ForumPost retrivedPost;
        retrivedPost = forumUser.getPost(0);

        //Then
        Assert.assertEquals(forumPost, retrivedPost);
    }

    @Test
    //sprawdzający czy komentarz pobrany z klasy ForumUser jest taki sam, jak komentarz, który był wstawiany do klasy.
    public void testGetComment(){
        //Given
        ForumUser forumUser = new ForumUser("Olgutek", "Olga Soroka");
        ForumPost forumPost = new ForumPost("Hello, " + "This is my first post", "olgutek");
        ForumComment forumComment = new ForumComment(forumPost, "olgutek", "Thanks");
        forumUser.addComment(forumPost, forumComment.getAuthor(), forumComment.getCommentBody());

        //When
        ForumComment retrivedComment = forumUser.getComment(0);

        //Then
        Assert.assertEquals(forumComment, retrivedComment);

    }

    @Test
    //sprawdzający czy próba usunięcia nieistniejącego posta skończy się zwróceniem wyniku false.
    public void testRemovePostNotExisting(){
        //Given
        ForumUser forumUser = new ForumUser("Olgutek", "Olga Soroka");
        ForumPost forumPost = new ForumPost("Hello, " + "This is my first post", "olgutek");

        //When
        boolean result = forumUser.removePost(forumPost);

        //Then
        Assert.assertFalse(result);
    }

    @Test
    //sprawdzający czy próba usunięcia nieistniejącego komentarza skończy się zwróceniem wyniku false.
    public void testRemoveCommentNotExisting(){
        //Given
        ForumUser forumUser = new ForumUser("Olgutek", "Olga Soroka");
        ForumPost forumPost = new ForumPost("Hello, " + "This is my first post", "olgutek");
        ForumComment forumComment = new ForumComment(forumPost, "olgutek", "Thanks");

        //When
        boolean result = forumUser.removeComment(forumComment);

        //Then
        Assert.assertFalse(result);
    }

//    @Test
//    //weryfikujący czy udało się usunąć wybrany post z klasy.
//
//    public void testRemovePost(){
//        //Given
//        ForumUser forumUser = new ForumUser("Olgutek", "Olga Soroka");
//        ForumPost forumPost = new ForumPost("Hello, " + "This is my first post", "olgutek");
//        forumUser.addPost(forumPost.getAuthor(), forumPost.getPostBody());
//
//        //When
//        boolean result = forumUser.removePost(forumPost);
//
//        //Then
//        Assert.assertFalse(result);
//        Assert.assertEquals(0, forumUser.getPostQuantity());
//    }
//
//    @Test
//    //weryfikujący czy udało się usunąć wybrany komentarz z klasy.
//
//    public void testRemoveComment(){
//        //Given
//        ForumUser forumUser = new ForumUser("Olgutek", "Olga Soroka");
//        ForumPost forumPost = new ForumPost("Hello, " + "This is my first post", "olgutek");
//        ForumComment forumComment = new ForumComment(forumPost, "olgutek", "Thanks");
//        forumUser.addComment(forumPost, forumComment.getAuthor(), forumComment.getCommentBody());
//
//        //When
//        boolean result = forumUser.removeComment(forumComment);
//
//        //Then
//        Assert.assertFalse(result);
//        Assert.assertEquals(0, forumUser.getCommentQuantity());
//    }

}
