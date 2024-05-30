package com.springapp2.core.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach implements Coach{
    public BadmintonCoach() {
        System.out.println("In Constructor"+getClass().getSimpleName());

    }

    @Override
    public String getDailyWorkOut() {
        return "Practice Serving for 10 mins.";
    }

}
