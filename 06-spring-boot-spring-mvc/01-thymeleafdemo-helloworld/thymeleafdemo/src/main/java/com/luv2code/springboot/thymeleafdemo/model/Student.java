package com.luv2code.springboot.thymeleafdemo.model;

import java.util.List;

public class Student {

    private String firstName;

    private String lastName;

    private String country;

    private String favouriteLanguage;

    private List<String> favouriteSystems;

    public Student(){

    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getCountry(){
        return country;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public void setFavouriteLanguage(String favouriteLanguage){
        this.favouriteLanguage = favouriteLanguage;
    }

    public String getFavouriteLanguage(){
        return favouriteLanguage;
    }

    public void setFavouriteSystems(List<String> favouriteSystems){
        this.favouriteSystems = favouriteSystems;
    }

    public List<String> getFavouriteSystems(){
        return favouriteSystems;
    }
}
