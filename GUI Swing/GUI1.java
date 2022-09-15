// Program: 01 for JFrame class
package guiFolder;
import javax.swing.*;
import java.awt.*;

public class GUI1
{
	public static void main(String[] args) 
	{
		JFrame jf=new JFrame();
		jf.setVisible(true);	// Show window on screen
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the window
		jf.setSize(600, 400); // Customize the size of window
		
		jf.setLocation(500,300); // Set lounch window on x and y coordinates
		// jf.setBounds(500,300,600,400);

		ImageIcon icon=new ImageIcon("image/java.png");// set image icon for window
		jf.setIconImage(icon.getImage());

		jf.setTitle("GUI1 PROGRAM");// set window title

		Container c= jf.getContentPane();// set background color for window
		//Color color=new Color(255,0,0);
		//c.setBackground(color);
		c.setBackground(Color.RED);

		// lock size of window
		jf.setResizable(false);


		
	}
}