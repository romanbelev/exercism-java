package com.company;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> phones = new HashMap<Integer, String>();
        phones.put(1, "Xiaomi");
        phones.put(2, "Iphone");
        phones.put(3, "Samsung");

        // String phone = phones.get(1);
        // System.out.println(phone);

        Set<Integer> phonesKey = phones.keySet();
        Collection<String> values = phones.values();

        for (String value : values) {
            System.out.println(value);
        }

        phones.replace(2, "Phone");

        System.out.println("---------->");

        for (Map.Entry<Integer, String> phone : phones.entrySet()) {
            System.out.printf("Key: %d %s\n", phone.getKey(), phone.getValue());
        }

        System.out.println("---------->");

        Map<Integer, Person> persons = new HashMap<Integer, Person>();
        persons.put(1, new Person("Jony", 30));
        persons.put(2, new Person("Tommy", 35));
        persons.put(3, new Person("Red", 40));

        // persons.clear();

        for (Map.Entry<Integer, Person> person : persons.entrySet()) {
            System.out.println(person.getValue().getName());
        }

    }
}

class Person {
    public int age;
    public String name;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
}
