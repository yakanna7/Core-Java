// Program to compare strings
package packages.java.lang.strings;

 public class String2{
	public static void main(String args[])
	{
		String s1 = "Fratello";
		String s2 = "Fratello";
		String s3 = new String("Fratello");
		String s4="FrateLLO";
		
		System.out.println("s1 == s2 ? "+(s1==s2)); // true
		System.out.println("s1 == s3 ? "+(s1==s3)); //false
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//true
		
		System.out.println(s1.equals(s4));//false
		System.out.println(s1.equalsIgnoreCase(s4)); // true
		
		System.out.println(s1.compareTo(s2));//Both equal 0
		System.out.println(s1.compareTo(s4));// >0
		System.out.println(s4.compareTo(s1));// <0
		System.out.println(s1.compareToIgnoreCase(s4));//0
		
	}
}