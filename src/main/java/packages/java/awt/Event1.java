package packages.java.awt;

import java.awt.*;
import java.awt.event.*;

class Event1 extends Frame implements ActionListener {

	TextField tf;

	Event1(String title) {

		super(title);
		tf = new TextField();
		tf.setBounds(60, 50, 170, 20);

		Button b = new Button("Click");
		b.setBounds(100, 120, 80, 30);

		b.addActionListener(this);

		add(b);
		add(tf);

		setSize(300, 300);
		setLayout(null);
		setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		tf.setText("Welcome");
	}

	public static void main(String args[]) {
		new Event1("Event");
	}

}
