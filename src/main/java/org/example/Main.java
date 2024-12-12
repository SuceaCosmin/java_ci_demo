package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.java_ci_demo.BuildConfig;

import java.util.ArrayList;
import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    private static Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        logger.info("Running " + BuildConfig.APP_NAME + " version " + BuildConfig.APP_VERSION + "..");

        List<Person> list = new ArrayList<>();
        list.add(new Person("Mathew", "Adam", 20));
        list.add(new Person("Jack", "Dowel", 12));
        list.add(new Person("Andrew", "Thomson", 16));

        for (Person person : list) {
            System.out.println(String.format("Hey there, My name is %s %s and I'm %s years old!", person.getFirstName(), person.getLastName(), person.getAge()));
        }

    }
}