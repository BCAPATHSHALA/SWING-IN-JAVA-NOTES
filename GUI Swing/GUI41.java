// PROGRAM:41 ADVANCED TOPIC:01 JOptionPane (Confirm Dialog)
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI41
{
	public static void main(String[] args) {
		JFrame jf=new JFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("GUI41 PROGRAM");
		jf.setSize(650,400);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);

		Container c=jf.getContentPane();
		c.setLayout(new FlowLayout());

		JButton button1=new JButton("CLICK1");
		JButton button2=new JButton("CLICK2");
		JButton button3=new JButton("CLICK3");
		c.add(button1);
		c.add(button2);
		c.add(button3);
		
		button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				int sel=JOptionPane.showConfirmDialog
				(jf,"Are you exit?","Select an Option",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
				if(sel==JOptionPane.YES_OPTION)
				{
					System.out.print("YES");
					System.exit(0);
				}
				else if(sel==JOptionPane.NO_OPTION)
				{
					System.out.print("NO");
				}
				else
				{
					System.out.print("CANCEL");
				}
			}
		});

		button2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showConfirmDialog
				(jf,"Are you sure?","Select an Option",JOptionPane.NO_OPTION,JOptionPane.WARNING_MESSAGE);
			
			}
		});

		button3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showConfirmDialog
				(jf,"Are you sure?","Select an Option",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
			}
		});
 
		jf.setVisible(true);
	}
}

 