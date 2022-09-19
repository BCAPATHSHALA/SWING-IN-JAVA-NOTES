// Program: 38 Layout Manager:07 BoxLayout
package guiFolder;
import javax.swing.*;
import java.awt.*;
//Note: import javax.swing.BoxLayout

public class GUI38
{
	public static void main(String[] args) {
		JFrame jf=new JFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("GUI38 PROGRAM");
		jf.setSize(650,400);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);

		Container c=jf.getContentPane();

		BoxLayout bl=new BoxLayout(c,BoxLayout.Y_AXIS);
		c.setLayout(bl);

		JButton button1=new JButton("BUTTON1");
		JButton button2=new JButton("BUTTON2");
		JButton button3=new JButton("BUTTON3");
		JButton button4=new JButton("BUTTON4");
		JButton button5=new JButton("BUTTON5");

		c.add(button1);
		c.add(button2);
		// Create the gap bw button2 and button3
		c.add(Box.createRigidArea(new Dimension(0,20)));
		c.add(button3);
		c.add(button4);
		c.add(button5);

		/*RIGHT 
		button1.setAlignmentX(c.RIGHT_ALIGNMENT);
		button2.setAlignmentX(c.RIGHT_ALIGNMENT);
		button3.setAlignmentX(c.RIGHT_ALIGNMENT);
		button4.setAlignmentX(c.RIGHT_ALIGNMENT);
		button5.setAlignmentX(c.RIGHT_ALIGNMENT);
		*/

		/* CENTER
		button1.setAlignmentX(c.CENTER_ALIGNMENT);
		button2.setAlignmentX(c.CENTER_ALIGNMENT);
		button3.setAlignmentX(c.CENTER_ALIGNMENT);
		button4.setAlignmentX(c.CENTER_ALIGNMENT);
		button5.setAlignmentX(c.CENTER_ALIGNMENT);
		*/

		// WAY02: CENTER
		button1.setAlignmentX(Component.CENTER_ALIGNMENT);
		button2.setAlignmentX(Component.CENTER_ALIGNMENT);
		button3.setAlignmentX(Component.CENTER_ALIGNMENT);
		button4.setAlignmentX(Component.CENTER_ALIGNMENT);
		button5.setAlignmentX(Component.CENTER_ALIGNMENT);
		



		jf.setVisible(true);
	}
}

 