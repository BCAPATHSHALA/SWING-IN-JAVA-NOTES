// PROGRAM:72 ADVANCED TOPIC:28 JViewport Graphics:03
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.lang.*;
import javax.swing.event.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class GUI72
{
	public static void main(String[] args) 
	{
		JFrame frame=new JFrame("GUI72 PROGRAM");
		frame.setSize(500,450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);

		ImageIcon icon=new ImageIcon("image//welcome.png");
		JLabel label=new JLabel(icon);
		JScrollPane sp=new JScrollPane(label);
		
		try
		{
			//Scroll panel ko remove karne ke liye code
			sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			sp.setVerticalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		}
		catch (IllegalArgumentException e) {
			
		}
		frame.add(sp);
		frame.setVisible(true);

		sp.setViewportBorder(BorderFactory.createLineBorder(Color.black));
		final JViewport viewport=sp.getViewport();
		JButton moveUp=new JButton("Move Up");
		JButton moveDown=new JButton("Move Down");
		JButton moveLeft=new JButton("Move Left");
		JButton moveRight=new JButton("Move Right");

		JPanel panel1=new JPanel();
		panel1.add(moveUp);
		panel1.add(moveDown);
		panel1.add(moveLeft);
		panel1.add(moveRight);
		frame.add(panel1,BorderLayout.NORTH);

		frame.revalidate();

		moveUp.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				Point origin=viewport.getViewPosition();
				Point newOrigin=new Point(origin.x, origin.y-100);
				viewport.setViewPosition(newOrigin);
			}
		});

		moveDown.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				Point origin=viewport.getViewPosition();
				Point newOrigin=new Point(origin.x, origin.y+100);
				viewport.setViewPosition(newOrigin);
			}
		});

		moveLeft.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				Point origin=viewport.getViewPosition();
				Point newOrigin=new Point(origin.x-100, origin.y);
				viewport.setViewPosition(newOrigin);
			}
		});

		moveRight.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				Point origin=viewport.getViewPosition();
				Point newOrigin=new Point(origin.x+100, origin.y);
				viewport.setViewPosition(newOrigin);
			}
		});



	} 
}