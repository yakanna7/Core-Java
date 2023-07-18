package  packages.java.lang;
import java.util.Scanner;
public class Player {
    int number = 0;
    static String player[]={"first","second","third"};
    static int count=-1;
    public void guess()
    {
    	count++;
    	System.out.println("Enter  "+player[count]+" player guessing number b/w 0 to 9");
    	Scanner s=new Scanner(System.in);
        number =s.nextInt();
        if(count==2)
         count=-1;
    }
}