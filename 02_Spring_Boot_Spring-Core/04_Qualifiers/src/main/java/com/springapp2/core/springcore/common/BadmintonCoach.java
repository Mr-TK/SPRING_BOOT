package com.springapp2.core.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach implements Coach{
    @Override
    public String getDailyWorkOut() {
        return "Practice Serving for 10 mins.";
    }

}
