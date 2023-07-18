package packages.javax.swing;

import java.awt.event.*;
import javax.swing.*;
import java.io.*;

class Notepad extends JFrame implements ActionListener {

	JMenuBar mb;
	JMenu file, edit, help;
	JMenuItem open, cut, copy, paste, selectAll;
	JTextArea ta;

	Notepad(String title) {

		super(title);

		open = new JMenuItem("Open File");

		cut = new JMenuItem("cut");
		copy = new JMenuItem("copy");
		paste = new JMenuItem("paste");
		selectAll = new JMenuItem("selectAll");

		open.addActionListener(this);
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		selectAll.addActionListener(this);

		mb = new JMenuBar();
		mb.setBounds(5, 5, 400, 40);

		file = new JMenu("File");
		edit = new JMenu("Edit");
		help = new JMenu("Help");

		file.add(open);
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.add(selectAll);

		mb.add(file);
		mb.add(edit);
		mb.add(help);

		ta = new JTextArea();

		ta.setBounds(10, 50, 460, 460);

		add(mb);
		add(ta);

		setLayout(null);
		setSize(500, 500);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == open) {
			openFile();
		}
		if (e.getSource() == cut)
			ta.cut();
		if (e.getSource() == paste)
			ta.paste();
		if (e.getSource() == copy)
			ta.copy();
		if (e.getSource() == selectAll)
			ta.selectAll();

	}

	void openFile() {
		JFileChooser fc = new JFileChooser();
		int i = fc.showOpenDialog(this);

		if (i == JFileChooser.APPROVE_OPTION) {
			File f = fc.getSelectedFile();
			String filepath = f.getPath();
			displayContent(filepath);
		}
	}

	void displayContent(String fpath) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(fpath));
			String line;
			StringBuffer text = new StringBuffer();

			while ((line = br.readLine()) != null) {
				text.append(line + "\n");
			}

			ta.setText(text.toString());
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Notepad("Notepad");
	}
}
