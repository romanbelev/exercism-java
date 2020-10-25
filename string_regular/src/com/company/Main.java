package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	    // Split
        String str = "This, is string!";
        String[] myStrings = str.split("\\s*(\\s|,|\\.)\\s*");

        for (String word : myStrings) {
            // System.out.println(word);
        }

        // Mathes
        String phoneNumber = "+380668431810";
        boolean res = phoneNumber.matches("(\\+*)\\d{12}");
        //System.out.println(res);

        // Pattern
        Pattern myPattern = Pattern.compile("string is");
        Matcher matcher = myPattern.matcher("string");
        boolean found = matcher.matches();

        // Pattern
        String input = "This is string Java to find pattern JavaScript";
        Pattern inputPattern = Pattern.compile("Java(\\w*)");
        Matcher inputMatcher = inputPattern.matcher(input);

        while (inputMatcher.find()) {
            // System.out.println(inputMatcher.group());
        }

        // Replace in string with regexp
        String strReplace = "This is string Java to find pattern JavaScript";
        Pattern replacePattern = Pattern.compile("Java(\\w*)");
        Matcher replaceMatcher = inputPattern.matcher(strReplace);
        String mewString = replaceMatcher.replaceAll("HTML");

        // String cat
        String st = "Hello Java! Hello JavaScript! JavaSE 8.";
        Pattern pattern = Pattern.compile("\\s*(\\s|,|!|\\.)\\s*");
        String[] stArray = pattern.split(st);

        for (String word : stArray) {
            System.out.println(word);
        }
        

    }
}
