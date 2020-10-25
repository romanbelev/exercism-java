package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Mercedes");
        cars.add("BMW");
        cars.add(1, "Daewoo");

        cars.remove("BMW");

        cars.set(0, "Volkswagen");

        for (String car : cars) {
            System.out.println(car);
        }

        System.out.println("---------->");
        System.out.println(cars.get(0));

        System.out.println(cars.size());

        if (cars.contains("BMW")) {
            System.out.println("Cars contains BMW");
        }

        System.out.println("---------->");

        Object[] carsArray = cars.toArray();
        for (Object car : carsArray) {
            System.out.println(car);
        }




    }
}
