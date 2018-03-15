package com.kodilla.patterns;

import com.kodilla.patterns.singleton.Logger;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void openSettingsFile(){
        Logger.getInstance().log("This is last log text");
    }

    @Test
    public void getLastLog(){
        //Given
        //When
        String logText = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("This is last log text", logText);
    }

}
