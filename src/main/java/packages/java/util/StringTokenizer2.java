/* Below example shows how to break a string based 
on multiple delimiters. Each character in 
the constructors delimiter field acts as one 
delimiter.*/
package packages.java.util;
import java.util.StringTokenizer;

public class StringTokenizer2 {
	
	
	    public static void main(String a[]){
	        String msg = "http://10.123.43.67:80/";
	        StringTokenizer st = new StringTokenizer(msg,":/.");
	        while(st.hasMoreTokens()){
	            System.out.println(st.nextToken());
	        }
	        
	        String exp="5*2/3-7/3*2+1";
	        StringTokenizer st1 = new StringTokenizer(exp,"+-*/",true);
	        while(st1.hasMoreTokens()){
	            System.out.println(st1.nextToken());
	      }
	    }        

}
