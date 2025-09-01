package com.luv2code.demo.rest;

import com.luv2code.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    // define @PostConstruct to load the student data ...... only once!
    @PostConstruct
    public void loadData(){

        theStudents = new ArrayList<>();

        theStudents.add(new Student("Poornima", "Patel"));
        theStudents.add(new Student("Mario", "Rossi"));
        theStudents.add(new Student("Mary", "Smith"));
    }

    // define endpoint for "/student" - return a list of number

    @GetMapping("/students")
    public List<Student> getStudents(){

        /*
        ArrayList is a class that implements the List interface.
        It gives us a resizable array — meaning you can add/remove
        elements dynamically.
        new ArrayList<>() creates an empty list (no students yet).
         */

        return theStudents;
    }

    // define endpoint or "/student/{student id}" return student at index
    @GetMapping("/student/{studentId}")
    public Student getStudent(@PathVariable int studentId) {

        // just index into the list.... keep it simple for new

        // check the student id again the list size
        if((studentId>=theStudents.size()) || (studentId < 0)){

            throw new StudentNotFoundException("Student id not found - "+studentId);
        }

        return theStudents.get(studentId);
    }

    // Add an exception handler using @ExceptionHandler



    // Add another exception hnadler ... to catch any exception (catch all)



}
