//Java program to implement FileOutputStream
package packages.java.io;

import java.io.*;
import java.util.Scanner;

class FileOutputStreamTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter file name");
		String fileName = s.next(); // d:/myfile.txt;

		s.nextLine();
		System.out.println("Enter text to write into file");
		String text = s.nextLine();// +System.lineSeparator();
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(fileName, true);
			fos.write(text.getBytes());
			fos.flush();
		} catch (FileNotFoundException fnf) {
			System.out.println("Unable to create or open file");
		} catch (IOException ie) {
			System.out.println("Unable to write data into file");
		} finally {
			if (fos != null) {
				try {
					fos.close();
					s.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
