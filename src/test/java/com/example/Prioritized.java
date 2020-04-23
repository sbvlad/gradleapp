package com.example;

import org.testng.annotations.Test;

public class Prioritized {


    @Test(priority = 3)
    public void test1(){
        System.out.println("This one must be last test");
    }
    @Test(priority = 2)
    public void test2(){
        System.out.println("This one must be in the middle");
    }
    @Test(priority = 1)
    public void test3(){
        System.out.println("This must be the first one");
    }

}
