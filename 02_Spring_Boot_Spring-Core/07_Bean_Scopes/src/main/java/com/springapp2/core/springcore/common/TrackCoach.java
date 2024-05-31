package com.springapp2.core.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkOut() {
        return "Run 8Km in 20 mins.";
    }

}
