// PROGRAM:73B ADVANCED TOPIC:29 JFileChooser Part:03
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.lang.*;
import javax.swing.event.*;
import javax.swing.tree.*;

public class GUI73B implements ActionListener
{
	JFileChooser fileChooser;
	public GUI73B()
	{
		JFrame frame=new JFrame("GUI73B PROGRAM");
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
		save.addActionListener(this);

		// How to set the initial path of FileChooser
		fileChooser=new JFileChooser("E:\\JAVA PRACTICE\\JAVA PRACTICE\\GUI Swing\\File Chooser");

	}

	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		/* How to Create a simple Dialog using FileChooser
		int selectedOption=fileChooser.showDialog(null,"Open My File");
		*/

		
		if(e.getActionCommand().equalsIgnoreCase("Open"))
		{	
			//how to create open dialog
			int selectedOption=fileChooser.showOpenDialog(null);
			if(selectedOption==JFileChooser.APPROVE_OPTION)
			{
				System.out.println("selected file is: "+fileChooser.getSelectedFile().getAbsolutePath());
			}
			else
			{
				System.out.println("user cancel the open dialog");
			}
		}
		else
		{
			//how to create save dialog
			int selectedOption=fileChooser.showSaveDialog(null);
			if(selectedOption==JFileChooser.APPROVE_OPTION)
			{
				System.out.println("selected file is: "+fileChooser.getSelectedFile().getAbsolutePath());
			}
			else
			{
				System.out.println("user cancel the save dialog");
			}
		}

	}

	public static void main(String[] args) 
	{
		new GUI73B();
	} 
}