package java8.lambda;

interface MathOperation {
    int operation(int a, int b);
 }
	
 interface GreetingService {
    void sayMessage(String message);
 }
 
public class LambdaTest1
{
	//with type declaration
    MathOperation addition = (int a, int b) -> a + b;
		
    //with out type declaration
    MathOperation subtraction = (a, b) -> a - b;
		
    //with return statement along with curly braces
    MathOperation multiplication = (int a, int b) -> { return a * b; };
		
    //without return statement and without curly braces
    MathOperation division = (int a, int b) -> a / b;
		
	 public static void main(String args[])
	 {
		  int a=20,b=10;
		  
		  LambdaTest1 tester = new LambdaTest1();
			
	      System.out.println("Addition is "+tester.addition.operation(a, b));
	      System.out.println("Subtraction is "+tester.subtraction.operation(a, b));
	      System.out.println("Multiplication is "+tester.multiplication.operation(a, b));
	      System.out.println("Division is "+tester.division.operation(a, b));
	     	
	      //with parenthesis
	      GreetingService greetService1 =( message) ->
	      System.out.println("Hello " + message);
			
	      //without parenthesis
	      GreetingService greetService2 = message ->
	      System.out.println("Hello " + message);
			
	      greetService1.sayMessage("Swapna");
	      greetService2.sayMessage("Ammu");
	   }
}












