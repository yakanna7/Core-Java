package oops.interfaces;

import java.util.Scanner;

interface Storable {

	public abstract void read();
	public abstract void write();
}

interface Compressible {
	
	// by default public and abstract 
	void read(); 
	void compress();
	public abstract void decompress();
}

class TextFile implements Storable, Compressible {
	String fileName;

	public TextFile(String fileName) {
		this.fileName = fileName + ".txt";
	}

	public void read() {
		System.out.println("Reading Text From " + fileName + " File");
	}

	public void write() {
		System.out.println("Writing Text Into " + fileName + " File");
	}

	public void compress() {
		System.out.println("Compressing File " + fileName);
	}

	public void decompress() {
		System.out.println("Decompressing File " + fileName);
	}
}

class MultipleInheritanceTester {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter File Name");
		String name = s.next();
		TextFile file = new TextFile(name);
		file.write();
		file.read();
		file.compress();
		file.decompress();
	}
}
