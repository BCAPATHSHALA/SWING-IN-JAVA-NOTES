// Program: 08 for JButton Event part-3 
// How to implement ActionListener using anonymous inner class in java Swing?
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI8
{
	public static void main(String[] args) 
	{
		JFrame jf=new JFrame("GUI8 PROGRAM");
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(500,300,600,400);
		jf.setResizable(false);	

		Container c=jf.getContentPane();
		c.setLayout(null);


		//////////////////// Button code start
		JButton button1=new JButton("GREEN");
		c.add(button1); 
		button1.setBounds(100,50,100,30);
		//////////////////// Button Code End


		// passing Anonymous inner class object (new ActionListener(){};) as an argumets
		button1.addActionListener(new ActionListener()
			{
				// override the actionPerformed() method
				public void actionPerformed(ActionEvent e)
				{
					c.setBackground(Color.GREEN);
				}			
			});
		
	}	
}