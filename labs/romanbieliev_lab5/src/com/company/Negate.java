package com.company;

public class Negate implements Expression {

    private final Expression expression;

    public Negate(Expression expression) {
        this.expression = expression;
    }

    public int evaluate() {
        return expression.evaluate() * -1;
    }

    @Override
    public String toString() {
        return String.valueOf(evaluate());
    }
}
