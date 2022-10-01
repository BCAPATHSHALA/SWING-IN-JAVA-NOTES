// PROGRAM:66 ADVANCED TOPIC:22 JRootPane
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.lang.*;
import javax.swing.event.*;

public class GUI66 extends JFrame
{
	public GUI66()
	{
		setTitle("GUI66 PROGRAM");
		setSize(650,400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout());

		JRootPane rootPane=this.getRootPane();

		JButton button1=new JButton("BUTTON1");
		JMenuBar menubar=new JMenuBar();
		menubar.setBackground(Color.RED);
		menubar.setForeground(Color.WHITE);
		JMenu file=new JMenu("File");
		file.setForeground(Color.WHITE);
		file.add("New");
		file.add("Open");
		file.add("Save");
		file.add("Close");
		menubar.add(file);

		// Add button and menu bar with the help of JRootPane
		rootPane.getContentPane().add(button1);
		rootPane.setJMenuBar(menubar);


		
		revalidate();
	}

	public static void main(String[] args) {
		new GUI66();
	}
}