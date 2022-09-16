// Program: 06 for JButton Event part-1
// How to implement ActionListener in java Swing?
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class MyFrame extends JFrame implements ActionListener
{
	Container c;
	JButton button;

	MyFrame()
	{
		// Container c=this.getContentPane();
		c=this.getContentPane();
		c.setLayout(null);

		// Button code start
		// JButton button=new JButton();
		button=new JButton();
		c.add(button); 
		button.setBounds(100,50,100,30);
		button.setForeground(Color.WHITE); 
		button.setBackground(Color.RED); 

		Font font=new Font("Arial",Font.BOLD, 20);
		button.setFont(font);

		button.setText("CLICK");


		Cursor cur=new Cursor(Cursor.HAND_CURSOR);
		button.setCursor(cur);

		button.addActionListener(this);
		// Button Code End
	}
	// override the actionPerformed() method
	public void actionPerformed(ActionEvent e)
	{
		c.setBackground(Color.GREEN); 
	}
}


public class GUI6
{
	public static void main(String[] args) 
	{
		MyFrame jf=new MyFrame();
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(500,300,600,400);
		jf.setTitle("GUI6 PROGRAM");
		jf.setResizable(false);		
	}
}