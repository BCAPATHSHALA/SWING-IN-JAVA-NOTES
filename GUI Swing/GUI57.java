// PROGRAM:57 ADVANCED TOPIC:15 JToggleButton
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.lang.*;
import javax.swing.event.*;

public class GUI57 extends JFrame implements ActionListener
{
	private Color defaultColor;
	private JToggleButton toggle;
	private Container c;
	public GUI57()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GUI57 PROGRAM");
		setSize(650,400);
		setLocationRelativeTo(null);
		setResizable(false);

		c=this.getContentPane();
		c.setLayout(null);

		toggle=new JToggleButton("OFF");
		c.add(toggle);
		toggle.setBounds(280,150,100,45);

		// defaultColor = c.getBackground();
		
		toggle.addActionListener(this);

		setVisible(true);
		validate();
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(toggle.isSelected())
		{
			//ON state
			c.setBackground(Color.RED);
			toggle.setText("ON");
			toggle.setBackground(Color.YELLOW);
			toggle.setForeground(Color.BLACK);
		}
		else
		{
			//OFF state
			c.setBackground(Color.YELLOW);
			toggle.setText("OFF");
			toggle.setBackground(Color.RED);
			toggle.setForeground(Color.WHITE);
		}
	}

	public static void main(String[] args) 
	{
		new GUI57();
	}
} 