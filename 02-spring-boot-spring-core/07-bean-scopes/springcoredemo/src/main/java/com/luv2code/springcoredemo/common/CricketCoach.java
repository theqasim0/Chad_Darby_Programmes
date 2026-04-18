package com.luv2code.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
   $ Work Of @Component Annotation

   =>Spring creates an object (a "bean") of CricketCoach class and
    puts it into its "Application Context" (a container for all managed objects).
 */

@Component
// Prototype
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In Constructor: "+ getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout(){
        return "Practise Fast bowling for 15 minutes --)";
    }

}
