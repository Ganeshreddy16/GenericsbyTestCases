package org.blz.Generics;

import org.junit.Assert;
import org.junit.Test;

public class testMaximum {
    @Test
    public void shouldGetMax_given3Values_returnCorrectValue() {
       int actualResult = Maximum.getMaximum(11, 7, 9);

        Assert.assertEquals(11,actualResult);
    }
}
