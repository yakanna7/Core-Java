package packages.javax.swing;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.*;

class JFrame2 extends JFrame implements ActionListener {

	JLabel l1, l2, l3;
	JTextField t1, t2, t3;
	JButton b1;

	JFrame2(String title) {
		super(title);
		l1 = new JLabel("Enter first number:");
		t1 = new JTextField(10);
		l2 = new JLabel("Enter Second number:");
		t2 = new JTextField(10);
		l3 = new JLabel("result:");
		t3 = new JTextField(10);
		b1 = new JButton("Sum");
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
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent ae) {

		String s1 = t1.getText();
		String s2 = t2.getText();

		try {
			double s = Double.parseDouble(s1) + Double.parseDouble(s2);
			t3.setText(String.valueOf(s));
		} catch (Exception e) {
			t3.setText("Please enter digits only");
		}

	}

	public static void main(String args[]) {
		new JFrame2("Addition");
	}
}
