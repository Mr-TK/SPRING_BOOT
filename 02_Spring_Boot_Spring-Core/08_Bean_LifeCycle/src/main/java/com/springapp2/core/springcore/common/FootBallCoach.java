package com.springapp2.core.springcore.common;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component // Marks the class as Spring Bean
public class FootBallCoach implements Coach{
    // make it available for Dependency-Injection

    public FootBallCoach() {
        System.out.println("IN Footballcoach"+getClass().getSimpleName());
    }

    @PostConstruct
    public void startupTask(){
        System.out.println("IN startuptask"+getClass().getSimpleName());
    }
    @PreDestroy
    public void destroyTask(){
        System.out.println("IN destroyTask"+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkOut() {
        return "Practice Running for 20 mins.";
    }
}
