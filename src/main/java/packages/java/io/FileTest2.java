package packages.java.io;

import java.util.*;
import java.io.*;

class FileTest2 {

	public static void main(String[] args) {
				
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter file name with path");
		
		String fileName = input.next();
		input.close();
		File file1 = new File(fileName);
		
		if(file1.exists())
		{
		  System.out.println("File Name is "+file1.getName());	
		  System.out.println("Parent Name is "+file1.getParent());
		  System.out.println("Path is "+file1.getPath());
		  System.out.println("Absolute Path is "+file1.getAbsolutePath());
		  System.out.println("Possible to read data? "+file1.canRead());
		  System.out.println("Possible to write data? "+file1.canWrite());
		  System.out.println("File Size is "+file1.length()+" bytes");
		}
		else
		{
			System.out.println("Please enter a valid & existing file name");
		}
		
	}
}
