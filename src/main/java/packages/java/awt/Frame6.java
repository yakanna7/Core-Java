package packages.java.awt;
import java.awt.*;

class Frame6 extends Frame
{
   Frame6(String title)
    {
       super(title);
       
       TextArea ta=new TextArea("Enter your text",20,50);//new TextArea(10,10)
       
       setLayout(new FlowLayout());
       add(ta);
      
       setSize(500,450);
       setVisible(true);
       
     }
     public static void main(String args[])
     {
       new Frame6("Text Area");
     }
}
