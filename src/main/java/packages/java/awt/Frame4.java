package packages.java.awt;
import java.awt.*;

class Frame4 extends Frame{
	
	  Frame4(String title)
	  {
		  super(title);
		  
		  Label l1=new Label("Enter First  Number");
		  Label l2=new Label("Enter Second Number");
		  Label l3=new Label("Result");
		  
		  TextField t1=new TextField(10);
		  TextField t2=new TextField(10);
		  TextField t3=new TextField(10);
		  
		  Button b=new Button("Sum");
		  setLayout(new GridLayout(4,2));
		  add(l1);
		  add(t1);
		  add(l2);
		  add(t2);
		  add(l3);
		  add(t3);
		  add(b);
		  setSize(300,200);
		  setLocation(400,300);
		  
		  setVisible(true);
	  }
	  public static void main(String args[])
	  {
		 new Frame4("Addition");	  
	  }
}
