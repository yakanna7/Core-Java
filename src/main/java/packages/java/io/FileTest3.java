package packages.java.io;

import java.io.File;
import java.util.Scanner;

class FileTest3 
{
	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);

		System.out.println("Enter directory name with path");

		String dirName = input.nextLine();
		input.close();
		File dir = new File(dirName);
		
		if(dir.isDirectory())
		{
			String allFiles[] = dir.list();
			
			System.out.println("All files and directoies in given directory are");
			
			for(String file : allFiles)
			{
				System.out.println(file);	
			}
			
			System.out.println("Total Files and Directories are "+allFiles.length);
		}
		else
		{
		   System.out.println("Please enter a valid directory name");
		}
	}
}
