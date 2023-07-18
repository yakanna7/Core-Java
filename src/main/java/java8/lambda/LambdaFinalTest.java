package java8.lambda;

public class LambdaFinalTest
{
	final static String salutation = "Hello! ";
	   
	   public static void main(String args[])
	   {
	      GreetingService greetService1 = message -> 
	      {
	         System.out.println(salutation + message);
	      };
	      greetService1.sayMessage("Ammu");
	   }
	
	   //Declaring interface inside class
	   interface GreetingService
	   {
	      void sayMessage(String message);
	   }
}
