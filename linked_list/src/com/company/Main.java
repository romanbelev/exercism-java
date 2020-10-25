package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	    LinkedList<String> names = new LinkedList<String>();
        names.addFirst("John");
        names.add("Robby");
        names.addLast("Eddy");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("---------->");

        LinkedList<String> citiesAndNames = new LinkedList(names);
        citiesAndNames.add("New York");

        for (String citieAndName : citiesAndNames) {
            System.out.println(citieAndName);
        }

    }
}
