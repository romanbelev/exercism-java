package com.company;

import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) {
        ArrayDeque<String> cars = new ArrayDeque<String>();

        cars.add("Volkswagen");
        cars.add("Mercedes");
        cars.addFirst("BMW");
        cars.push("Daewoo");
        cars.addLast("Tayota");

        for (String car : cars) {
            System.out.println(car);
        }

        System.out.println("---------->");

        // String carFirst = cars.getFirst();
        // System.out.println(carFirst);
        // String carLast = cars.getLast();
        // System.out.println(carFirst);

        while (cars.peek() != null) {
            System.out.println(cars.pop());
        }

        System.out.println(cars.size());

        System.out.println("---------->");

        ArrayDeque<Animal> animals = new ArrayDeque<Animal>();
        animals.add(new Animal("Elephant"));
        animals.add(new Animal("Cat"));

        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }


    }
}

class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}
