package com.springapp2.core.springcore.rest;

import com.springapp2.core.springcore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // Define a private field for the dependency

    private Coach myCoach;// we are not allocating memory for it with 'new'

    // Define a constructor for Dependency-Injection
    @Autowired // It tells Spring to inject Dependency
    public DemoController(@Qualifier("swimCoach") Coach footballCoach){
        myCoach = footballCoach;
    }
    // After Having 3 Implementation of Coach It cann't understand which
    // One should it take that's why we need qualifiers FootBallCoach not applied
    // footBallcoach applied 


    @GetMapping("/dailyworkout")
    public String getdailyworkOut(){
        return myCoach.getDailyWorkOut();
    }
}
