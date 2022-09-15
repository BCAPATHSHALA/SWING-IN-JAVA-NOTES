// Program: 04 for JPasswordField class
package guiFolder;
import javax.swing.*;
import java.awt.*;

public class GUI4
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

		JPasswordField pf=new JPasswordField();
		c.add(pf); // contans the password field in container frame
		pf.setBounds(100,50,120,30);
		pf.setForeground(Color.RED); // set text froeground
		pf.setBackground(Color.YELLOW); // set text filed background

		Font font=new Font("Arial",Font.PLAIN, 30);
		pf.setFont(font);// set text font

		pf.setText("12345");// set text in password field
		pf.setEchoChar('*'); // set '*' in password field


		//How to hide/show password
		pf.setEchoChar((char)0); //show password
		
	}
}