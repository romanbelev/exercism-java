public class StringConcat {
	public static void main(String[] args) {
		System.out.println();
		String s = "Ala";
		f(s);
		System.out.println("In main() :" + s);
		System.out.println("In main() :" + s.hashCode());
		System.out.println();
	}
	static void f(String s) {
		System.out.println("In f() :" + s);
		System.out.println("In f() :" + s.hashCode());
		s += " ma kota";
//	Strings are immutable, so for concatenation new String
//	is created; String passed by argument remains unchanged
		System.out.println("In f() :" + s);
		System.out.println("In f() :" + s.hashCode());
		System.out.println();
	}
}

