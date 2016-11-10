package com.example.miksten.myapplication;

import java.io.Serializable;

public class Person implements Serializable {

    // private static final long serialVersionUID = 1L;
    String first_name;
    String last_name;
    int age;
    String city;

    public Person(String f_name, String l_name, int age, String city) {
        this.first_name = f_name;
        this.last_name = l_name;
        this.age = age;
        this.city = city;
    }
}