// Program: 27 MouseMotionListner that support every component
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


class MyFrame extends JFrame implements MouseMotionListener
{
	private Container c;
	private JTextArea textArea;
	private JLabel label1;

	public MyFrame()
	{
		c=this.getContentPane();
		c.setLayout(null);

		textArea=new JTextArea("");
		c.add(textArea);
		textArea.setBounds(250,20,300,300);
		textArea.setBackground(Color.GREEN);

		label1=new JLabel("Mouse Event");
		c.add(label1);
		label1.setBounds(100,50,200,25);

		label1.addMouseMotionListener(this);

	}

	@Override
	public void mouseMoved(MouseEvent e)
	{
		textArea.setText(textArea.getText()+"\n"+"Mouse is Moved ");
	}
	@Override
	public void mouseDragged(MouseEvent e)
	{
		textArea.setText(textArea.getText()+"\n"+"Mouse is Dreagged ");
	}
}


class GUI27
{
	public static void main(String[] args) 
	{
		MyFrame jf=new MyFrame();
		jf.setTitle("GUI27 PROGRAM");
		jf.setSize(650,400);
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);		
		jf.setVisible(true);
	}
		
}