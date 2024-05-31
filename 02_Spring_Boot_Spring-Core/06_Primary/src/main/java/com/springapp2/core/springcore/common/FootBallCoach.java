package com.springapp2.core.springcore.common;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component // Marks the class as Spring Bean
@Primary
public class FootBallCoach implements Coach{
    // make it available for Dependency-Injection
    @Override
    public String getDailyWorkOut() {
        return "Practice Running for 20 mins.";
    }
}
