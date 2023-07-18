//Scanner class example to read individual words from text file.

package packages.java.io;

import java.util.Scanner;
import java.io.*;

class ScannerTest1 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		try (Scanner s = new Scanner(new BufferedReader(new FileReader(
				"d:/MyFile.txt")))) 
		{
			System.out.println("Text File Content Is:");
			while (s.hasNext())
			{
				System.out.println(s.next());
			}
		}
	}
}
