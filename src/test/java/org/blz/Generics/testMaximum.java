package org.blz.Generics;

import org.junit.Assert;
import org.junit.Test;

public class testMaximum {
    @Test
    public void weShouldGetMaxStringAt1stPosition_ReturnCorrectValue(){
        String actualResult= Maximum.getMaximum("gh","fg","ef");
        Assert.assertEquals("gh",actualResult);
    }
    @Test
    public void weShouldGetMaxStringAt2stPosition_ReturnCorrectValue(){
        String actualResult= Maximum.getMaximum("fg","gh","ef");
        Assert.assertEquals("gh",actualResult);
    }
    @Test
    public void weShouldGetMaxStringAt3stPosition_ReturnCorrectValue(){
        String actualResult= Maximum.getMaximum("ef","fg","gh");
        Assert.assertEquals("gh",actualResult);
    }
}
