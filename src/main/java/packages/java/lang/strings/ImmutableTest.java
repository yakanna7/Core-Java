package packages.java.lang.strings;

class ImmutableTest 
{
	public static void main(String args[]) 
	{
		String s1 = "Sachin";
		System.out.println(s1.hashCode());// Prints address
		s1 = "Tendulkar";
		System.out.println(s1.hashCode());
	}
}
