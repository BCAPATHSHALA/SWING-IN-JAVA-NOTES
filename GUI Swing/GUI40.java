// PROGRAM:40 ADVANCED TOPIC:01 JOptionPane (Message Dialog)
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI40
{
	public static void main(String[] args) {
		JFrame jf=new JFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("GUI40 PROGRAM");
		jf.setSize(650,400);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);

		Container c=jf.getContentPane();
		c.setLayout(new FlowLayout());

		JButton button1=new JButton("CLICK1");
		JButton button2=new JButton("CLICK2");
		JButton button3=new JButton("CLICK3");
		JButton button4=new JButton("CLICK4");
		JButton button5=new JButton("CLICK5");
		c.add(button1);
		c.add(button2);
		c.add(button3);
		c.add(button4);
		c.add(button5);

		
		button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog
				(jf,"Hello","Message",JOptionPane.PLAIN_MESSAGE);
			}
		});

		button2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog
				(jf,"Information","Message",JOptionPane.INFORMATION_MESSAGE);
			}
		});

		button3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog
				(jf,"Question","Message",JOptionPane.QUESTION_MESSAGE);
			}
		});

		button4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog
				(jf,"Error","Message",JOptionPane.ERROR_MESSAGE);
			}
		});

		button5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog
				(jf,"Warning","Message",JOptionPane.WARNING_MESSAGE);
			}
		});

		jf.setVisible(true);
	}
}

 