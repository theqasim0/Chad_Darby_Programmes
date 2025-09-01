package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

/*
   $ Work Of @Component Annotation

   =>Spring creates an object (a "bean") of CricketCoach class and
    puts it into its "Application Context" (a container for all managed objects).
 */

@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return "Practise Fast bowling for 15 minutes --)";
    }

}
