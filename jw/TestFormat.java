import java.util.Calendar;
import java.util.Locale;

//	An interpreter for printf-style format strings. This class provides support
//	for layout justification and alignment, common formats for numeric, string,
//	and date/time data, and locale-specific output. Common Java types such as
//	byte, BigDecimal, and Calendar are supported.

//	Formatted printing for the Java language is heavily inspired by C's printf.
//	Although the format strings are similar to C, some customizations have been
//	made to accommodate the Java language and exploit some of its features.
//	Also, Java formatting is more strict than C's; for example, if a conversion
//	is incompatible with a flag, an exception will be thrown. In C inapplicable
//	flags are silently ignored. The format strings are thus intended to be
//	recognizable to C programmers but not necessarily completely compatible
//	with those in C. 

//	Full description at https://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html

// 's', 'S'	the result is obtained by invoking arg.toString().
// 'c', 'C'	character	The result is a Unicode character
// 'd'	integral	The result is formatted as a decimal integer
// 'o'	integral	The result is formatted as an octal integer
// 'x', 'X'	integral	The result is formatted as a hexadecimal integer
// 'e', 'E'	floating point	The result is formatted as a decimal number in computerized scientific notation
// 'f'	floating point	The result is formatted as a decimal number
// 'g', 'G'	floating point	The result is formatted using computerized scientific notation or decimal format,
//          depending on the precision and the value after rounding.
// 'a', 'A'	floating point	The result is formatted as a hexadecimal floating-point number with a significand and an exponent
// 't', 'T'	date/time	Prefix for date and time conversion characters. See Date/Time Conversions.
// '%'	percent	The result is a literal '%' ('\u0025')
// 'n'	line separator	The result is the platform-specific line separator

public class TestFormat {

	public static void main(String[] args) {

		// format an int
		long n = 461012;

		System.out.println();
		System.out.format("'%d'%n", n);		// -->  "461012"
		System.out.format("'%08d'%n", n);	// -->  "00461012": 8 chars, fill with 0
		System.out.format("'%+8d'%n", n);	// -->  " +461012": 8 chars, always print sign
		System.out.format("'%,8d'%n", n);	// -->  " 461,012": 8 chars, US 'thousand' notation
		System.out.format("'%-8d'%n", n);	// -->  "461012  ": 8 chars, adjust left
		System.out.format("'%+,8d'%n%n", n);// -->  "+461,012"
		System.out.println();

		// format a double
		double pi = Math.PI;

		System.out.format("'%f'%n", pi);		// --> "3.141593"
		System.out.format("'%g'%n", pi);		// --> "3.14159"
		System.out.format("'%e'%n", pi);		// --> "3.141593e+00"
		System.out.format("'%E'%n", pi);		// --> "3.141593E+00"
		System.out.format("'%.3f'%n", pi);		// --> "3.142"
		System.out.format("'%10.3f'%n", pi);	// --> "     3.142"
		System.out.format("'%-10.3f'%n", pi);	// --> "3.142     "
		System.out.format(new Locale("pl", "PL"), "'%-10.4f'%n", pi); // -->  "3,1416"
		System.out.println();

		System.out.format("'%s'%n", "text");	// --> 'text'
		System.out.format("'%S'%n", "text");	// --> 'TEXT'
		System.out.println();
	}
}

