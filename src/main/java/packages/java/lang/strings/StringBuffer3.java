package packages.java.lang.strings;

class StringBuffer3 {

	 public static void main(String args[])
	 {
		 StringBuffer sb=new StringBuffer("Fratello Innotech");
		 System.out.println(sb.indexOf("te"));
		 System.out.println(sb.lastIndexOf("te"));
		 sb.replace(9, 13, "Hyd");
		 System.out.println(sb);
	     String s=sb.substring(10);
	     System.out.println(sb);
	     System.out.println(s);
	     s=sb.substring(5,8);
	     System.out.println(s);    
	 }
}
