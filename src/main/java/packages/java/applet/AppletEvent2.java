package packages.java.applet;

import java.applet.*;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.*;

public class AppletEvent2 extends Applet implements ActionListener {

	JButton b;
	JLabel l1, l2, l3;
	JTextField tf1, tf2, tf3;

	public void init() {

		l1 = new JLabel("Enter First Number");
		l2 = new JLabel("Enter Second Numer");
		l3 = new JLabel("Sum Is ");
		tf1 = new JTextField();
		tf2 = new JTextField();
		tf3 = new JTextField();

		b = new JButton("Add");

		setLayout(new GridLayout(4, 2));
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(l3);
		add(tf3);
		add(b);
		b.addActionListener(this);
		setSize(250, 250);
		setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {

		try {
			double x = Double.parseDouble(tf1.getText());
			double y = Double.parseDouble(tf2.getText());
			double sum = x + y;
			tf3.setText(String.valueOf(sum));
		} catch (Exception exp) {
			tf3.setText("Please enter digits only");
		}
	}
}
