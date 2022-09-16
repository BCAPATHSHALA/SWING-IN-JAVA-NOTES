// Program: 10 SIMPLE LOGIN FORM WITHOUT DATABASE
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class MyFrame extends JFrame implements ActionListener
{
	Container c;
	JLabel label1, label2;
	JTextField user;
	JPasswordField pass;
	JButton login;

	public MyFrame()
	{
		setTitle("LOGIN FORM GUI10");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500,300,600,400);
		c=this.getContentPane();
		c.setLayout(null);

		label1= new JLabel("USERNAME");
		c.add(label1);
		label1.setBounds(100,50,100,20);

		label2=new JLabel("PASSWORD");
		c.add(label2);
		label2.setBounds(100,100,100,20);

		user=new JTextField();
		c.add(user);
		user.setBounds(250,50,100,20);

		pass=new JPasswordField("****");
		c.add(pass);
		pass.setBounds(250,100,100,20);

		login=new JButton("LOGIN");
		c.add(login);
		login.setBounds(100,150,100,20);

		login.addActionListener(this);
		setVisible(true);
	} 

	public void actionPerformed(ActionEvent e)
	{
		System.out.println("USERNAME: "+user.getText());
		System.out.println("PASSWORD: "+pass.getText());
	}
}


public class GUI10
{
	public static void main(String[] args) 
	{
		MyFrame jf=new MyFrame();	
	}	
}