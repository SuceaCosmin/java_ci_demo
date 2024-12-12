package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(new Person("Mathew", "Adam", 20));
        list.add(new Person("Jack", "Dowel", 12));
        list.add(new Person("Andrew", "Thomson", 16));

        for (Person person : list) {
            System.out.println(person);
        }

    }
}