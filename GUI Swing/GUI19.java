// Program: 19 ActionListner in a TextField by pressing enter
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


class MyFrame extends JFrame implements ActionListener
{
	Container c;
	JTextField t1;
	JButton button1;

	public MyFrame()
	{
		c=this.getContentPane();
		c.setLayout(null);

		t1=new JTextField("");
		c.add(t1);
		t1.setBounds(100,100,200,40);
		t1.setFont(new Font("Arial",Font.BOLD,20));

		button1=new JButton("RESET");
		c.add(button1);
		button1.setBounds(100,250,100,25);

		t1.addActionListener(this);
		button1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		String str=t1.getText();
		t1.setText(str.toUpperCase());

		if(e.getSource()==button1)
		{
			t1.setText("");
		}
	}

}


class GUI19
{
	public static void main(String[] args) 
	{
		MyFrame jf=new MyFrame();
		jf.setTitle("GUI19 PROGRAM");
		jf.setSize(650,400);
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);		
		jf.setVisible(true);
	}
		
}