// PROGRAM:43 ADVANCED TOPIC:03 JTabbedPane
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI43
{
	public static void main(String[] args) {
		JFrame jf=new JFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("GUI43 PROGRAM");
		jf.setSize(650,400);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);

		Container c=jf.getContentPane();
		c.setLayout(null);

		JTabbedPane tp=new JTabbedPane();
		c.add(tp);
		tp.setBounds(50,50,250,250);

		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		JPanel panel3=new JPanel();

		panel1.add(new JLabel("THIS IS MY FIRST PAGE"));
		panel2.add(new JLabel("THIS IS MY SECOND PAGE"));
		panel3.add(new JLabel("THIS IS MY THIRD PAGE"));

		tp.add("FIRST",panel1);
		tp.add("SECOND",panel2);
		tp.add("THIRD",panel3);


		
 
 
		jf.setVisible(true);
	}
}

 