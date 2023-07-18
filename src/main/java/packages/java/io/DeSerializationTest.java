package packages.java.io;

import java.io.*;

class DeSerializationTest
{
	public static void main(String args[]) 
	{
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d://Employee")))
		{
			Employee emp = (Employee) ois.readObject();
			
			System.out.println("DeSerialized Object Content is");
			System.out.println("Employee Id is "+emp.getId());
			System.out.println("Employee Name is "+emp.getName());
			System.out.println("Employee Salary is "+emp.getSalary());
		} 
		catch(ClassNotFoundException cnf)
		{
			cnf.printStackTrace();
		}
		catch (IOException ie)
		{
			ie.printStackTrace();
		} 
	}
}
