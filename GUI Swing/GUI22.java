// Program: 22 ItemListner on JRadioButtons via clicking
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


class MyFrame extends JFrame implements ItemListener
{
	private Container c;
	private JTextArea textArea;
	private JRadioButton maleRadio, femaleRadio;

	public MyFrame()
	{
		c=this.getContentPane();
		c.setLayout(null);

		maleRadio=new JRadioButton("Male");
		femaleRadio=new JRadioButton("Female");
		c.add(maleRadio);
		c.add(femaleRadio);
		maleRadio.setBounds(10,10,100,35);
		femaleRadio.setBounds(110,10,100,35);
		maleRadio.setSelected(true);

		textArea=new JTextArea("");
		c.add(textArea);
		textArea.setBounds(250,10,200,100);	
		textArea.setBackground(Color.YELLOW);

		ButtonGroup gender=new ButtonGroup();
		gender.add(maleRadio);
		gender.add(femaleRadio);	
		

		maleRadio.addItemListener(this);
		femaleRadio.addItemListener(this);
	}

	public void itemStateChanged(ItemEvent e)
	{
		if(e.getSource()==maleRadio)
		{
			textArea.setText("Male");
		}
		else
		{
			textArea.setText("Female");
		}
	}
}


class GUI22
{
	public static void main(String[] args) 
	{
		MyFrame jf=new MyFrame();
		jf.setTitle("GUI22 PROGRAM");
		jf.setSize(650,400);
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);		
		jf.setVisible(true);
	}
		
}