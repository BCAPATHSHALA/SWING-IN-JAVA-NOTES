// PROGRAM:58 ADVANCED TOPIC:16 JDialog is part of swing package and is used to create dialog boxes and also HEAVY WEIGHT COMPONENTS 
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.lang.*;
import javax.swing.event.*;

public class GUI58 extends JFrame implements ActionListener
{
	public GUI58()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GUI58 PROGRAM");
		setSize(650,400);
		setLocationRelativeTo(null);
		setResizable(false);

		JPanel panel=new JPanel();
		add(panel);

		JButton button1=new JButton("Click");
		panel.add(button1);

		button1.addActionListener(this);

		setVisible(true);
		validate();
	}
//How to create a simple JDialog Box
	@Override
	public void actionPerformed(ActionEvent e)
	{
		JDialog dialog=new JDialog(this,"JDialog1");
		dialog.setSize(200,300);
		dialog.add(new JLabel("This is a JDialog1"));
		dialog.setLocationRelativeTo(null);
		dialog.setVisible(true);
	}
	

	public static void main(String[] args) 
	{
		new GUI58();
	}
} 