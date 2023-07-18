package  packages.java.lang;

class BoxingCompare {

	  public static void main(String args[])
	  {  
	        Integer i=new Integer(50);  
	        if(i<100)//unboxing internally 
	           System.out.println(i);
	          
			Integer a = new Integer(129);
			Integer b = new Integer(129);
			System.out.println(a == b); // compares references & returns false
			System.out.println( a.equals(b)); //  returns true
			System.out.println(a == 129); // a will be unboxed & returns true
	  }   
}
