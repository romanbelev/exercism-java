package com.company;

import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        TreeMap<Integer, Person> persons = new TreeMap<Integer, Person>();

        persons.put(1, new Person("Eddy", 50));
        persons.put(2, new Person("Mike"));
        persons.put(3, new Person("Sam"));
        persons.put(4, new Person("Lem"));
        persons.put(5, new Person("Kim"));


        for (Map.Entry<Integer, Person> person : persons.entrySet()) {
            System.out.println(person.getValue().getName());
        }

        Map<Integer, Person> personsAfter = persons.tailMap(2);

        System.out.println("---------->");

        for (Map.Entry<Integer, Person> personAfter : personsAfter.entrySet()) {
            System.out.println(personAfter.getValue().getName());
        }

    }
}

class Person {
    private String name;
    private int age;

    Person(String name) {
        this.name = name;
    }

    Person(int age) {
        this.age = age;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
}
