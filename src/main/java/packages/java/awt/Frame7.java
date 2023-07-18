package packages.java.awt;

import java.awt.*;

class Frame7 extends Frame {
	
	Frame7(String title) {
		
		super(title);
		Label l = new Label("Gender");
		CheckboxGroup cb = new CheckboxGroup();
		Checkbox c1 = new Checkbox("Male", cb, true);
		Checkbox c2 = new Checkbox("FeMale", cb, false);
		setLayout(new FlowLayout());
		add(l);
		add(c1);
		add(c2);
		setSize(200, 200);
		setVisible(true);
	}

	public static void main(String args[]) {
		new Frame7("Radio Button");
	}
}
