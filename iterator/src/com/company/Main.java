package com.company;

public class Main {

    public static void main(String[] args) {
        // CustomArrayFactoryInterface factory = new CustomArray<Person>();
        CustomArray<Person> persons = new CustomArray<Person>(Person.class, 16);
        persons.add(new Person("Tommy", 15));
        persons.add(new Person("Jonny", 10));
        persons.add(new Person("Sonny", 21));
        persons.add(new Person("Eddy", 30));
        persons.add(new Person("Kim", 50));

        CustomIterator<Person> iter = persons.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}

class Person {
    private String name;
    private int age;

    Person() {

    }

    Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

}

