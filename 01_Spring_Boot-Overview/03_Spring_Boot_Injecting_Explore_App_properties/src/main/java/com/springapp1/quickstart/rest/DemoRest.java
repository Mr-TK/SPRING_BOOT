package com.springapp1.quickstart.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRest {
    // expose "/" that return "Hello World"
    @GetMapping("/")
    public String greethello(){
        return "Hello World";
    }
    // expose a new endpoint "workout"
    @GetMapping("/workout")
    public String getdailyWorkout(){
        return "Run 1km daily";
    }

    // expose a new endpoint "result"
    @GetMapping("/result")
    public String getResult(){
        return "Coming Soon";
    }

    // injecting properties for "dev.name" "zone.name"
    @Value("${dev.name}")
    private String devName;
    @Value("${zone.name}")
    private String zoneName;

    @GetMapping("/devinfo")
    public String getDevinfo(){
        return "Dev: "+devName+"Zone: "+zoneName;
    }
}

