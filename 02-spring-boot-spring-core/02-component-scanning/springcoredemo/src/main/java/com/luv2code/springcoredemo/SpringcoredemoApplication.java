package com.luv2code.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 $. What happen when i run Main Method?
 => Launches the entire framework
 =>  Spring scans all your classes in the com.luv2code.
     springcoredemo package to find special annotations.

 =>
 */

/*
@SpringBootApplication(

		scanBasePackages = {"com.luv2code.springcoredemo",
		                    "com.luv2code.util"}
)
*/
@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
