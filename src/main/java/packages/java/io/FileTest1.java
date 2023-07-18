// Example to create file and directory
package packages.java.io;

import java.io.*;

class FileTest1 
{
	public static void main(String[] args) 
	{
		File file1 = new File("d://abc.txt");
		File dir1  = new File("d://fit");
		
		System.out.println("Is file1 a file? "+file1.isFile());
		System.out.println("Is dir1 a directory? "+dir1.isDirectory());
		
		if (file1.exists())
		{
			System.out.println("File already exists");
		}
		else
		{
				try
				{
					file1.createNewFile();
					System.out.println("File Created Successfully");
				} 
				catch (IOException e)
				{
					System.out.println("Unable to Create file because "+e.getMessage());
				}
		 }
		
		if(dir1.exists())
		{
			System.out.println("Directory already exists");
		}
		else
		{
			dir1.mkdir();
			System.out.println("Directory Created Successfully");
		}
		
		System.out.println("Is file1 a file? "+file1.isFile());
		System.out.println("Is dir1 a directory? "+dir1.isDirectory());
	}
}


