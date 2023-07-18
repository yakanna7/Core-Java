package packages.java.lang.strings;

class String4 {
	 public static void main(String args[])
	 {
		 String s1="Fratello Innotech";
		 
		 System.out.println(s1.startsWith("Fra"));//true
		 System.out.println(s1.startsWith("fra"));//false
		 System.out.println(s1.endsWith("tech")); //true
		 
		 System.out.println(s1.indexOf('t'));// 3
		 System.out.println(s1.indexOf('t',8));
		 
		 System.out.println(s1.indexOf("te"));
		 System.out.println(s1.indexOf("te",10));
		 System.out.println(s1.indexOf("abc"));// -1 if not found
		 
		 System.out.println(s1.lastIndexOf('t'));	
		 System.out.println(s1.lastIndexOf("te"));
		 
		 System.out.println(s1.contains("Inno"));
		 System.out.println(s1.contains("abc"));
		
	  }

}
