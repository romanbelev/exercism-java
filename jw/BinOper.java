class BinOper{
	public static void main(String[] args) {
		int k, m;
		k = 0xf0f0f0f0;
		m = 0xc3c3c3c3;
		System.out.println();
		System.out.println("Arg 1   = " + toBinString(k));
		System.out.println("Arg 2   = " + toBinString(m));
		System.out.println("~a2     = " + toBinString(~m));
		System.out.println("a1 & a2 = " + toBinString(k & m));
		System.out.println("a1 | a2 = " + toBinString(k | m));
		System.out.println("a1 ^ a2 = " + toBinString(k ^ m));
		System.out.println();
		System.out.println("a1 << 2 = " + toBinString(k << 2));
		System.out.println("a1 >> 2 = " + toBinString(k >> 2));
		System.out.println("a1 >>>2 = " + toBinString(k >>> 2));
		System.out.println();

		int binInt = 0b11010101;
		System.out.println("binInt(10): " + binInt);
		System.out.println("binInt( 2): " + Integer.toBinaryString(binInt));
		System.out.println("binInt( 8): " + Integer.toOctalString(binInt));
		System.out.println("binInt(16): " + Integer.toHexString(binInt));
		System.out.println();

		byte binByte = (byte)0b11010101;
		System.out.println("binByte(10): " + binByte);
		System.out.println("binByte( 2): " + Integer.toBinaryString(binByte&0xff));
		System.out.println("binByte( 8): " + Integer.toOctalString(binByte&0xff));
		System.out.println("binByte(16): " + Integer.toHexString(binByte&0xff));
		System.out.println();
	}
    static String toBinString(int i) {
		return String.format("%32s", Integer.toBinaryString(i)).replaceAll(" ", "0");
    }
}

