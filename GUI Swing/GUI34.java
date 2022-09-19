// Program: 34 Layout Manager:04 GridLayout
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.io.*;


class MyFrame extends JFrame
{	
	Container c;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	
	public MyFrame()
	{
		c=this.getContentPane();
		// How to divide the Grid Layout in rows and columns GridLayout(rows,columns)
		//WAY01: How to set gap bw components GridLayout(x,y)
		//How to set both gap and rows, colmuns GridLayout(rows,columns,x,y)
		GridLayout g=new GridLayout(4,2,20,10);
		c.setLayout(g);

		//WAY01: How to set gap bw components setVgap(y) and setHgap(x)
		g.setVgap(10);
		g.setHgap(20);

		button1=new JButton("BUTTON1");
		button2=new JButton("BUTTON2");
		button3=new JButton("BUTTON3");
		button4=new JButton("BUTTON4");
		button5=new JButton("BUTTON5");

		c.add(button1); // index: 03
		c.add(button2); // index: 04
		c.add(button3); // index: 05
		// How to set components indexing c.add(button4,0)
		c.add(button4,0); // index: 02
		c.add(button5,0); // index: 01

	}
}


public class GUI34
{
	public static void main(String[] args) {
		MyFrame jf=new MyFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("GUI34 PROGRAM");
		jf.setSize(650,400);
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
	}
}

 