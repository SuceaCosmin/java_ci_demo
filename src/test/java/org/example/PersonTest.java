package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void isAdult() {

        Person person= new Person("Mike","Adams",21);
        Assertions.assertTrue(person.isAdult());
        person.setAge(18);
        Assertions.assertTrue(person.isAdult());
        person.setAge(17);
        Assertions.assertTrue(person.isAdult());
    }
}