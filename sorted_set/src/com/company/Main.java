package com.company;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet<String> cars = new TreeSet<String>();

        cars.add("Mercedes");
        cars.add("Alfa");
        cars.add("Daewoo");
        cars.add("Zoe");

        System.out.println(cars.first());
        System.out.println(cars.last());

        System.out.println("---------->");

        SortedSet<String> sortedCars = cars.subSet("Alfa", "Zoe");
        System.out.println(sortedCars);

    }
}
