// Program: 18 ActionListner on a button
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


class MyFrame extends JFrame implements ActionListener
{
	Container c;
	JButton button1, button2;
	JLabel label1;

	public MyFrame()
	{
		c=this.getContentPane();
		c.setLayout(null);

		button1=new JButton("Click");
		button2=new JButton("Reset");

		c.add(button1);
		c.add(button2);

		button1.setBounds(100,50,100,25);
		button2.setBounds(250,50,100,25);

		Cursor cur=new Cursor(HAND_CURSOR);
		button1.setCursor(cur);
		button2.setCursor(cur);

		label1=new JLabel("");
		c.add(label1);
		label1.setBounds(100,100,300,40);


		button1.addActionListener(this);
		button2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==button1)
		{
			String str=button1.getText();
			button1.setText(str.toUpperCase());
			label1.setText("ActionListner on a button");
		}
		else
		{
			String str1=button2.getText();
			button2.setText(str1.toUpperCase());
			label1.setText("");
		}
	}
}


class GUI18
{
	public static void main(String[] args) 
	{
		MyFrame jf=new MyFrame();
		jf.setTitle("GUI18 PROGRAM");
		jf.setSize(650,400);
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);		
		jf.setVisible(true);
	}
		
}