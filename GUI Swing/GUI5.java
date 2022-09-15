// Program: 05 for JButton class
package guiFolder;
import javax.swing.*;
import java.awt.*;

public class GUI5
{
	public static void main(String[] args) 
	{
		JFrame jf=new JFrame();
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(500,300,600,400);
		jf.setTitle("GUI3 PROGRAM");
		jf.setResizable(false);
		Container c= jf.getContentPane();
		c.setLayout(null);

		
		JButton button=new JButton();
		c.add(button); // contains the button in container frame
		button.setBounds(100,50,100,30);
		button.setForeground(Color.WHITE); // set text froeground
		button.setBackground(Color.RED); // set text filed background

		Font font=new Font("Arial",Font.BOLD, 20);
		button.setFont(font);// set text font

		button.setText("CLICK");// set text of button

		// Show cursor with hand when cursor the button
		Cursor cur=new Cursor(Cursor.HAND_CURSOR);
		button.setCursor(cur);

		button.setEnabled(true); // button disabled when value: false and by default button is enabled
		button.setVisible(true); // not show the button when value: false and by default buttun value is true

		// How to use image in button
		// ImageIcon icon=new ImageIcon("image/button.png");
		// JButton button=new JButton(icon);


	}
}