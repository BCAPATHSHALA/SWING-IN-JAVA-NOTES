// Program: 37 Layout Manager:06 CardLayout
package guiFolder;
import javax.swing.*;
import java.awt.*;

public class GUI37
{
	public static void main(String[] args) {
		JFrame jf=new JFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("GUI37 PROGRAM");
		jf.setSize(650,400);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);

		Container c=jf.getContentPane();

		CardLayout cl=new CardLayout();
		c.setLayout(cl);

		JButton button1=new JButton("BUTTON1");
		JButton button2=new JButton("BUTTON2");
		JButton button3=new JButton("BUTTON3");
		JButton button4=new JButton("BUTTON4");

		c.add(button1,"id1");
		c.add(button2,"id2");
		c.add(button3,"id3");
		c.add(button4,"id4");

		cl.next(c); // Button2
		cl.previous(c); // Button1
		cl.first(c); // Button1
		cl.last(c); // Button4
		cl.show(c,"id2"); // Button2

		jf.setVisible(true);
	}
}

 