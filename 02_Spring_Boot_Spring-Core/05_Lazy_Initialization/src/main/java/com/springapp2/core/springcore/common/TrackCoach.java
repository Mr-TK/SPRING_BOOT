package com.springapp2.core.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
    public TrackCoach() {
        System.out.println("In Constructor"+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkOut() {
        return "Run 8Km in 20 mins.";
    }

}
