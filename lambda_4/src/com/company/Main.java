package com.company;

import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        // Predicate
        Predicate<Integer> isPositive = (x) -> x > 0;
        System.out.println(isPositive.test(2));

        // BinaryOperator
        BinaryOperator<Integer> multiply = (x, y) -> x * y;
        System.out.println(multiply.apply(2, 5));

        // UnaryOperator
        UnaryOperator<Integer> quad = (x) -> x * x;
        System.out.println(quad.apply(10));

        // Funciton
        Function<Integer, String> convert = (x) -> String.valueOf(x) + " this is string";
        System.out.println(convert.apply(10));

        // Concumer
        Consumer<Integer> consumer = (x) -> System.out.println(x);
        consumer.accept(200);

        // Supplier
        Supplier<String> sp = () -> "This is line";
        System.out.println(sp.get());

        
    }
}
