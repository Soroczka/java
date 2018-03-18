package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.media.SnapchatPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User john = new Millennials("John Smith");
        User joe = new YGeneration("Joe Thomas");
        User ana = new ZGeneration("Ana Starwood");

        //When
        String johnShouldUse = john.sharePost();
        System.out.println("john should use: " + johnShouldUse);
        String joeShouldUse = joe.sharePost();
        System.out.println("joe should  use: " + joeShouldUse);
        String anaShouldUse = ana.sharePost();
        System.out.println("ana should use: " +anaShouldUse);

        //Then
        Assert.assertEquals("Facebook", johnShouldUse);
        Assert.assertEquals("Twitter", joeShouldUse);
        Assert.assertEquals("Snapchat", anaShouldUse);
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User john = new Millennials("John Smith");

        //When
        String johnShouldUse = john.sharePost();
        System.out.println(johnShouldUse);
        john.setSocialPublisher(new SnapchatPublisher());
        johnShouldUse = john.sharePost();
        System.out.println(johnShouldUse);

        //Then
        Assert.assertEquals("Snapchat", johnShouldUse);

    }
}
