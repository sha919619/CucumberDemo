package com.sha.steps;


import io.cucumber.java.Before;
import io.cucumber.java.After;
public class Hooks {
    @Before //(global hook) perform before everything
    public void setup(){
        System.out.println("*******************");
        System.out.println("launch browser (global)");
        System.out.println("*******************");
    }
    @After  //(Global hook) perform after everything
    public void tarDown(){
        System.out.println("*******************");
        System.out.println("quit the browser (global)");
        System.out.println("*******************");
    }

    @Before("@First")  // (Local hook) perform before first scenario but after global @Before tag
    public void beforeFirst(){
        System.out.println("*******************");
        System.out.println("before first (local)");
        System.out.println("*******************");
    }

    @Before("@Second")  //(local hook) perform before second scenario
    public void beforeSecond(){
        System.out.println("*******************");
        System.out.println("before second (local)");
        System.out.println("*******************");
    }
    @After("@Third")  //(local hook) perform after third scenario
    public void afterThird(){
        System.out.println("*******************");
        System.out.println("after second (local)");
        System.out.println("*******************");
    }
    @After("@Fourth")  //(local hook) perform after fourth scenario but before global @After hook
    public void afterFourth(){
        System.out.println("*******************");
        System.out.println("close the browser (local)");
        System.out.println("*******************");
    }


}
