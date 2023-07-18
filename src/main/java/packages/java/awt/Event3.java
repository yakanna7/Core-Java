package packages.java.awt;

import java.awt.*;
import java.awt.event.*;

class Event3 extends Frame implements ActionListener {

	  TextField t1,t2,t3;
	  Button b;
	  Event3(String title)
	  {
		  super(title);
		  
		  t1=new TextField(15);
		  t2=new TextField(15);
		  t3=new TextField(15);
		  b=new Button("Color");
		  
		  b.addActionListener(this);
		  
		  setLayout(new FlowLayout());
		  
		  add(t1);
		  add(t2);
		  add(t3);
		  add(b);
		  
		  setSize(400,300);
		  setLocation(400,300);
		  setVisible(true);
	  }
	  
	public void actionPerformed(ActionEvent e) {
		
		int i=Integer.parseInt(t1.getText());
		int j=Integer.parseInt(t2.getText());
		int k=Integer.parseInt(t3.getText());
		Color c=new Color(i,j,k);
		setBackground(c);
	}
	
	public static void main(String args[])
	{
		new Event3("Color");
	}
}
