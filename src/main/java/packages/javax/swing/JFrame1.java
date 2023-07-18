package packages.javax.swing;

import javax.swing.*;

class JFrame1 extends JFrame {

	JFrame1(String title) {

		super(title);

		JLabel l1 = new JLabel("Enter Name");
		l1.setBounds(10, 20, 100, 40);

		JTextField t1 = new JTextField("Fratello");// new TextField(10)
		t1.setBounds(100, 20, 100, 30);

		JLabel l2 = new JLabel("Enter Course");
		l2.setBounds(10, 70, 100, 40);

		JTextField t2 = new JTextField(9);
		t2.setBounds(100, 70, 100, 30);

		JButton b = new JButton("Submit");
		b.setBounds(60, 120, 100, 30);
		setLayout(null);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b);

		setSize(250, 200);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		JFrame1 f = new JFrame1("My JFrame");
	}
}
