package com.company;

public class Multiplication implements Expression {

    private Expression expressionOne;
    private Expression expressionTwo;

    public Multiplication(Expression expressionOne, Expression expressionTwo) {
        this.expressionOne = expressionOne;
        this.expressionTwo = expressionTwo;
    }

    public int evaluate() {
        return expressionOne.evaluate() * expressionTwo.evaluate();
    }

    @Override
    public String toString() {
        return String.valueOf(evaluate());
    }
}
