// PROGRAM:39 ADVANCED TOPIC:01 JOptionPane (Input Dialog)
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI39
{
	public static void main(String[] args) {
		GUI39 obj=new GUI39();
		JFrame jf=new JFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("GUI39 PROGRAM");
		jf.setSize(650,400);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);

		Container c=jf.getContentPane();
		c.setLayout(null);

		JButton button1=new JButton("CLICK");
		c.add(button1);
		button1.setBounds(100,40,100,25);

		JTextArea l1=new JTextArea("");
		c.add(l1);
		l1.setBounds(100,80,400,40);
		
		button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				String str=JOptionPane.showInputDialog("Enter your name");
				if(str.length()>0)
				{
					// System.out.print("User Name: "+str);
					l1.setText(str);
				}
			}
		});

		jf.setVisible(true);
	}
}

 