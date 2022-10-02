// PROGRAM:70 ADVANCED TOPIC:26 JComponent Graphics:01
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.lang.*;
import javax.swing.event.*;

public class GUI70 extends JComponent
{
	@Override
	protected void paintComponent(Graphics g)
	{
		g.setColor(Color.blue);
		g.fillRect(10,10,200,200); // make rectengular with blue color
	}


	public static void main(String[] args) 
	{
		JFrame frame=new JFrame("GUI70 PROGRAM");
		frame.setSize(600,450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		GUI70 comp=new GUI70();
		frame.getContentPane().add(comp); // add JComponent with the frame
	}
}