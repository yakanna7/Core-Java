//Interface with default and static method example 
package oops.interfaces;

interface Vehicle
{
   default void print()
   {
      System.out.println("I am a vehicle!");
   }
   
   static void blowHorn()
   {
      System.out.println("Blowing horn!!!");
   }
}

interface FourWheeler 
{
    default void print()
    {
      System.out.println("I am a four wheeler!");
    }
}

class Car implements Vehicle, FourWheeler
{
   public void print()
   {
      Vehicle.super.print();
      FourWheeler.super.print();
      Vehicle.blowHorn();
      System.out.println("I am a car!");
     }
}

public class DefaultMethodTester 
{
	public static void main(String[] args)
	{		
	  Vehicle v = new Car();
      v.print();	
	}
}

