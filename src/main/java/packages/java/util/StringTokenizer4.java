/*Below example shows how to make delimiter characters
 also be part of tokens. During creating 
 string tokenizer object, in the constructor field, 
 pass boolean parameter value as true.
 */
package packages.java.util;

import java.util.StringTokenizer;

public class StringTokenizer4 {
	
	public static void main(String a[]){
        String msg = "http://10.123.43.67:80/";
        StringTokenizer st = new StringTokenizer(msg,"://.",true);
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }

}
