package packages.java.awt;

import java.awt.Frame;

class Frame2 extends Frame
{
	Frame2(String title)
	{
		 super(title);
		 setSize(400, 200);
		 setVisible(true);
	}
	
	public static void main(String args[]) 
	{
		Frame2 f = new Frame2("Fratello Inotech");
		
	}
}
