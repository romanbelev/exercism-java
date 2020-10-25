/*
Roman Bieliev
1K211
Lab 2
*/

package com.company;

import java.util.*;

public class Main {

    public static final int RANGE = 10;

    public static void main(String[] args) {

        System.out.print("Insert how many numbers needs to generate: ");

        Scanner scanner = new Scanner(System.in);
        int generateNumbers = scanner.nextInt();

        // Generate array
	    RandomGenerator randomGenerator = new RandomGenerator();
	    ArrayList<Integer> randomArray = randomGenerator.generateArray(generateNumbers);

	    // Count frequency
        FrequencyCounter frequencyCounter = new FrequencyCounter();
        Map<Integer, Integer> frequency = frequencyCounter.count(randomArray);

        // Print histogram
        PrintHistogram.print(frequency);
    }
}

class PrintHistogram {

    static void print(Map<Integer, Integer> frequency) {
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            int value = entry.getValue();
            int key = entry.getKey();
            String stars = "*".repeat(value);

            System.out.format("%s. %s\n", key, stars);
        }
    }
}

class FrequencyCounter {

    public Map<Integer, Integer> count(ArrayList<Integer> valueArray) {
        Map<Integer, Integer> frequency = new HashMap<Integer, Integer>();

        System.out.println(valueArray);

        for (int i = 0; i < Main.RANGE; i++) {
            frequency.put(i, 0);
        }

        for (int i = 0; i < valueArray.size(); i++) {
            int currentKey = valueArray.get(i);
            int currentValue = frequency.get(currentKey);
            frequency.put(currentKey, currentValue + 1);
        }

        return frequency;
    }
}

class RandomGenerator {

    public ArrayList<Integer> generateArray(int generate) {
        Random random = new Random();
        ArrayList<Integer> generatedNumbers = new ArrayList<Integer>();

        for (int i = 0; i < generate; i++) {
            generatedNumbers.add(random.nextInt(10));
        }

        return generatedNumbers;
    }
}