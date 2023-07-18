//Java program to copy text file using BufferedReader and BufferedWriter classes
package packages.java.io;

import java.io.*;
import java.util.Scanner;

class BufferedCharacterFileCopier {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter source text file name");
		String sourceFile = s.nextLine(); // d:/myfile.txt
		System.out.println("Enter destination file name");
		String destinationFile = s.nextLine(); // d:/copy.txt

		char[] buffer = new char[1024];

		try (BufferedReader br = new BufferedReader(
				new FileReader(sourceFile));
				BufferedWriter bw = new BufferedWriter(
						new FileWriter(destinationFile)))
	    {

			while (br.read(buffer) != -1)
			{
				bw.write(buffer);
			}
            bw.flush();
			System.out.println("FIle Copied Successfully");
		} 
		catch (FileNotFoundException fnfe)
		{
           System.out.println("The file you are trying to copy is not available or unable to copy");
		}
		catch (IOException ie) 
		{
           System.out.println("Internal error occured");
           ie.printStackTrace();
		}
	}
}
