package com.company;

public class Main {

    public static void main(String[] args) {
	    Expression two = new Constant(2);
		Expression four = new Constant(4);

	    Expression negateOne = new Negate(new Constant(1));
		Expression sumTwoFour = new Addition(two, four);
        Expression mult = new Multiplication(sumTwoFour, negateOne);
        Expression exp = new Exponent(mult, two);
        Expression res = new Addition(exp, new Constant(1));

        System.out.println();
	    System.out.println(res + " = " + res.evaluate());
	    System.out.println();
    }
}
