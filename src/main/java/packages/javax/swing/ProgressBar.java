package packages.javax.swing;

import javax.swing.*;

class ProgressBar extends JFrame {

	JProgressBar jb;
	int i = 0, num = 0;

	ProgressBar(String title) {

		super(title);
		jb = new JProgressBar(0, 2000);
		jb.setBounds(40, 40, 200, 30);

		jb.setValue(0);
		jb.setStringPainted(true);

		add(jb);
		setSize(400, 400);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void iterate() {
		while (i <= 2000) {
			jb.setValue(i);
			i = i + 20;
			try {
				Thread.sleep(150);
			} catch (Exception e) {
			}
		}
	}

	public static void main(String[] args) {
		ProgressBar p = new ProgressBar("Progress Bar");
		p.setVisible(true);
		p.iterate();
	}
}
