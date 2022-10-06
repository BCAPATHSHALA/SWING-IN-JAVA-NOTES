// PROGRAM:73A ADVANCED TOPIC:29 JFileChooser Part:02
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.lang.*;
import javax.swing.event.*;
import javax.swing.tree.*;

public class GUI73A implements ActionListener
{
	JFileChooser fileChooser;
	public GUI73A()
	{
		JFrame frame=new JFrame("GUI73A PROGRAM");
		frame.setSize(700,450);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel=new JPanel();
		frame.add(panel);

		JButton open=new JButton("Open");
		JButton save=new JButton("Save");
		panel.add(open);
		panel.add(save);

		frame.setVisible(true);
		frame.revalidate();

		open.addActionListener(this);

		// How to set the initial path of FileChooser
		fileChooser=new JFileChooser("E:\\JAVA PRACTICE\\JAVA PRACTICE\\GUI Swing\\File Chooser");

	}

	// How to Create a simple Dialog using FileChooser
	@Override
	public void actionPerformed(ActionEvent e)
	{
		int selectedOption=fileChooser.showDialog(null,"Open My File");

		if(selectedOption==JFileChooser.APPROVE_OPTION)
		{
			System.out.println("selected file is: "+fileChooser.getSelectedFile().getAbsolutePath());
		}
		else
		{
			System.out.println("user cancel the dialog");
		}

	}

	public static void main(String[] args) 
	{
		new GUI73A();
	} 
}