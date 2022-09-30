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
	JDialog dialog;
	public GUI58()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GUI58 PROGRAM");
		setSize(650,400);
		setLocationRelativeTo(null);
		setResizable(false);

		JPanel panel=new JPanel();
		add(panel);

		JButton button1=new JButton("Click1");
		panel.add(button1);

		button1.addActionListener(this);

		setVisible(true);
		validate();
	}
//How to create a simple JDialog Box
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Click1"))
		{
			showFirstDialog();
		}
		else
		{
			showSecondDialog();
		}

	}

	private void showFirstDialog()
	{
		dialog=new JDialog(this,"JDialog1");
		dialog.setSize(200,300);
		 
		JPanel panel1=new JPanel();
		dialog.add(panel1);

		JButton button2=new JButton("Click2");
		panel1.add(button2);

		button2.addActionListener(this);

		dialog.setLocationRelativeTo(null);
		dialog.setVisible(true);
	}

	private void showSecondDialog()
	{
		JDialog dialog2=new JDialog(dialog,"JDialog2");
		dialog2.setSize(200,300);
		dialog2.setLocationRelativeTo(null);
		dialog2.add(new JLabel("Dialog2"));
		dialog2.setVisible(true);
	}
	

	public static void main(String[] args) 
	{
		new GUI58();
	}
} 