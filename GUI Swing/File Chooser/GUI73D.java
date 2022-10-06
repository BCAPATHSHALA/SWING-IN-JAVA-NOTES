// PROGRAM:73D ADVANCED TOPIC:29 JFileChooser Part:05

package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.lang.*;
import javax.swing.event.*;
import javax.swing.tree.*;
import java.io.File;

public class GUI73D implements ActionListener
{
	JFileChooser fileChooser;
	public GUI73D()
	{
		JFrame frame=new JFrame("GUI73D PROGRAM");
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
		
		/* How to configure FileChooser to select directory only
		fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		*/

		// How to allow the multiple file selection:01
		fileChooser.setMultiSelectionEnabled(true);
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
				// How to allow the multiple file selection:02
				File files[]=fileChooser.getSelectedFiles();
				for (int i=0;i<files.length;i++) 
				{
				 	File file=files[i];
				 	System.out.println("\nselected file are: "+file.getAbsolutePath());
				} 
				
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
		new GUI73D();
	} 
}