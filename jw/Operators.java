class Operators {
	public static void main(String[] args) {
		int k, m, n;
		double x, y, z;
		System.out.println();
		k = 7;
		m = 3;
		n = k / m;
		System.out.println("7 / 3 = " + n);
		x = k / m;
		System.out.format ("7 / 3 = %.1f\n", x);
		n = k % m;
		System.out.println("7 % 3 = " + n);

		k = -7;
		n = k / m;
		System.out.println("(-7) / 3 = " + n);
		n = k % m;
		System.out.println("(-7) % 3 = " + n);

		System.out.println();
		m = 8;
		n = m++;
		System.out.println("n = m++; m = " + m + " n = " + n);
		n = ++m;
		System.out.println("n = ++m; m = " + m + " n = " + n);
		System.out.println();
	}
}

