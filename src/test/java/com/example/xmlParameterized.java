package com.example;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class xmlParameterized {

    @Parameters({"line", "square"})
    @Test
    public void printValues(int line, int square) {
        Assert.assertEquals((line * line), square, "Formula is wrong");
    }


}


