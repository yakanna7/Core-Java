package packages.java.awt;

import java.awt.*;
import java.awt.event.*;

class TextListener1 extends Frame implements TextListener {
	
	TextField t1,t2;
	TextListener1()
	{
		
		t1=new TextField(10);
		t2=new TextField(10);
		t1.addTextListener(this);
		setLayout(new FlowLayout());
		add(t1);
		add(t2);
		setSize(300,200);
		setLocation(400,300);
		setVisible(true);
		
	}
	public void textValueChanged(TextEvent e) {
		t2.setText(t1.getText());
	  }
	public static void main(String args[])
	{
		new TextListener1();
	}	
}
