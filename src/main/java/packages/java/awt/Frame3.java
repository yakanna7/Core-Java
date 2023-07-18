package packages.java.awt;

import java.awt.*;

class Frame3 extends Frame {

	Frame3(String title) {
		
		super(title);

		Label l1 = new Label("Enter Name");
		Label l2 = new Label("Enter Course");
		TextField t1 = new TextField("Fratello");// new TextField(10)
		TextField t2 = new TextField(9);

		setLayout(new FlowLayout());
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		setSize(250, 200);
		setVisible(true);
	}

	public static void main(String args[]) {
		Frame3 f = new Frame3("Lable & TextBox");
	}
}
