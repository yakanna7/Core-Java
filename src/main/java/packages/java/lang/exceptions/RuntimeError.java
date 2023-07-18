// Problem without handling exception
package packages.java.lang.exceptions;

import java.io.*;
import java.util.Scanner;

class RuntimeError {

	public static void main(String args[]) throws IOException
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter any text file name to read data"); // d:/fit.txt

		String fileName = s.next();

		BufferedReader br = new BufferedReader(new FileReader(fileName));
		
		String line;

		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}

		br.close();
		s.close();
	}
}
