package com.company;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Expression expr = ExpressionHelper::isPositive;
        ExpressionHelper expr = new ExpressionHelper();

	    System.out.println(sum(nums, expr::isEven));
    }

    public static int sum(int[] nums, Expression exp) {
        int accamulator = 0;

        for (int num : nums) {
            if (exp.isEqual(num)) {
                accamulator = accamulator + num;
            }
        }

        return accamulator;
    }
}

interface Expression {
    boolean isEqual(int n);
}

class ExpressionHelper {
    public boolean isEven(int n) {
        return n % 2 == 0;
    }

    public boolean isPositive(int n) {
        return n > 0;
    }
}
