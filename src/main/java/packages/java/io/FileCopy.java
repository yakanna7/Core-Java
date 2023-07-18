package packages.java.io;
import java.io.*;
public class FileCopy {

	public static void main(String args[]) throws IOException
	{
		
		FileInputStream  fis = new FileInputStream("e://ds/adv.pdf");
		FileOutputStream fos=  new FileOutputStream("d://adv.pdf");
		BufferedInputStream bis = new BufferedInputStream(fis,1024);
		BufferedOutputStream bos= new BufferedOutputStream(fos,1024);//default size 512 bytes
		int length=0;
		byte[] dataBuffer = new byte[1024];
	   
	    while((bis!=null) && ((length=bis.read(dataBuffer))!=-1))
	    {
	        bos.write(dataBuffer,0,length);
	        System.out.println("File is being copied");
	    }
	    
		bos.close();
		bis.close();
		System.out.println("File copied successfully");
		fis.close();
		fos.close();				
	}		
}
