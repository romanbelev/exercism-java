
class Concat {
	public static void main(String[] args) {
		System.out.println();
//	If only 1 operand of '+' is of type String then the other
//	operand is converted to String (by 'toString()' function)
		System.out.println("Root of 2 is: " + Math.sqrt(2));
		System.out.println();

//	a + b + c is eqivalent to (a + b) + c (left connectivity)
		System.out.print("1 + 4 + klockow: ");
		System.out.println(1 + 4 + " klockow");
		System.out.println("" + 1 + 4 + " klockow");
		System.out.println();

		System.out.print("klockow + 1 + 4: ");
		System.out.println(" klockow " + 1 + 4);
		System.out.println();
	}
}

