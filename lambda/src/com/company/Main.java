package com.company;

public class Main {

    public static void main(String[] args) {

		CustomMath addSumFunc = (first, second) -> {
			return first + second;
		};

		int res = addToSum(10, 10, (f, s) -> f + s);
		System.out.println(res);

    }

    private static int addToSum(int f, int s, CustomMath customMathFunc) {
		int res = customMathFunc.plus(f, s);
		return res;
	}
}

interface CustomMath {
    public int plus(int first, int second);
}
