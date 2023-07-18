//Java program to implement interface
package oops.interfaces;

interface Printable 
{
   public abstract void print();
}

class ImageFile implements Printable
{
	private String fileName;
	
	public ImageFile(String fileName)
	{
	    this.fileName = fileName+".jpg";
	}
	
	public void print()
	{
		System.out.println("Image file "+fileName);
	}
}

class WordFile implements Printable
{
	private String fileName;
	
	public WordFile(String fileName)
	{
	    this.fileName = fileName+".docx";
	}
	
	public void print()
	{
		System.out.println("Word File "+fileName);
	}
}

class Printer 
{
	public void printFile(Printable file)
	{
	    System.out.println("-----------------------");
		System.out.println("Printer Is Printing");
		file.print();
		System.out.println("-----------------------");
	}
	
	public static void main(String[] args) 
	{
	   ImageFile img = new ImageFile("Flower");
	   WordFile  doc = new WordFile("Resume");
	   Printer ptr = new Printer();
	   ptr.printFile(img);
	   ptr.printFile(doc);
	}
}
