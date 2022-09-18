// Program: 28 FocusListner that support every component
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


class MyFrame extends JFrame implements FocusListener
{
	private Container c;
	private JTextArea textArea;
	private JTextField t1;

	public MyFrame()
	{
		c=this.getContentPane();
		c.setLayout(null);

		textArea=new JTextArea("");
		c.add(textArea);
		textArea.setBounds(250,20,300,300);
		textArea.setBackground(Color.GREEN);

		t1=new JTextField("Focus Event");
		c.add(t1);
		t1.setBounds(100,50,100,25);

		t1.addFocusListener(this);

	}

	@Override
	public void focusGained(FocusEvent e)
	{
		textArea.setText(textArea.getText()+"\n"+"Textbox Focus gained ");
	}
	@Override
	public void focusLost(FocusEvent e)
	{
		textArea.setText(textArea.getText()+"\n"+"Textbox Tocus moved ");
	}
}


class GUI28
{
	public static void main(String[] args) 
	{
		MyFrame jf=new MyFrame();
		jf.setTitle("GUI28 PROGRAM");
		jf.setSize(650,400);
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);		
		jf.setVisible(true);
	}
		
}