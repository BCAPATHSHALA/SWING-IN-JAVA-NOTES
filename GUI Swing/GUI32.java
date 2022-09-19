// Program: 32 Layout Manager:02 BorderLayout
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.io.*;

public class GUI32
{
	public static void main(String[] args) {
		JFrame jf=new JFrame("GUI32 Program");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(650,400);
		jf.setLocationRelativeTo(null);

		Container c=jf.getContentPane();
		// Layout is BorderLayout implicitly

		// Set layout explicitly and 
		// WAY01: to set gap bw components BorderLayout(x,y)
		BorderLayout borderLayout=new BorderLayout(10,5);
		c.setLayout(borderLayout);
		// WAY02: to set gap bw components
		borderLayout.setHgap(10);
		borderLayout.setVgap(5) ;

		JButton button1=new JButton("PAGE START");
		JButton button2=new JButton("PAGE END");
		JButton button3=new JButton("LINE START");
		JButton button4=new JButton("CENTER");
		JButton button5=new JButton("LINE END"); 

		// WAY01: add components in BorderLayout
		// c.add(button1, BorderLayout.PAGE_START);
		// c.add(button2, BorderLayout.PAGE_END);
		// c.add(button3, BorderLayout.LINE_START);
		// c.add(button4, BorderLayout.CENTER);
		// c.add(button5, BorderLayout.LINE_END);


		// WAY02: add components in BorderLayout
		c.add(button1, BorderLayout.NORTH);
		c.add(button2, BorderLayout.SOUTH);
		c.add(button3, BorderLayout.WEST);
		c.add(button4, BorderLayout.CENTER);
		c.add(button5, BorderLayout.EAST);

		button1.setForeground(Color.WHITE);
		button1.setBackground(Color.RED);

		Cursor cur=new Cursor(Cursor.HAND_CURSOR);
		button1.setCursor(cur);

		
		jf.setVisible(true);
	}
}

 