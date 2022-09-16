// Program: 09 for JButton Event part-4
// Event handling usning another class
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI9
{
	public static Container c;
	
	public static void main(String[] args) 
	{
		JFrame jf=new JFrame("GUI9 PROGRAM");
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(500,300,600,400);
		jf.setResizable(false);	

		c=jf.getContentPane();
		c.setLayout(null);


		//////////////////// Button code start
		JButton button1=new JButton("GREEN");
		c.add(button1); 
		button1.setBounds(100,50,100,30);

		JButton button2=new JButton("YELLOW");
		c.add(button2); 
		button2.setBounds(250,50,100,30);

		JButton button3=new JButton("RED");
		c.add(button3); 
		button3.setBounds(400,50,100,30);
		//////////////////// Button Code End

		button1.addActionListener(new GreenClass());
		button2.addActionListener(new YellowClass());
		button3.addActionListener(new RedClass());
		
	}	
}

class GreenClass implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		GUI9.c.setBackground(Color.GREEN);
	}
}

class YellowClass implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		GUI9.c.setBackground(Color.YELLOW);
	}
}

class RedClass implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		GUI9.c.setBackground(Color.RED);
	}
}