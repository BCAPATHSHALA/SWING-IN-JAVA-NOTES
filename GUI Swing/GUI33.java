// Program: 33 Layout Manager:03 FlowLayout
// 01: Flow Layout is the default layout for JPanel
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

		//How to allign the components FlowLayout(FlowLayout.LEFT)
		//Way01: How to set gap bw components FlowLayout(x,y)
		//How to set both allign and gap FlowLayout(FlowLayout.LEFT, x,y)

		FlowLayout f=new FlowLayout(FlowLayout.LEFT,10,20);
		c.setLayout(f);


		button1=new JButton("BUTTON1");
		button2=new JButton("BUTTON2");
		button3=new JButton("BUTTON3");
		button4=new JButton("BUTTON4");
		button5=new JButton("BUTTON5 EXTRA TEXT");

		//02: Flow layout sets the component as it's preferred size
		c.add(button1);
		c.add(button2);
		c.add(button3);
		//How to indexing the components c.add(button4,2)
		c.add(button4,2);
		//03: Flow layout sets the width of the component according to content
		c.add(button5);

		//Way02: How to set gap bw components by using this method: setVGap() and setHgap()
		f.setVgap(20);
		f.setHgap(10);
	}
}


public class GUI33
{
	public static void main(String[] args) {
		MyFrame jf=new MyFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("GUI33 PROGRAM");
		jf.setSize(650,400);
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
	}
}

 