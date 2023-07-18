// ArrayList with user defined objects
package packages.java.util.listinterface;

import java.util.*;

class Person
{
	private String name;
	private String gender;
	private int age;
	private String address;
	
	public Person(String name, String gender, int age, String address)
	{
		this.name    = name;
		this.gender  = gender;
		this.age     = age;
		this.address = address;	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}

class ArrayList9
{
	public static void main(String args[])
	{
		ArrayList<Person> personsList = new ArrayList<Person>();
		
		Person p = new Person("Yakanna","Male",28,"Ramavaram");
		personsList.add(p);
		personsList.add(new Person("Swapna","Female",24,"Dharmavaram"));
		personsList.add(new Person("Sateesh","Male",25,"Hyderabad"));
		personsList.add(new Person("Sahitya","Female",25,"Hyderabad"));
		
		for(int i =0;i<personsList.size();i++)
		{
			Person p1 = personsList.get(i);
			System.out.println("Person "+(i+1)+" details are");
			System.out.println("Name is "+p1.getName());
			System.out.println("Gender is "+p1.getGender());
			System.out.println("Age is "+p1.getAge()+" years");
			System.out.println("Address is "+p1.getAddress());
			System.out.println();
		}
	}
}













//How to reverse ArrayList content?
/*import java.util.ArrayList;

import java.util.Collections;
 
public class ArrayList9 {
 
    public static void main(String a[]){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Cric");
        list.add("Play");
        list.add("Watch");
        list.add("Glass");
        Collections.reverse(list);
        System.out.println("Results after reverse operation:");
        
        for(String str: list){
            System.out.println(str);
        }
    }
}*/





