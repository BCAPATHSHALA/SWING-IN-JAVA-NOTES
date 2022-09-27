// PROGRAM:55 ADVANCED TOPIC:13 JDesktopPane
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.lang.*;
import javax.swing.event.*;

public class GUI55 extends JFrame
{
	private JDesktopPane desktop;
	public GUI55()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GUI55 PROGRAM");
		setSize(650,400);
		setLocationRelativeTo(null);
		setResizable(false);

		desktop=new JDesktopPane();
		add(desktop, BorderLayout.CENTER);
		desktop.setBackground(Color.GREEN);

		display(desktop);
				
		setVisible(true);
		validate();
	}

	private void display(JDesktopPane desktop)
	{
		int numFrame=3, x=30,y=30;
		for (int i=0;i<=numFrame;i++) 
		{
			JInternalFrame iFrame=new JInternalFrame("Internal Frame"+(i+1),true,true,true,true);
			iFrame.setBounds(x,y,250,100);
			iFrame.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
			iFrame.add(new JLabel("Java lover"));
			iFrame.setVisible(true);

			desktop.add(iFrame);
		}
	}

	public static void main(String[] args) 
	{
		new GUI55();
	}
} 