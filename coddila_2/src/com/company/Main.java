package com.company;

public class Main {

    public static void main(String[] args) {

        int[] listTwo = new int[]{-5, -5, 1};
        System.out.println(solution(listTwo));
    }

    public static int solution(int[] A) {
        int ans = 0;
        for (int i = 0; i < A.length; i++) {
            ans += A[i];
        }

        return ans;
    }
}
