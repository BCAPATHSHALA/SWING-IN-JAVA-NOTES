// PROGRAM:50 ADVANCED TOPIC:08 JSplitPane is used to divide a container into two parts
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.lang.*;

public class GUI50 extends JFrame
{
	public GUI50()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GUI50 PROGRAM");
		setSize(650,400);
		setLocationRelativeTo(null);
		setResizable(false);

		JSplitPane split=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);

		JButton button1=new JButton("Left");
		JButton button2=new JButton("Right");

		split.setTopComponent(button1);
		split.setBottomComponent(button2);

		split.setDividerSize(10);
		split.setDividerLocation(200);
		split.setOneTouchExpandable(true);

		add(split);



		setVisible(true);
		validate();
	}
 
	public static void main(String[] args) 
	{
		GUI50 jf=new GUI50();
	}
} 



