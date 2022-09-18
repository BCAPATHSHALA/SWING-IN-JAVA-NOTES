// Program: 30 WindowListner that support Window components
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.io.*;


class MyFrame extends JFrame implements WindowListener
{

	public MyFrame()
	{

		this.addWindowListener(this);

	}

	@Override
	public void windowOpened(WindowEvent e)
	{
		System.out.println("Window opened");
	}
	public void windowClosing(WindowEvent e)
	{
		System.out.println("Window is closing");
	}
	public void windowClosed(WindowEvent e)
	{
		System.out.println("Window closed");
	}
	public void windowIconified(WindowEvent e)
	{
		System.out.println("Window iconified");
	}
	public void windowDeiconified(WindowEvent e)
	{
		System.out.println("Window deiconified");
	}
	public void windowActivated(WindowEvent e)
	{
		System.out.println("Window activated");
	}
	public void windowDeactivated(WindowEvent e)
	{
		System.out.println("Window deactivated");
	}
}


class GUI30
{
	public static void main(String[] args) 
	{
		MyFrame jf=new MyFrame();
		jf.setTitle("GUI30 PROGRAM");
		jf.setSize(650,400);
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);		
		jf.setVisible(true);
	}
		
}