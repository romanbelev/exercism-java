import java.util.Scanner;
import java.util.Locale;

public class ScannerTest {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		System.out.println();
		while (s.hasNextInt()) // read while int on input
			System.out.println("Found int: " + s.nextInt());
		System.out.println();

		while (s.hasNextDouble()) // read while double on input
			System.out.println("Found double: " + s.nextDouble());
		System.out.println();
	}
}

