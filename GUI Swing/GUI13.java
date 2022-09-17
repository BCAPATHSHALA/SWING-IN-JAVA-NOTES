// Program: 13 JRadioButton
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class GUI13
{
	public static void main(String[] args) 
	{
	 	JFrame jf=new JFrame("GUI13 PROGRAM");
	 	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(500,300,600,400);
		jf.setResizable(false);	

		Container c=jf.getContentPane();
		c.setLayout(null);

		JRadioButton male=new JRadioButton("Male");
		JRadioButton female=new JRadioButton("Female");
		JRadioButton general=new JRadioButton("General");
		JRadioButton obc=new JRadioButton("OBC");
		JRadioButton sc=new JRadioButton("SC");
		JRadioButton st=new JRadioButton("ST");

		c.add(male);
		c.add(female);
		c.add(general);
		c.add(obc);
		c.add(sc);
		c.add(st);

		male.setBounds(100,50,100,40);
		female.setBounds(220,50,100,40);
		general.setBounds(100,100,100,40);
		obc.setBounds(220,100,100,40);
		sc.setBounds(340,100,100,40);
		st.setBounds(460,100,100,40);

		Font font=new Font("Arial",Font.BOLD,10);
		Font font1=new Font("Arial",Font.PLAIN,8);
		male.setFont(font);
		female.setFont(font);
		general.setFont(font1);
		obc.setFont(font1);
		sc.setFont(font1);
		st.setFont(font1);

		// Select only one radio among these like: male, female
		ButtonGroup gender=new ButtonGroup();
		gender.add(male);
		gender.add(female);
		ButtonGroup category=new ButtonGroup();
		category.add(general);
		category.add(obc);
		category.add(sc);
		category.add(st);

		// How to create already selected radio buttons
		male.setSelected(true);
		general.setSelected(true);

		// How to disable the radio
		obc.setEnabled(false);


		


		jf.setVisible(true);
	}
}
