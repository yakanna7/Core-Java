/*Below example shows no of token count after 
breaking the string by delimiter. You can get the
count by using countTokens() method.*/
package packages.java.util;

import java.util.StringTokenizer;

public class StringTokenizer3 {
	
	 public static void main(String a[]){
	        String msg = "This program gives sample code for String Tokenizer";
	        StringTokenizer st = new StringTokenizer(msg," ");
	        System.out.println("Count: "+st.countTokens());
	   String A[]=new String[st.countTokens()];
	   int i=0;
	   while(st.hasMoreTokens())
	   {
		   A[i]=st.nextToken();
		   i++;
	   }
	   for(String v:A)
	   {
		   System.out.println(v);
	   }
	 }
	}


