//Author: Carlos J. Pepin Delgado <carlos.pepin1@upr.edu>

package com.ironhack;

import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class PersonList {
    private ArrayList<Person> list = new ArrayList<Person>();


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
        return new Person((p.getId() / 15) + 3, p.getName(), p.getAge(), p.getOccupation());

    }

        public void writePersonToFile (Person p) throws IOException {
            FileWriter fileWriter = new FileWriter("person.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(p.toString());
            printWriter.close();
        }

        //ARRAYLIST METHODS
        public List<Person> getList(){
            return list;
        }
    }
