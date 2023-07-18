package packages.java.io;

import java.io.*;
import java.util.Scanner;

class FileInputStreamTest
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter file name to read data");
		String fileName = s.next(); // d:/myfile.txt;
		
		try (FileInputStream fis = new FileInputStream(fileName))
		{
			int byteData;
			System.out.println("The file content is:");
			
			while((byteData = fis.read())!=-1)
			{
				System.out.print((char)byteData);	
			}
		} 
		catch (FileNotFoundException fnf) 
		{
			System.out.println(fileName+" is not available or unable to open.");
		} 
		catch (IOException ie)
		{
			System.out.println("Some Internal Error Occured");
			ie.printStackTrace();
		} 
	}
}
