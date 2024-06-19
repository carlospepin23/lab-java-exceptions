//Author: Carlos J. Pepin Delgado <carlos.pepin1@upr.edu>

package com.ironhack;

import java.util.Objects;

public class Person {

    //PRIVATE PROPERTIES
    private int id;
    private String name;
    private int age;
    private String occupation;

    //CONSTRUCTOR
    public Person(int id, String name, int age, String occupation){
        try {
            setId(id);
            setName(name);
            setAge(age);
            setOccupation(occupation);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //GETTERS AND SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0) {
            throw new IllegalArgumentException("Age must be greater than 0");
        }
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    //METHODS
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(occupation, person.occupation);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", occupation='" + occupation + '\'' +
                '}';
    }


}
