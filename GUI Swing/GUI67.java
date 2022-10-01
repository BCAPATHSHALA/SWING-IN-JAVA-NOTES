// PROGRAM:67 ADVANCED TOPIC:23 JLayeredPane
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.lang.*;
import javax.swing.event.*;

public class GUI67 extends JFrame
{
	public GUI67()
	{
		setTitle("GUI67 PROGRAM");
		setSize(650,400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(null);

		JLayeredPane layeredPane=this.getLayeredPane();

		JButton button1=new JButton("RED");
		JButton button2=new JButton("GREEN");
		JButton button3=new JButton("BLUE");

		button1.setBackground(Color.RED);
		button2.setBackground(Color.GREEN);
		button3.setBackground(Color.BLUE);

		button1.setForeground(Color.WHITE);
		button2.setForeground(Color.WHITE);
		button3.setForeground(Color.WHITE);

		button1.setBounds(20,20,100,50);
		button2.setBounds(40,40,100,50);
		button3.setBounds(60,60,100,50);

		 /* Add components with the help of Layered Pane
		layeredPane.add(button1,new Integer(10)); // deprecated
		layeredPane.add(button2,new Integer(20));
		layeredPane.add(button3,new Integer(30));
		*/
		

		// Add components with the help of Layered Pane
		
		layeredPane.add(button1,layeredPane.PALETTE_LAYER);
		layeredPane.add(button2,layeredPane.MODAL_LAYER);
		layeredPane.add(button3,layeredPane.DRAG_LAYER);
		

		
		revalidate();
	}

	public static void main(String[] args) {
		new GUI67();
	}
}