// PROGRAM:54 ADVANCED TOPIC:12 JInternalFrame
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.lang.*;
import javax.swing.event.*;

public class GUI54 extends JFrame
{
	public GUI54()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GUI54 PROGRAM");
		setSize(650,400);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);

		JInternalFrame iFrame=new JInternalFrame("My Internal Frame",true,true,true,true);
		add(iFrame);
		initFrame(iFrame);

		
		setVisible(true);
		validate();
	}
	private void initFrame(JInternalFrame iFrame)
	{
		iFrame.setBounds(50,20,300,200);
		iFrame.setResizable(false);
		iFrame.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
		iFrame.setBackground(Color.YELLOW);
		iFrame.setVisible(true);
	}

	public static void main(String[] args) 
	{
		new GUI54();
	}
} 