// Program: 12 JTextArea
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class GUI12
{
	public static void main(String[] args) 
	{
	 	JFrame jf=new JFrame("GUI12 PROGRAM");
	 	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(500,300,600,400);
		jf.setResizable(false);	

		Container c=jf.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.RED);

		JTextArea textArea=new JTextArea("Write your message....");
		c.add(textArea);
		textArea.setBounds(100,50,300,200);

		Font font=new Font("Arial",Font.ITALIC,10);
		textArea.setFont(font);

		textArea.setEnabled(true); // Text area is blocked when value: false
		textArea.setLineWrap(true); // Wraping the text to next line when value: true




		jf.setVisible(true);
	}
}
