package com.company;

import java.util.Arrays;

public class Famil {
    public Person[] people;


    public Famil(Person[] name) {
        this.people = name;
    }

    @Override
    public String toString() {
        return "Famil{" +
                "name=" + Arrays.toString(people) +
                '}';
    }
}
