/*
Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.

Example:
Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"

The returned format must be correct in order to complete this challenge.
Don't forget the space after the closing parentheses!
*/

package com.company;

public class Main {

    public static void main(String[] args) {
        NumberCreater numberCreater = new NumberCreater();
        String phoneNumber = numberCreater.create(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0});

        System.out.println(phoneNumber);
    }
}

class NumberCreater {
    public String create(int[] numbers) {
        StringBuilder phoneNumber = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                phoneNumber.append("(");
            } else if (i == 3) {
                phoneNumber.append(") ");
            } else if (i == 6) {
                phoneNumber.append("-");
            }
            phoneNumber.append(numbers[i]);
        }

        return phoneNumber.toString();
    }
}