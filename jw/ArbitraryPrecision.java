import java.math.BigInteger;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.math.MathContext;
import java.util.Random;

class ArbitraryPrecision {
	public static void main(String[] args) {
		BigInteger biFromString = new BigInteger("1234567890987654321");
		BigInteger biFromByteArray1 = new BigInteger(
				new byte[] { 64, 64 }); // 64 + 2^8 * 64 = 257 * 64
		BigInteger biFromByteArray2 = new BigInteger(
				new byte[] { 64, 64, 64, 64, 64, 64 });
		BigInteger biFromSignMagnitude = new BigInteger(-1,
				new byte[] { 64, 64, 64, 64, 64, 64 });

		System.out.println();
		System.out.println(new BigInteger("1234567890987654321"));
		System.out.println(new BigInteger(new byte[] { 64, 64 })); // 64 + 2^8 * 64 = 257 * 64
		System.out.println(new BigInteger(new byte[] { 64, 64, 64, 64, 64, 64 }));
		System.out.println(new BigInteger(-1, new byte[] { 64, 64, 64, 64, 64, 64 }));
		System.out.println();

		BigInteger i = new BigInteger("123456789012345678901234567890");
		BigInteger j = new BigInteger("123456789012345678901234567891");
		BigInteger k = new BigInteger("123456789012345678901234567892");

		System.out.println(i.compareTo(i) == 0);
		System.out.println(j.compareTo(i) > 0);
		System.out.println(j.compareTo(k) < 0);
		System.out.println();

		i = new BigInteger("17");
		j = new BigInteger("7");

		System.out.println("sum = " + i.add(j));
		System.out.println("difference = " + i.subtract(j));
		System.out.println("product = " + i.multiply(j));
		System.out.println("quotient = " + i.divide(j));
		System.out.println("and = " + i.and(j));
		System.out.println("or = " + i.or(j));
		System.out.println("not = " + j.not());
		System.out.println("xor = " + i.xor(j));
		System.out.println("andNot = " + i.andNot(j));
		System.out.println("shiftLeft = " + i.shiftLeft(1));
		System.out.println("shiftRight = " + i.shiftRight(1));
		System.out.println();

		i = new BigInteger("1018");
		System.out.println("bitCount = " + i.bitCount());
		System.out.println("bitLength = " + i.bitLength());
		System.out.println("getLowestSetBit = " + i.getLowestSetBit());
		System.out.println("testBit(3) = " + i.testBit(3));
		System.out.println("setBit(12) = " + i.setBit(12));
		System.out.println("flipBit(0) = " + i.flipBit(0));
		System.out.println("clearBit(3) = " + i.clearBit(3));
		System.out.println();

		i = new BigInteger("31");
		j = new BigInteger("24");
		k = new BigInteger("16");
		System.out.println("j.gcd(k) = " + j.gcd(k));
		System.out.println("j.multiply(k).mod(i) = " + j.multiply(k).mod(i));
		// the modular multiplicative inverse of a is defined as the number x such that
		// ax = 1 (mod n). This multiplicative inverse exists if and only if a and n are coprime.
		System.out.println("j.modInverse(i) = " + j.modInverse(i)); // = 22, 22*24 = 1 (mod) 31
		System.out.println("j.modPow(k, i) = " + j.modPow(k, i)); // = 7, 24^16 (mod) 31
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println();

		BigInteger bigInteger = BigInteger.probablePrime(100, new Random());
		System.out.println("new BigDecimal(\"0.1\") = " + new BigDecimal("0.1"));
		System.out.println("new BigDecimal(new char[] {'3','.','1','6','1','5'}) = " +
				new BigDecimal(new char[] {'3','.','1','6','1','5'}));
		System.out.println("new BigDecimal(42) = " + new BigDecimal(42));
		System.out.println("new BigDecimal(123412345678901L) = " + new BigDecimal(123412345678901L));
		System.out.println("new BigDecimal(bigInteger) = " + new BigDecimal(bigInteger));
		System.out.println("new BigDecimal(0.1) = " + new BigDecimal(0.1));
		System.out.println();

		BigDecimal bd1 = new BigDecimal("1.0");
		BigDecimal bd2 = new BigDecimal("1.00");
		BigDecimal bd3 = new BigDecimal("2.0");
		
		System.out.println("bd1.scale = " + bd1.scale());
		System.out.println("bd2.scale = " + bd2.scale());
		System.out.println("bd1.compareTo(bd3) < 0 = " + (bd1.compareTo(bd3) < 0));
		System.out.println("bd1.compareTo(bd2) == 0 = " + (bd1.compareTo(bd2) == 0)); // only value matters
		System.out.println("bd1.equals(bd2) = " + bd1.equals(bd2)); // value & scale matters
		System.out.println();

		System.out.println("bd1.add(bd3) = " + bd1.add(bd3));
		System.out.println("bd1.subtract(bd3) = " + bd1.subtract(bd3));
		System.out.println("bd1.multiply(bd3) = " + bd1.multiply(bd3));
		System.out.println("bd1.divide(bd3) = " + bd1.divide(bd3));
		System.out.println();

		// The enum RoundingMode provides eight rounding modes:

		// CEILING – rounds towards positive infinity
		// FLOOR – rounds towards negative infinity
		// UP – rounds away from zero
		// DOWN – rounds towards zero
		// HALF_UP – rounds towards "nearest neighbor" unless both neighbors are
		//	 equidistant, in which case rounds up
		// HALF_DOWN – rounds towards "nearest neighbor" unless both neighbors are equidistant,
		//	 in which case rounds down
		// HALF_EVEN – rounds towards the "nearest neighbor" unless both neighbors arer
		//	 equidistant, in which case, rounds towards the even neighbor
		// UNNECESSARY – no rounding is necessary and ArithmeticException is thrown if
		//	 no exact result is possible
		// HALF_EVEN rounding mode minimizes the bias due to rounding operations.
		//	 It is frequently used. It is also known as the banker's rounding.

		// MathContext encapsulates both precision and rounding mode.
		// There are few predefined MathContexts:

		// DECIMAL32 – 7 digits precision and a rounding mode of HALF_EVEN
		// DECIMAL64 – 16 digits precision and a rounding mode of HALF_EVEN
		// DECIMAL128 – 34 digits precision and a rounding mode of HALF_EVEN
		// UNLIMITED – unlimited precision arithmetic

		BigDecimal quantity = new BigDecimal("4.5");
		BigDecimal unitPrice = new BigDecimal("2.69");
		BigDecimal discountRate = new BigDecimal("0.10");
		BigDecimal taxRate = new BigDecimal("0.0725");

		// round to 2 decimal places using HALF_EVEN
		BigDecimal total = calculateTotalAmount(quantity, unitPrice, discountRate, taxRate);
		System.out.println(total.setScale(2, RoundingMode.HALF_EVEN));
		System.out.println(total.round(MathContext.DECIMAL32));
		System.out.println(total.round(MathContext.DECIMAL128));
		BigDecimal three = new BigDecimal(3.0);
		BigDecimal oneThird = BigDecimal.ONE.divide(three, MathContext.DECIMAL128);
		System.out.println("1/3 = " + oneThird + "; scale = " + oneThird.scale());
		System.out.println();
	}

	public static BigDecimal calculateTotalAmount(BigDecimal quantity,
			BigDecimal unitPrice, BigDecimal discountRate, BigDecimal taxRate) {
		BigDecimal amount = quantity.multiply(unitPrice);
		BigDecimal discount = amount.multiply(discountRate);
		BigDecimal discountedAmount = amount.subtract(discount);
		BigDecimal tax = discountedAmount.multiply(taxRate);
		BigDecimal total = discountedAmount.add(tax);
		return total;
	}
}

