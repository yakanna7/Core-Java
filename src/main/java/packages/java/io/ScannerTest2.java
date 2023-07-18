package packages.java.io;
//Scanner class example to read double values from text file and find their sum
import java.io.*;
import java.util.Locale;
import java.util.Scanner;

class ScannerTest2 {

	public static void main(String[] args) throws FileNotFoundException {
		try (Scanner s = new Scanner(new BufferedReader(new FileReader(
				"d:/USNumbers.txt")))) {
			s.useLocale(Locale.US);

			double sum = 0.0, val;
			while (s.hasNextDouble()) {
				val = s.nextDouble();
				sum = sum + val;
				System.out.println(val);
			}

			System.out.println("Som of all values is " + sum);
		}
	}
}
