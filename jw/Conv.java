class Conv {
	public static void main (String[] args) { 
		System.out.println ();
		System.out.println ("(short)0x12345678 = 0x" +
			Integer.toHexString ((short) 0x12345678));
		System.out.println ("(byte)255 = " +  (byte)255);
		int big = 1234567890;
		float approx = big;
		System.out.println ();
		System.out.println(big - (int) approx);
		System.out.println ();
	}
}

