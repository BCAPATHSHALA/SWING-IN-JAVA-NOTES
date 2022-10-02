// PROGRAM:68 ADVANCED TOPIC:24 Glasspane
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.lang.*;
import javax.swing.event.*;

public class GUI68 
{
	public static void main(String[] args) 
	{
		JFrame frame=new JFrame("GUI68 PROGRAM");
		frame.setSize(600,450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);

		JPanel panel=new JPanel();
		final JLabel label=new JLabel("Glasspane Example");
		JButton button1=new JButton("Click me");
		JButton button2=new JButton("Show");

		panel.add(label);
		panel.add(button1);
		panel.add(button2);
		frame.getContentPane().add(panel);
		frame.setVisible(true);

		button1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				label.setVisible(!label.isVisible());
			}
		});

		// code for Glasspane visibility
		frame.setGlassPane(new JComponent(){
			@Override
			protected void paintComponent(Graphics g)
			{
				g.setColor(new Color(0,0,0,150));
				g.fillRect(0,0,getWidth(),getHeight());
			}
		});

		Container glassPane=(Container)frame.getGlassPane();
		glassPane.setVisible(true);
	}
}