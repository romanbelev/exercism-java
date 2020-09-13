package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] listOne = new int[]{-6, -91, 1001, -100, -1, -2, 84};
        List<Integer> oneDigit = new ArrayList<Integer>();

        for (int i = 0; i < listOne.length; i++) {
            if (listOne[i] > -10 && listOne[i] < 10) {
                System.out.println("Out print");
                oneDigit.add(listOne[i]);
            }
        }

        int max = oneDigit.get(0);
        for (int i : oneDigit) {
            if (i > max) {
                max = i;
            }
        }

        System.out.println(max);

    }
}
