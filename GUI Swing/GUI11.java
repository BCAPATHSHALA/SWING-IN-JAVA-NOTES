// Program: 11 SIMPLE CALCULATOR
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


class MyFrame extends JFrame implements ActionListener
{
	private Container c;
	private JLabel label1, label2;
	private JTextField num1;
	private JTextField num2;
	private JButton add;
	private JButton div;
	private JButton multi;
	private JButton subt;
	private JLabel result;

	public MyFrame()
	{
		setTitle("SIMPLE CALCULATOR GUI11");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500,300,600,400);
		c=this.getContentPane();
		c.setLayout(null);

		label1= new JLabel("FIRST NUMBER");
		c.add(label1);
		label1.setBounds(100,50,100,20);

		label2=new JLabel("SECOND NUMBER");
		c.add(label2);
		label2.setBounds(100,100,100,20);

		num1=new JTextField();
		c.add(num1);
		num1.setBounds(250,50,100,20);

		num2=new JTextField();
		c.add(num2);
		num2.setBounds(250,100,100,20);

		add=new JButton("+");
		c.add(add);
		add.setBounds(100,150,100,20);

		subt=new JButton("-");
		c.add(subt);
		subt.setBounds(220,150,100,20);

		multi=new JButton("*");
		c.add(multi);
		multi.setBounds(100,200,100,20);

		div=new JButton("/");
		c.add(div);
		div.setBounds(220,200,100,20);

		result=new JLabel("Result");
		c.add(result);
		result.setBounds(100,250,400,50);


		add.addActionListener(this);
		subt.addActionListener(this);
		multi.addActionListener(this);
		div.addActionListener(this);
		setVisible(true);
	} 

	public void actionPerformed(ActionEvent e)
	{
		try
		{
			int a=Integer.parseInt(num1.getText());
			int b=Integer.parseInt(num2.getText());

			if(e.getSource()==add)
			{
				result.setText("SUM: "+(a+b));
			}
			else if(e.getSource()==subt)
			{
				result.setText("SUB: "+(a-b));
			}
			else if(e.getSource()==multi)
			{
				result.setText("MULT: "+(a*b));
			}
			else
			{
				result.setText("DIV: "+(a/b));
			}
		}
		catch(NumberFormatException s)
		{
			result.setText("INVALID INPUT");
		}
		catch(ArithmeticException n)
		{
			result.setText("Infinite ..");
		}


	}
}


public class GUI11
{
	public static void main(String[] args) 
	{
		MyFrame jf=new MyFrame();	
	}	
}