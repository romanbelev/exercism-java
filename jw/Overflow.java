public class Overflow {
	public static void main(String[] args) {
		int big = 0x7fffffff;	//	max int value
		System.out.println();
		System.out.println("big = " + big);
//	Surprise! Java lets you overflow.
		int bigger = big;
		bigger *= 4;
		long lbigger = big;
		lbigger *= 4;
		System.out.println("bigger = " + bigger);
		System.out.println("long bigger = " + lbigger);
		System.out.println();
	}
}

