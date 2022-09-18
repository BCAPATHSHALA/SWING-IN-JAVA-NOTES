// Program: 23 ItemListner on JCheckBox via clicking
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


class MyFrame extends JFrame implements ItemListener
{
	private Container c;
	private JCheckBox c1, c2, c3, c4;
	private JTextArea textArea;
	public MyFrame()
	{
		c=this.getContentPane();
		c.setLayout(null);

		c1=new JCheckBox("High School");
		c2=new JCheckBox("Intermediate School");
		c3=new JCheckBox("Under Graduation College");
		c4=new JCheckBox("Post Graduation College");

		c.add(c1);
		c.add(c2);
		c.add(c3);
		c.add(c4);

		c1.setBounds(10,20,220,20);
		c2.setBounds(10,40,220,20);
		c3.setBounds(10,60,220,20);
		c4.setBounds(10,80,220,20);

		textArea=new JTextArea("");
		c.add(textArea);
		textArea.setBounds(250,20,300,300);
		textArea.setBackground(Color.GREEN);

		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);



	}

	public void itemStateChanged(ItemEvent e)
	{
		if (c1.isSelected()) 
		{
			textArea.setText("High School\n");
		}
		if(c2.isSelected())
		{
			textArea.setText(textArea.getText()+"\n"+"Intermediate School\n");
		}
		if(c3.isSelected())
		{
			textArea.setText(textArea.getText()+"\n"+"Under Graduation College\n");
		}
		if(e.getSource()==c4)
		{
			textArea.setText(textArea.getText()+"\n"+"Post Graduation College\n");
		}


	}
}


class GUI23
{
	public static void main(String[] args) 
	{
		MyFrame jf=new MyFrame();
		jf.setTitle("GUI23 PROGRAM");
		jf.setSize(650,400);
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);		
		jf.setVisible(true);
	}
		
}