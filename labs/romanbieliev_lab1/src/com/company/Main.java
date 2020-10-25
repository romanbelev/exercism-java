package com.company;


import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        boolean isRepeat = false;
        Scanner scanner = new Scanner(System.in);

        do {
            // Insert number
            System.out.print("Insert number to find divisor: ");
            int num = scanner.nextInt();
            Set<Integer> numbers = findDivisor.find(num);

            // Results
            for (int number : numbers) {
                System.out.println(number);
            }

            // Repeat
            System.out.print("Do you wont to find more (1 - Yes / 0 - No) ?: ");
            isRepeat = (scanner.nextInt() == 1);

        } while (isRepeat);
    }
}

class findDivisor {
    public static Set<Integer> find(int number) {
        int div = number;
        Set<Integer> numbers = new TreeSet<Integer>();

        while (div > 0) {
            if (number % div == 0) {
                numbers.add(div);
            }
            div--;
        }

        return numbers;
    }
}
