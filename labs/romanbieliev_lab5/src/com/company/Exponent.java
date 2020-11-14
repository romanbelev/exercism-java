package com.company;

public class Exponent implements Expression {

    private Expression expression;
    private Expression exponent;

    public Exponent(Expression expression, Expression exponent) {
        this.expression = expression;
        this.exponent = exponent;
    }

    public int evaluate() {
        return (int)Math.pow(expression.evaluate(), exponent.evaluate());
    }

    @Override
    public String toString() {
        return String.valueOf(evaluate());
    }
}
