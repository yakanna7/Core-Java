//Java program to copy text from one file to another file
package packages.java.io;

import java.io.*;
import java.util.Scanner;

class TextFileCopier
{
	public static void main(String args[]) throws IOException 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter source file name");
		String sourceFile = s.next(); // d:/myfile.txt
		System.out.println("Enter destination file name");
		String destinationFile = s.next(); // d:/copy.txt

		try (FileReader fr = new FileReader(sourceFile);FileWriter fw = new FileWriter(destinationFile, true))
		{
			int ch;
			while ((ch = fr.read()) != -1)
            {
				fw.write(ch);
			}
			fw.flush();
			System.out.println("FIle Copied Successfully");
		}
	}
}
