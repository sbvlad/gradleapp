package com.example;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvided {
    @DataProvider(name = "SearchProvider")
    public Object[][] getSearchData(){
        return new Object[][]{
                {1, 2,3},
                {-7, 7, 0},
                {5, 5,10},
                {-100, 101,1}

        };
    }

    @Test(dataProvider = "SearchProvider")
    public void useTestData(int first, int second, int result){
        Assert.assertEquals((first+second),result,"Sum isn't correct");
    }
}
