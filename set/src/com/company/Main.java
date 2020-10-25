package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	    HashSet<String> countries = new HashSet<String>();
	    countries.add("China");
	    countries.add("Russia");
		countries.add("Russia");

	    // boolean isAddedRussia = countries.add("Russia");
		// boolean isAddedGermany = countries.add("Germany");

		for (String countrie : countries) {
			System.out.println(countrie);
		}
    }
}
