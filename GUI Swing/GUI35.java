// Program: 35 Layout Manager:05 GridBagLayout
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.io.*;


class MyFrame extends JFrame
{	
	private Container c;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	
	public MyFrame()
	{
		c=this.getContentPane();
		GridBagLayout gb=new GridBagLayout();
		c.setLayout(gb);

		button1=new JButton("BUTTON1");
		button2=new JButton("BUTTON2");
		button3=new JButton("BUTTON3");
		button4=new JButton("BUTTON4");
		button5=new JButton("BUTTON5");

		// How to add component at specified position in layout
		//STEP 01:
		GridBagConstraints gbc=new GridBagConstraints();
		//STEP 02:
		gbc.fill=GridBagConstraints.HORIZONTAL; // request for increasing or decreasing 
												// the components size when window maximize or minimize
		gbc.weightx=0.5; // requests for extra available space horizontally
		gbc.gridx=0;
		gbc.gridy=0;
		c.add(button1,gbc);

		gbc.gridx=1;
		gbc.gridy=0;
		c.add(button2,gbc);

		gbc.gridx=2;
		gbc.gridy=0;
		c.add(button3,gbc);

		gbc.gridwidth=3;// button4 take size equal to 3 grid button with column
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.ipady=40; // button4's size is increased vertically
		c.add(button4,gbc);

		gbc.gridwidth=2;
		gbc.ipady=0;
		gbc.gridx=1;
		gbc.gridy=2;
		gbc.anchor=GridBagConstraints.PAGE_END;
		gbc.weighty=1;
		c.add(button5,gbc);

		pack(); // How to remove remaining space in layout
		
	}
}


public class GUI35
{
	public static void main(String[] args) {
		MyFrame jf=new MyFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("GUI35 PROGRAM");
		jf.setSize(650,400);
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
	}
}

 