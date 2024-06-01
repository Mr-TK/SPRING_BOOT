package com.springapp2.core.springcore.common;

public class SwimCoach implements Coach{
    public SwimCoach() {
        System.out.println("IN Constructor: "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkOut() {
        return "Swim 100m";
    }
}
