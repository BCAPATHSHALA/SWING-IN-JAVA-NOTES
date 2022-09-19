// Program: 36 Layout Manager:05.1 JPanel Program
package guiFolder;
import javax.swing.*;
import java.awt.*;

public class GUI36
{
	public static void main(String[] args) {
		JFrame jf=new JFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("GUI36 PROGRAM");
		jf.setSize(650,400);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);

		Container c=jf.getContentPane();
		c.setLayout(null);

		JPanel jp=new JPanel();
		c.add(jp);
		jp.setLayout(null);
		jp.setBounds(0,0,300,200);
		jp.setBackground(Color.YELLOW);

		JPanel jp1=new JPanel();
		c.add(jp1);
		jp1.setBounds(335,0,300,200);
		jp1.setBackground(Color.RED);

		JPanel jp2=new JPanel();
		jp.add(jp2);
		jp2.setBounds(0,0,100,100);
		jp2.setBackground(Color.BLACK);

		JButton button1=new JButton("BUTTON1");
		jp1.add(button1);
		 

		JButton button2=new JButton("BUTTON2");
		jp.add(button2);
		button2.setBounds(100,0,100,25);


		jf.setVisible(true);
	}
}

 