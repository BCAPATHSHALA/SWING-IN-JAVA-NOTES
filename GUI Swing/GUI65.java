// PROGRAM:65 ADVANCED TOPIC:21 JTextPane like as JEditorPane
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.lang.*;
import javax.swing.event.*;

public class GUI65 extends JFrame
{
	public GUI65()
	{
		setTitle("GUI65 PROGRAM");
		setSize(650,400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new GridLayout(1,2));

		JTextPane textPane=new JTextPane();
		textPane.setText("I love java and data structure and algorithms");

		this.getContentPane().add(textPane);
		revalidate();
	}

	public static void main(String[] args) {
		new GUI65();
	}
}