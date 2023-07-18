package packages.java.lang.strings;

class StringBuffer2 {

	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer("Fratello Innotech");
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.length());
		sb.reverse();
		sb.delete(0, 5);
		System.out.println(sb);
		String s="abc";
		s=s+sb;//possible
		System.out.println(s);
		String s1=sb.toString();
		System.out.println(s1);
		
	}
}
