package packages.java.lang.strings;

class StringBuffer1 {
	
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer("Fratello Innotech");
		System.out.println(sb);
		StringBuffer sb1=new StringBuffer();
		System.out.println(sb1.capacity());
		StringBuffer sb2=new StringBuffer(30);
		System.out.println(sb2.capacity());
		sb1.append("Fratello");
		System.out.println(sb1);
		sb1.append("Innotech");
		System.out.println(sb1);
		sb2.insert(0, "Fratello");
		System.out.println(sb2);
		sb2.insert(4, "Innotech");
		System.out.println(sb2);		
	}

}
