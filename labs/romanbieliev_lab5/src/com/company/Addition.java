package com.company;

public class Addition implements Expression {

    private final Expression expressionOne;
    private final Expression expressionTwo;

    public Addition(Expression expressionOne, Expression expressionTwo) {
        this.expressionOne = expressionOne;
        this.expressionTwo = expressionTwo;
    }

    public int evaluate() {
        return expressionOne.evaluate() + expressionTwo.evaluate();
    }

    @Override
    public String toString() {
        return String.valueOf(evaluate());
    }
}
