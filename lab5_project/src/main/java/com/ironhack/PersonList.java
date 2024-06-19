//Author: Carlos J. Pepin Delgado <carlos.pepin1@upr.edu>

package com.ironhack;

import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.UUID;

public class PersonList {
    private List<Person> list = new ArrayList<>();


    //METHODS
    public Person findByName(String n)  {
        if (n.split(" ").length != 2)
            throw new IllegalArgumentException("Invalid name format. It should be 'firstName lastName'.");

        for (Person p : list) {
            if (p.getName().equals(n)) {
                return p;
            }
        }
        return null;
    }

    public Person clone(Person p) {
        return new Person(UUID.randomUUID().hashCode(), p.getName(), p.getAge(), p.getOccupation());

    }

        public void writePersonToFile (Person p) {
            try{
                FileWriter fileWriter = new FileWriter("person.txt");
                PrintWriter printWriter = new PrintWriter(fileWriter);
                printWriter.println(p.toString());
                printWriter.close();
            }catch (IOException e){
                System.out.println("Error: " + e.getMessage());
            }

        }

        //ARRAYLIST METHODS
        public List<Person> getList(){
            return list;
        }
    }
