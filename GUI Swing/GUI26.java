// Program: 26 MouseListner that support every component
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


class MyFrame extends JFrame implements MouseListener
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

		label1=new JLabel("MouseEvent");
		c.add(label1);
		label1.setBounds(100,50,200,25);

		label1.addMouseListener(this);

	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
		textArea.setText(textArea.getText()+"\n"+"Mouse is Entered ");
	}
	@Override
	public void mouseExited(MouseEvent e)
	{
		textArea.setText(textArea.getText()+"\n"+"Mouse is Exited ");
	}
	@Override
	public void mousePressed(MouseEvent e)
	{
		textArea.setText(textArea.getText()+"\n"+"Mouse is Pressed ");
	}
	@Override
	public void mouseClicked(MouseEvent e)
	{
		textArea.setText(textArea.getText()+"\n"+"Mouse is Clicked ");
	}
	@Override
	public void mouseReleased(MouseEvent e)
	{
		textArea.setText(textArea.getText()+"\n"+"Mouse is Released ");
	}

}


class GUI26
{
	public static void main(String[] args) 
	{
		MyFrame jf=new MyFrame();
		jf.setTitle("GUI26 PROGRAM");
		jf.setSize(650,400);
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);		
		jf.setVisible(true);
	}
		
}