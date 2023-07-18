package packages.java.lang.strings;

class String3 {
	public static void main(String args[])
	{
		String s1="Fratello";
		String s2="Innotech";
		String s3=s1.concat(s2);//s3=s1+s2
		System.out.println(s1);
		System.out.println(s3);
		System.out.println("Number of characters in s3 are "+s3.length());
		System.out.println(s1.charAt(5));
	}

}
