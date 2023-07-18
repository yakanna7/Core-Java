package oops.inheritance;

class ScintificCalculator extends Calculator{
	
	double sin(double x)
	{
	   return Math.sin(Math.toRadians(x));
	}
	
	double cos(double x)
	{
		 return Math.cos(Math.toRadians(x));
	}
	double tan(double x)
	{
		return Math.tan(Math.toRadians(x));
	}
    
	double cbrt(double x)
	{
		return Math.cbrt(x);
	}
	
	public static void main(String args[]){
	
		ScintificCalculator sc = new ScintificCalculator();
		System.out.println("Addition of 10,20 is "+sc.add(10,20));
		System.out.println("Subtraction of 20,6 is "+sc.subtract(20, 6));
		System.out.println("Square root of 15 is "+sc.sqrt(15));
		System.out.println("Cube root of 10 is "+sc.cbrt(10));
		System.out.println("Sin 30 is "+sc.sin(30));
	}
}
