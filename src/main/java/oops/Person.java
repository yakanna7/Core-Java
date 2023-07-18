//Java program to implement Person class & read and display person details
package oops;
import java.util.Scanner;

class Person
{
    String name;
    String gender;
    int age;
    String address;

    public static void main(String args[])
    { 
        Person p = new Person();
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter person  name");
        p.name = s.next();
        System.out.println("Enter gender");
        p.gender = s.next(); ;
        System.out.println("Enter Age");
        p.age = s.nextInt();
        System.out.println("Enter address");
        p.address = s.next(); 

        System.out.println("Name is " + p.name);
        System.out.println("Gender is " + p.gender);
        System.out.println("Age is " + p.age);
        System.out.println("Address is " + p.address);
    }
}

