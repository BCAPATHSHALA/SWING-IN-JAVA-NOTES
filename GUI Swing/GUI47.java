// PROGRAM:47 ADVANCED TOPIC:05 JPopupMenu
// how to create a simple PopupMenu EXAMPLE: WINDOW REFRESH BUTTON
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.lang.*;

public class GUI47 extends JFrame implements ActionListener
{
	private JPopupMenu pm;
	private JMenuItem m1, m2, m3;
	public GUI47()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GUI47 PROGRAM");
		setSize(650,400);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(new FlowLayout());
		

		pm=new JPopupMenu();
		m1=new JMenuItem("item1");
		m2=new JMenuItem("item2");
		m3=new JMenuItem("item3");

		pm.add(m1);
		pm.add(m2);
		pm.add(m3);

		this.add(pm);

		// show the JPopupMenu to specified location by show(Frame,x,y)
		// pm.show(this,200,200);

		this.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e)
			{
				if(e.getButton()==MouseEvent.BUTTON3)
				{
					int x=e.getX();
					int y=e.getY();
					pm.show(GUI47.this, x,y);
				}
			}
		});

		m1.addActionListener(this);
		m2.addActionListener(this);
		m3.addActionListener(this);

		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==m1)
		{
			System.out.print("Item1 clicked");
		}
		else if(e.getSource()==m2)
		{
			System.out.print("Item2 clicked");
		}
		else
		{
			System.out.print("Item3 clicked");
		}
	}
 
	public static void main(String[] args) 
	{
		GUI47 jf=new GUI47();
	}
}

 