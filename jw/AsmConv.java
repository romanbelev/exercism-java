class AsmConv {
	public static void main(String[] args) {
		short s = 72;
		float f = s;
//		char c1 = s;	//	Error! s is not constant
		char c2 = (char) s;
		System.out.println();
		System.out.println("s = " + s);
		System.out.println("f = " + f);
		System.out.println("c2 = " + c2);
		System.out.println();
	}
}
					 
