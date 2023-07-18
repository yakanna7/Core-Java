//Java Example to implement serialization
package packages.java.io;

import java.io.*;

class SerializationTest
{
	public static void main(String[] args)
	{
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d://Employee"))) 
		{
			Employee emp = new Employee(1271, "Shiva", 20000.0f);
			oos.writeObject(emp);
			System.out.println("Object Serialized Successfully");
		} 
		catch (IOException ie)
		{
			ie.printStackTrace(); 
		}
	}
}
