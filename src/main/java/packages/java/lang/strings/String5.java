package packages.java.lang.strings;

class String5 {
	
	public static void main(String args[])
	{
		String s="Fratello Innotech";
		
		String s1=s.substring(10);
		System.out.println(s1);
		
		s1=s.substring(10,13);
		System.out.println(s1);
		
		String s2=s.replace('t', 'T');
		String s3=s.replace("tech", "TECH");
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		s1="   Fratello Innotech   ";
		System.out.println(s1);
		s1=s1.trim();
		System.out.println(s1);
	}
}
