package com.springapp2.core.springcore.config;

import com.springapp2.core.springcore.common.Coach;
import com.springapp2.core.springcore.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
    /*
    @Bean("Swim") can also use custum bean id in  that case we need
    // write that id on Qualifier
    public Coach swimCoach(){
        return new SwimCoach();
    }
     */
}
