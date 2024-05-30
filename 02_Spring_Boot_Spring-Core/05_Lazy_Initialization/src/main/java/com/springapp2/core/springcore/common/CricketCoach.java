package com.springapp2.core.springcore.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CricketCoach implements Coach{
    public CricketCoach() {
        System.out.println("In Constructor"+getClass().getSimpleName());

    }

    @Override
    public String getDailyWorkOut() {
        return "Practice Batting for 30 mins.";
    }

}
