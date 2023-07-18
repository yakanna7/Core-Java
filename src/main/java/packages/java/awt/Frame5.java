package packages.java.awt;

import java.awt.*;

class Frame5 extends Frame{
	
	Frame5(String title)
	{
		super(title);
		Label l1=new Label("Hobbies");
		Label l2=new Label("Age");
		Label l3=new Label("Languages known");
		
		TextField t=new TextField();
	
		Checkbox cb1=new Checkbox("Singing");
		Checkbox cb2=new Checkbox("Dancing");
		
		Choice ch=new Choice();
		ch.add("20");
		ch.add("21");
		ch.add("22");
		ch.add("23");
		ch.add("24");
		
		List l=new List(2,true);
		l.add("Telugu");
		l.add("English");
		l.add("Hindi");
		l.add("Tamil");
		
		setLayout(new GridLayout(3,3));
		add(l1);
		add(cb1);
		add(cb2);
		add(l2);
		add(t);
		add(ch);
		add(l3);
		add(l);
		setSize(400,250);
		setVisible(true);		
	}
	public static void main(String args[])
	{
		new Frame5("Component");
	}
}
