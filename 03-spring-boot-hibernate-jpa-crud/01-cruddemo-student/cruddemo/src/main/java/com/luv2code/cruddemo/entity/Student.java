package com.luv2code.cruddemo.entity;

import jakarta.persistence.*;

// @Entity => “This Java class represents a table in the database.
//            When the application runs, map its fields to columns.”
@Entity
@Table(name="student")
public class Student {

    // Define fields
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;

    // Define Constructors

    public Student() {

    }

    public Student(String firstName, String lastName, String email){
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
    }

    // Define Getters/Setters

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setId() {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    // Define toString method


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


