package com.example;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupedTests {


    @BeforeGroups("Regression")
    public void testPreparation() {
        System.out.println("Env is Prepared to Regression");
    }

    @AfterGroups("Regression")
    public void testExit() {
        System.out.println("Env is Cleaned after the  Regression");
    }

    @Test(groups = "Smoke", priority = 1)
    public void testLogin() {
        System.out.println("Login");
    }

    @Test(groups = "Smoke", priority = 2)
    public void testLogOut() {
        System.out.println("Logout");
    }

    @Test(dependsOnGroups = "Smoke", groups = "Regression")
    public void testHomePage() {
        System.out.println("Home Page Created");
    }

    @Test(dependsOnGroups = {"Smoke", "Regression"})
    public void testAccount() {
        System.out.println("Account Created");
    }


}
