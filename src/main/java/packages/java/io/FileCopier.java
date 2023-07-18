package packages.java.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class FileCopier {
	
	public static void main(String args[]) throws IOException
	{
		FileInputStream fis =new FileInputStream("e://ds/adv.pdf");
		FileOutputStream fos=new FileOutputStream("d://adv.pdf");
		int data;
	    while ( (data = fis.read())!= -1)
	    {
	    	fos.write(data);
	        System.out.println("File is being copied");
	    }
		
		fos.close();
		fis.close();
		System.out.println("File copied successfully");			
	}	
}
