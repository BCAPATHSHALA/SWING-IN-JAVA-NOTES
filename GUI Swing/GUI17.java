// Program: 17 JMenuBar PROGRAM
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


class GUI17
{
	public static void main(String[] args) 
	{
		JFrame jf=new JFrame("GUI17 PROGRAM");
		jf.setSize(650,400);
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);

		Container c=jf.getContentPane();
		c.setLayout(null);
		// STEP:01 to create a manubar
		JMenuBar menubar=new JMenuBar();

		JMenu file=new JMenu("File");
		JMenu edit=new JMenu("Edit");
		JMenu setting=new JMenu("Setting");

		JMenuItem i1=new JMenuItem("New");
		JMenuItem i2=new JMenuItem("Open");
		JMenuItem i3=new JMenuItem("Save");

		JMenuItem i4=new JMenuItem("Undo");
		JMenuItem i5=new JMenuItem("Redo");

		JMenuItem i6=new JMenuItem("About");
		JMenuItem i7=new JMenuItem("Account");

		// STEP:02 add MenuItems to the related menu
		file.add(i1);
		file.add(i2);
		file.add(i3);

		edit.add(i4);
		edit.add(i5);

		setting.add(i6);
		setting.add(i7);

		// STEP:03 add Menus to the menubar
		menubar.add(file);
		menubar.add(edit);
		file.add(setting); // add submenu setting in file menu

		// STEP:04 add Menubar to the JFrame
		jf.setJMenuBar(menubar);





		jf.setVisible(true);
	}
		
}