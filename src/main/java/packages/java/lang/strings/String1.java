// Different ways of creating string
package packages.java.lang.strings;

class String1 {
	public static void main(String args[])
	{
		String s="Fratello";
		String s1=new String("Innotech");
		char arr[]={'K','P','H','B'};
		String s2=new String(arr);
		String s3=new String(arr,1,2);//(position,number of chars)
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
