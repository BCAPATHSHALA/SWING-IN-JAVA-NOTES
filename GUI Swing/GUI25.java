// Program: 25 KeyListner that support every component
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


class MyFrame extends JFrame implements KeyListener
{
	private Container c;
	private JTextArea textArea;

	public MyFrame()
	{
		c=this.getContentPane();
		c.setLayout(null);

		textArea=new JTextArea("");
		c.add(textArea);
		textArea.setBounds(250,20,300,300);
		textArea.setBackground(Color.GREEN);

		textArea.addKeyListener(this);

	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		textArea.setText(textArea.getText()+"\n"+"Key is Pressed "+e.getKeyChar());
	}
	@Override
	public void keyTyped(KeyEvent e)
	{
		textArea.setText(textArea.getText()+"\n"+"Key is Typed "+e.getKeyChar());
	}
	@Override
	public void keyReleased(KeyEvent e)
	{
		textArea.setText(textArea.getText()+"\n"+"Key is Released "+e.getKeyChar());
	}

}


class GUI25
{
	public static void main(String[] args) 
	{
		MyFrame jf=new MyFrame();
		jf.setTitle("GUI25 PROGRAM");
		jf.setSize(650,400);
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);		
		jf.setVisible(true);
	}
		
}