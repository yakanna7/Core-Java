package packages.java.awt;

import java.awt.*;
import java.awt.event.*;

class Event2 extends Frame implements ActionListener {

	Label l1, l2, l3;
	TextField t1, t2, t3;
	Button b1;

	Event2(String title) {
		super(title);
		l1 = new Label("Enter first number:");
		l2 = new Label("Enter Second number:");
		l3 = new Label("result:");
		t1 = new TextField(10);
		t2 = new TextField(10);
		t3 = new TextField(10);
		b1 = new Button("Sum");
		b1.addActionListener(this);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		setLayout(new GridLayout(4, 2));
		setResizable(false);
		setSize(300, 200);
		setLocation(400, 300);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		String s1, s2;
		s1 = t1.getText();
		s2 = t2.getText();
		int s = 0;
		try {
			s = Integer.parseInt(s1) + Integer.parseInt(s2);
		} catch (Exception e) {
			t3.setText("Please enter digits only");
		}
		if (s != 0)
			t3.setText(String.valueOf(s ));
	}

	public static void main(String args[]) {
		new Event2("Addition");
	}
}
