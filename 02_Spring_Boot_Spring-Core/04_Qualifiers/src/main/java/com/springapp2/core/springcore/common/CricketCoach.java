package com.springapp2.core.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkOut() {
        return "Practice Batting for 30 mins.";
    }

}
