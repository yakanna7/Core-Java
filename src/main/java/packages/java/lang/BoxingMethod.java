package  packages.java.lang;

class BoxingMethod {

	 static void show(Integer val)
	 {
	       System.out.println("Integer object value is " +val );
	 }
	 
	 static void display(int num)
	  {
	       System.out.println("Premitive int value is " +num );
	  }
	
	  public static void main(String args[])
	   {
	       int i=10;
	       Integer val = new Integer(20);
	       show(i); // automatic boxing is applied
	       show(val);
	       display(i);
	       display(val); // automatic unboxing is applied
	  }
}
