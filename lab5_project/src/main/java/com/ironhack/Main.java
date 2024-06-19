package com.ironhack;

public class Main {
    public static void main(String[] args) throws Exception {
        PersonList personList = new PersonList();

        personList.getList().add(new Person(1, "John Doe", 30, "Software Developer"));

        Person p = personList.getList().get(0);

        personList.writePersonToFile(p);



    }
}