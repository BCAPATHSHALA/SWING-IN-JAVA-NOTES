// PROGRAM:74 ADVANCED TOPIC:30 LookAndFeel

package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.lang.*;
import javax.swing.event.*;
import javax.swing.tree.*;
import java.io.File;
import javax.swing.filechooser.FileNameExtensionFilter;

public class GUI74
{
	JFileChooser fileChooser;
	public GUI74()
	{
		JFrame frame=new JFrame("GUI74 PROGRAM");
		frame.setSize(700,450);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel=new JPanel();
		frame.add(panel);

		JButton open=new JButton("Open");
		JButton save=new JButton("Save");
		JTextField t1=new JTextField();
		t1.setColumns(20);
		panel.add(open);
		panel.add(save);
		panel.add(t1);

		frame.setVisible(true);
		frame.revalidate();
	}

	public static void main(String[] args) throws Exception
	{
		// String str="javax.swing.plaf.nimbus.NimbusLookAndFeel";
		// String str="com.sun.java.swing.plaf.motif.MotifLookAndFeel";
		// String str="com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
		String str="com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel";

		UIManager.setLookAndFeel(str);

		new GUI74();
	} 
}