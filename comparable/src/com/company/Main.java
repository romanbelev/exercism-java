package com.company;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	    TreeSet<Person> peoples = new TreeSet<Person>();

	    peoples.add(new Person("John", 10));
        peoples.add(new Person("Sam", 10));
        peoples.add(new Person("Robby", 10));

        for (Person people : peoples) {
            System.out.println(people.getName());
        }

        System.out.println("---------->");

        Comparator<Person> personComparator = new PersonNameComparator().thenComparing(new PersonAgeComparator());
        TreeSet<Person> peopleLastNames = new TreeSet<Person>(personComparator);

        peopleLastNames.add(new Person("Smi", 10));
        peopleLastNames.add(new Person("Zir", 2));
        peopleLastNames.add(new Person("Tom", 100));
        peopleLastNames.add(new Person("Tom", 90));

        for (Person peopleLastName : peopleLastNames) {
            System.out.printf("Name: %s, %d\n", peopleLastName.getName(), peopleLastName.getAge());
        }

    }
}

class PersonAgeComparator implements Comparator<Person> {
    public int compare(Person a, Person b) {
        int aAge = a.getAge();
        int bAge = b.getAge();

        if (aAge > bAge) {
            return 1;
        } else if (aAge < bAge) {
            return -1;
        } else {
            return 0;
        }
    }
}

class PersonNameComparator implements Comparator<Person> {
    public int compare(Person a, Person b) {
        return a.getName().compareTo(b.getName());
    }
}

class Person implements Comparable<Person> {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int compareTo(Person p) {
        return name.length() - p.getName().length();
    }
}
