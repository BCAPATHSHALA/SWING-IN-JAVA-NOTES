// PROGRAM:69 ADVANCED TOPIC:25 JColorChooser
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.lang.*;
import javax.swing.event.*;

public class GUI69
{
	public static void main(String[] args) 
	{
		JFrame frame=new JFrame("GUI69 PROGRAM");
		frame.setSize(600,450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);

		final Container c=frame.getContentPane();
		c.setLayout(new GridBagLayout());

		JButton button1=new JButton("Change Color");
		c.add(button1);

		frame.setVisible(true);
		frame.revalidate();

		button1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				Color color=JColorChooser.showDialog(null,"Select a color",Color.black);
				c.setBackground(color);
			}
		});

	}
}