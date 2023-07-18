//Java program to copy binary file using BufferedInputStream and BufferedOutputStream
package packages.java.io;

import java.io.*;
import java.util.Scanner;

class BufferedBinaryFileCopier 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter source file name of any type");
		String sourceFile = s.nextLine(); // d:/myfile.pdf
		System.out.println("Enter destination file name");
		String destinationFile = s.nextLine(); // d:/copy.pdf

		byte[] buffer = new byte[1024];

		try (BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream(sourceFile));
				BufferedOutputStream bos = new BufferedOutputStream(
						new FileOutputStream(destinationFile)))
	    {

			while (bis.read(buffer) != -1)
			{
				bos.write(buffer);
			}

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
