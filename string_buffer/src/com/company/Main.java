package com.company;

public class Main {

    public static void main(String[] args) {
	    String str = "Javac";
	    StringBuffer strBuffer = new StringBuffer(str);

	    // Ensure capacity
	    strBuffer.ensureCapacity(30);
		int strCapacity = strBuffer.capacity();

		// Length
		int myLengthString = strBuffer.length();

		// To string
		String myJavaString = strBuffer.toString();

		// Char at
		char myChar = strBuffer.charAt(1);

		// Char set
		// strBuffer.setCharAt(0, 'x');

		// getChars
		char[] buffer = new char[10];
		strBuffer.getChars(0, 2, buffer, 0);

		// Append
		// strBuffer.append(" append text");

		// Insert
		// strBuffer.insert(0, "XX");

		// Delete
		// strBuffer.delete(0, 2);

		// Delete at
		// strBuffer.deleteCharAt(2);

		// Substring
		String strSubstring = strBuffer.substring(0, 2);

		// Length
		// strBuffer.setLength(20);
		// strBuffer.setLength(2);

		// Replace
		strBuffer.replace(0, 1, "Hi what about ");

		// Reverse
		// strBuffer.reverse();

	    System.out.println(strBuffer);
    }
}
