package packages.javax.swing;

import java.awt.event.*;
import javax.swing.*;

class RadioButton extends JFrame implements ActionListener {

	JRadioButton rb1, rb2;
	JButton b;

	RadioButton(String title) {

		super(title);
		rb1 = new JRadioButton("Male");
		rb1.setBounds(100, 50, 100, 30);

		rb2 = new JRadioButton("Female");
		rb2.setBounds(100, 100, 100, 30);

		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);

		b = new JButton("click");
		b.setBounds(100, 150, 80, 30);
		b.addActionListener(this);

		add(rb1);
		add(rb2);
		add(b);

		setSize(300, 300);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		if (rb1.isSelected()) {
			JOptionPane.showMessageDialog(this, "You are male");
		}
		if (rb2.isSelected()) {
			JOptionPane.showMessageDialog(this, "You are female");
		}
	}

	public static void main(String args[]) {
		new RadioButton("Radio Button");
	}

}
