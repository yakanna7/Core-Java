package packages.math;

import java.math.BigInteger;

public class BigInt1 {
	
	public static void main(String[] args) {

        // create 2 BigInteger objects
	BigInteger bi1, bi2;

	// create 2 Integer objects
	Integer i1, i2;

	// assign values to bi1, bi2
	bi1 = new BigInteger("123");
	bi2 = new BigInteger("988846");

	// assign the integer values of bi1, bi2 to i1, i2
	i1 = bi1.intValue();
	i2 = bi2.intValue();

	String str1 = "Integer value of " +bi1+ " is " +i1;
	String str2 = "Integer value of " +bi2+ " is " +i2;

	// print i1, i2 values
	System.out.println( str1 );
	System.out.println( str2 );
    }


}
