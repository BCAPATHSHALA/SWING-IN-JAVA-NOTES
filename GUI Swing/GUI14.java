// Program: 14 JCheckBox
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GUI14
{
	public static void main(String[] args) 
	{
	 	JFrame jf=new JFrame("GUI14 PROGRAM");
	 	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(500,300,600,400);
		jf.setResizable(false);	

		Container c=jf.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.BLACK);

		JCheckBox high=new JCheckBox("High School");
		JCheckBox inter=new JCheckBox("Intermediate");
		JCheckBox grad=new JCheckBox("Graduation");
		JCheckBox pg=new JCheckBox("Post-Graduation");

		c.add(high);
		c.add(inter);
		c.add(grad);
		c.add(pg);

		high.setBounds(100,50,200,20);
		inter.setBounds(100,100,200,20);
		grad.setBounds(100,150,200,20);
		pg.setBounds(100,200,200,20);

		Font font=new Font("Arial",Font.ITALIC,20);
		high.setFont(font);
		inter.setFont(font);
		grad.setFont(font);
		pg.setFont(font);

		high.setForeground(Color.RED);
		inter.setForeground(Color.GREEN);
		grad.setForeground(Color.YELLOW);
		pg.setForeground(Color.WHITE);

		high.setBackground(Color.BLACK);
		inter.setBackground(Color.BLACK);
		grad.setBackground(Color.BLACK);
		pg.setBackground(Color.BLACK);

		// how to disabl the checkbox
		pg.setEnabled(false);

		// How to create already selected checkbox
		high.setSelected(true);


		jf.setVisible(true);
	}
}
