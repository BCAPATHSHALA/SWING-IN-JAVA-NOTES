// Program: 31 Layout Manager:01 NullLayout
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.io.*;

public class GUI31
{
	public static void main(String[] args) {
		JFrame jf=new JFrame("GUI31 Program");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setResizable(false);
		jf.setSize(650,400);
		jf.setLocationRelativeTo(null);

		Container c=jf.getContentPane();
		c.setLayout(null);

		JButton button1=new JButton("BUTTON1");
		JButton button2=new JButton("BUTTON2");
		JButton button3=new JButton("BUTTON3");
		JButton button4=new JButton("BUTTON4");
		JButton button5=new JButton("BUTTON5");

		c.add(button1);
		c.add(button2);
		c.add(button3);
		c.add(button4);
		c.add(button5);

		button1.setBounds(20,20,100,25);
		button2.setBounds(220,20,100,25);
		button3.setBounds(420,20,100,25);
		button4.setBounds(20,150,100,25);
		button5.setBounds(220,150,100,25);

		button1.setForeground(Color.WHITE);
		button1.setBackground(Color.RED);

		Cursor cur=new Cursor(Cursor.HAND_CURSOR);
		button1.setCursor(cur);


		jf.setVisible(true);
	}
}

 