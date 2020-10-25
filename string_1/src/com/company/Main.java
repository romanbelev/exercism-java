package com.company;

public class Main {

    public static void main(String[] args) {
	    String myString = new String(new char[] {'h', 'i', ' ', 'h', 'o', 'w', ' '});
	    String myStringTwo = "hi";

	    // Get length
        int stringLength = myString.length();

        // Concat
        String myConcatString = myString + myStringTwo + 100;
        String myConcatStringTwo = myString.concat(myStringTwo);

        // Delimeter
        String myStringDelimeter = String.join(", ", myString, myStringTwo);

        // Get char
        char myChar = myString.charAt(0);

        // Get chars
        char[] toMyChars = new char[] {'a', 'b', 'c', 'd'};
        myString.getChars(0, 1, toMyChars, 0);

        // Equals
        boolean isEqual;
        isEqual = myString.equals(myStringTwo);

        // Region mathces
        boolean myRegionMatches = myString.regionMatches(false, 0, myStringTwo, 0, 2);

        // Compare to
        int myCompareTo = myString.compareTo(myStringTwo);

        // Index of
        int indexOf = myString.indexOf("w");

        // Start with
        boolean myStartWith = myString.startsWith("hi");

        // Replace
        String myReplaceString = myString.replace("h", "x");

        // Trim
        String myTrim = myString.trim();

        // Substring
        String mySubstr = myString.substring(1);

        // Upper case
        String myUpperCase = myString.toUpperCase();

        String[] myWords = myString.split(" ");
        for (String myWord : myWords) {
            System.out.println(myWord);
        }

	    // System.out.println(myUpperCase);
    }
}
