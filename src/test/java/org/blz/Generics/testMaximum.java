package org.blz.Generics;

import org.junit.Assert;
import org.junit.Test;

public class testMaximum {
    @Test
    public void weShouldGetMaxFloatAt1stPosition_ReturnCorrectValue(){
        float actualResult = Maximum.getMaximum(13.4f,12.3f,11.2f);
        Assert.assertEquals(13.4,actualResult,0.0);

    }
    @Test
    public void weShouldGetMaxFloatAt2ndPosition_ReturnCorrectValue(){
        float actualResult = Maximum.getMaximum(12.3f,13.4f,11.2f);
        Assert.assertEquals(13.4,actualResult,0.0);

    }
    @Test
    public void weShouldGetMaxFloatAt3rdPosition_ReturnCorrectValue(){
        float actualResult = Maximum.getMaximum(11.2f,12.3f,13.4f);
        Assert.assertEquals(13.4,actualResult,0.0);

    }
}
