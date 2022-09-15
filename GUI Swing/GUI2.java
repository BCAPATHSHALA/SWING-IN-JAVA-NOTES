// Program: 02 for JLabel class
package guiFolder;
import javax.swing.*;
import java.awt.*;

public class GUI2
{
	public static void main(String[] args) 
	{
		JFrame jf=new JFrame();
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(500,300,600,400);
		jf.setTitle("GUI2 PROGRAM");
		jf.setResizable(false);
		Container c= jf.getContentPane();
		c.setLayout(null); // set default layout(float)

		// How to set text in JLabel
		JLabel label=new JLabel("User Name");
		c.add(label); // Show user name on the window
		label.setBounds(100,50,200,30); // set position and size of user name
		label.setText("Password"); // Change the user name to password
		
		Font font=new Font("Arial",Font.ITALIC,30); // change font of password
		label.setFont(font); // set font of password 	

		// How to use image in JLabel
		ImageIcon icon=new ImageIcon("image/java1.png");
		JLabel label1=new JLabel(icon);
		c.add(label1); // Show image on the window
		label1.setBounds(100,100,icon.getIconWidth(),icon.getIconHeight()); // set position and size of image

		// How to use both image and text in JLabel
		ImageIcon icon1=new ImageIcon("image/java1.png");
		JLabel label2=new JLabel("USER NAME",icon1,JLabel.LEFT);
		c.add(label2);
		label2.setBounds(100,200,500,100);

		

		


		
	}
}