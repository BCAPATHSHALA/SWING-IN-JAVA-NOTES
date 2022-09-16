// Program: 07 for JButton Event part-2
// How to handle multiple button events by implementing ActionListener in java Swing?
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class MyFrame extends JFrame implements ActionListener
{
	Container c;
	JButton button1=new JButton("GREEN");
	JButton button2=new JButton("YELLOW");
	JButton button3=new JButton("RED");

	MyFrame()
	{
		c=this.getContentPane();
		c.setLayout(null);

		// Button code start
		c.add(button1); 
		c.add(button2); 
		c.add(button3); 

		button1.setBounds(100,50,100,30);
		button1.setForeground(Color.WHITE); 
		button1.setBackground(Color.BLACK);

		button2.setBounds(250,50,100,30);
		button2.setForeground(Color.WHITE); 
		button2.setBackground(Color.BLACK); 

		button3.setBounds(400,50,100,30);
		button3.setForeground(Color.WHITE); 
		button3.setBackground(Color.BLACK); 

		Font font=new Font("Arial",Font.BOLD, 15);
		button1.setFont(font);
		button2.setFont(font);
		button3.setFont(font);

		Cursor cur=new Cursor(Cursor.HAND_CURSOR);
		button1.setCursor(cur);
		button2.setCursor(cur);
		button3.setCursor(cur);

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		// Button Code End
	}
	// override the actionPerformed() method
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==button1)
		{
			c.setBackground(Color.GREEN); 
		}
		else if(e.getSource()==button2)
		{
			c.setBackground(Color.YELLOW); 
		}
		else
		{
			c.setBackground(Color.RED); 
		}
	}
}


public class GUI7
{
	public static void main(String[] args) 
	{
		MyFrame jf=new MyFrame();
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(500,300,600,400);
		jf.setTitle("GUI6 PROGRAM");
		jf.setResizable(false);		
	}
}