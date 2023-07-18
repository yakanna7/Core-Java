// Static import of Math class methods.
package oops.statickeyword;

import static java.lang.Math.*;

class StaticImportTest
 {
    public static void main( String[] args )
	{
	  System.out.println( "sqrt( 900.0 ) = "+sqrt( 900.0 ));
	  System.out.println( "pow(2,5) = "+pow(2,5 ));
	  System.out.println( "E = "+ E );
      System.out.println( "PI = "+ PI );
	 } // end main
 } // end class 

